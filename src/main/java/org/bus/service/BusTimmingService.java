package org.bus.service;

import org.bus.response.BusTimmingResponse;

public interface BusTimmingService {
    BusTimmingResponse getBusTimming(String busName);
}
