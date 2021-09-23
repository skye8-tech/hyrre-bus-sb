package com.skye8.elroykanye.hyrrebus.service.impl;

import com.skye8.elroykanye.hyrrebus.dto.request.BusRequest;
import com.skye8.elroykanye.hyrrebus.entity.Agency;
import com.skye8.elroykanye.hyrrebus.entity.Bus;
import com.skye8.elroykanye.hyrrebus.entity.BusSeat;
import com.skye8.elroykanye.hyrrebus.entity.enums.BusType;
import com.skye8.elroykanye.hyrrebus.repository.AgencyRepository;
import com.skye8.elroykanye.hyrrebus.repository.BusRepository;
import com.skye8.elroykanye.hyrrebus.repository.BusSeatRepository;
import com.skye8.elroykanye.hyrrebus.service.BusService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
@AllArgsConstructor
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;
    private final AgencyRepository agencyRepository;
    private final BusSeatRepository busSeatRepository;

    @Override
    public boolean addBus(BusRequest busRequest, String agencyName) {
        AtomicBoolean flag = new AtomicBoolean(false);
        Optional<Agency> agencyOptional = agencyRepository.findByAgencyName(agencyName);

        agencyOptional.ifPresentOrElse(
                agency -> {
                    Bus newBus = Bus.builder()
                            .busName(busRequest.getBusName())
                            .plateNumber(busRequest.getPlateNumber())
                            .busCapacity(calculateBusCapacity(busRequest.getColumnNumber(), busRequest.getRowNumber()))
                            .numberOfColumns(busRequest.getColumnNumber())
                            .numberOfRows(busRequest.getRowNumber())
                            .busType(getBusType(busRequest.getBusType()))
                            .agency(agency) // save the parent (Agency) reference
                            .build();

                    busRepository.save(newBus);

                    createBusSeats(newBus);

                    flag.set(true);
                },
                () -> {
                    flag.set(false);
                }
        ); return flag.get();
    }

    @Override
    public ResponseEntity<List<Bus>> getAllBusesByAgencyName(String agencyName) {
        Optional<Agency> agencyOptional = agencyRepository.findByAgencyName(agencyName);
        return agencyOptional.map(agency ->
                new ResponseEntity<>(agency.getBuses(), HttpStatus.FOUND)).
                orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    private void createBusSeats(Bus newBus) {
        // build bus seat object from new bus property values
        Integer numOfRows = newBus.getNumberOfRows();
        Integer numOfCols = newBus.getNumberOfColumns();
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                BusSeat busSeat = BusSeat.builder()
                        .seatLabel(String.valueOf(i).concat("-").concat(String.valueOf(j)))
                        .rowNumber(i)
                        .columnNumber(j)
                        .bus(newBus)
                        .build();
                busSeatRepository.save(busSeat);
            }
        }
    }


    private BusType getBusType(String busType) {
        return BusType.valueOf(busType.toLowerCase(Locale.ROOT));
    }

    private Integer calculateBusCapacity(Integer columnNumber, Integer rowNumber) {
        return columnNumber * rowNumber;
    }


}
