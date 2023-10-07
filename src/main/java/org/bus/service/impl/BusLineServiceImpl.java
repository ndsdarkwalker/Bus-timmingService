package org.bus.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bus.exception.InternalServerException;
import org.bus.exception.ResourceNotFoundException;
import org.bus.response.BusLineResponse;
import org.bus.service.BusLineService;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BusLineServiceImpl implements BusLineService {

    @Override
    public BusLineResponse getBusLine() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BusLineResponse> responseEntity;
        try {
            String BUS_LINES_API_URL = "https://test.uwave.sg/busLines";
            responseEntity = restTemplate.exchange(
                    BUS_LINES_API_URL, HttpMethod.GET, null, BusLineResponse.class);
        } catch (RestClientException e) {
            throw new InternalServerException("Failed to fetch bus lines");
        }

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            return responseEntity.getBody();
        } else if (responseEntity.getStatusCode() == HttpStatus.NOT_FOUND) {
            throw new ResourceNotFoundException("Bus lines not found");
        } else {
            throw new InternalServerException("Failed to fetch bus lines");
        }
    }
}
