package com.ankuran.wages.controller;

import com.ankuran.wages.model.SampleRequest;
import com.ankuran.wages.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
@Controller
public class SampleServiceController {

    @Autowired
    private SampleService sampleService;


    @GetMapping("/sample")
    public ResponseEntity<SampleRequest> getSampleRequestObject() {
        sampleService.demoMethod();
        SampleRequest sampleRequest = new SampleRequest();
        sampleRequest.setSampleMessage("How's Josh,High Sir!!!");
        return new ResponseEntity<>(sampleRequest, HttpStatus.OK);
    }
}
