package org.bus.response;

import lombok.Data;
import org.bus.dto.BusLineDto;

import java.util.List;

@Data
public class BusLineResponse {
    private List<BusLineDto> payload;
    private int status;
}
