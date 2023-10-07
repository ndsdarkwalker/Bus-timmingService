package org.bus.response;

import lombok.Data;
import org.bus.dto.BusPositionDto;

import java.util.List;

@Data
public class BusPositionResponse {
    private List<BusPositionDto> payload;
    private int status;
}
