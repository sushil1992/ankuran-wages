package com.ankuran.wages.controller;

import com.ankuran.wages.model.response.SampleResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
@Controller
public class HealthController {

    /**
     * Sample code for a controller
     *
     * @return
     */
    @GetMapping("/status")
    public ResponseEntity<HttpStatus> getStatus() {
        //Creating sample request object
        SampleResponse sampleResponse = new SampleResponse();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
