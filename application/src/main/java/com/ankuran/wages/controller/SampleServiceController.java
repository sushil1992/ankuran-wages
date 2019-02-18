package com.ankuran.wages.controller;

import com.ankuran.wages.model.request.SampleRequest;
import com.ankuran.wages.model.response.SampleResponse;
import com.ankuran.wages.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
@Controller
public class SampleServiceController {

    @Autowired
    private SampleService sampleService;


    @GetMapping("/sample")
    public ResponseEntity<SampleResponse> getSampleRequestObject(@RequestBody SampleRequest moneyRequest) {
        sampleService.demoMethod(moneyRequest);
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setSampleMessage("How's Josh,High Sir!!!");
        return new ResponseEntity<>(sampleResponse, HttpStatus.OK);
    }
}
