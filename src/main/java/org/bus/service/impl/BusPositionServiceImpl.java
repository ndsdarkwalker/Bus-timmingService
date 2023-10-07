package org.bus.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bus.exception.InternalServerException;
import org.bus.exception.ResourceNotFoundException;
import org.bus.response.BusPositionResponse;
import org.bus.service.BusPositionService;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BusPositionServiceImpl implements BusPositionService {

    public BusPositionResponse getBusPositions(String busLineId) {
        String BUS_POSITIONS_API_URL = "https://test.uwave.sg/busPositions/";
        String apiUrl = BUS_POSITIONS_API_URL + busLineId;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BusPositionResponse> responseEntity;
        try {
            responseEntity = restTemplate.exchange(
                    apiUrl, HttpMethod.GET, null, BusPositionResponse.class);
        } catch (RestClientException e) {
            throw new InternalServerException("Failed to fetch bus positions");
        }

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            return responseEntity.getBody();
        } else if (responseEntity.getStatusCode() == HttpStatus.NOT_FOUND) {
            throw new ResourceNotFoundException("Bus positions not found for bus line ID: " + busLineId);
        } else {
            throw new InternalServerException("Failed to fetch bus positions");
        }
    }
}
