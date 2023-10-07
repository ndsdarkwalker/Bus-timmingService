package org.bus.response;

import lombok.Data;
import org.bus.dto.BusPosition;

import java.util.List;

@Data
public class BusPositionResponse {
    private List<BusPosition> payload;
    private int status;
}
