package org.bus.service;

import org.bus.response.BusPositionResponse;

public interface BusPositionService {
    BusPositionResponse getBusPositions(String busLineId);
}
