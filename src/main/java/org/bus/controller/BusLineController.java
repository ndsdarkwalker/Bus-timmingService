package org.bus.controller;

import org.bus.exception.InternalServerException;
import org.bus.exception.ResourceNotFoundException;
import org.bus.response.BusLineResponse;
import org.bus.response.ErrorResponse;
import org.bus.service.BusLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus-lines")
public class BusLineController {
    private final BusLineService busLineService;

    @Autowired
    public BusLineController(BusLineService busLineService) {
        this.busLineService = busLineService;
    }

    @GetMapping
    public ResponseEntity<?> getBusLines() {
        try {
            BusLineResponse busLines = busLineService.getBusLine();
            return ResponseEntity.ok(busLines);
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.notFound().build();
        } catch (InternalServerException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ErrorResponse(ex.getMessage()));
        }
    }
}
