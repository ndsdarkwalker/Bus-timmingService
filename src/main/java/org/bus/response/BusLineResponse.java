package org.bus.response;

import lombok.Data;
import org.bus.dto.BusLine;

import java.util.List;

@Data
public class BusLineResponse {
    private List<BusLine> payload;
    private int status;
}
