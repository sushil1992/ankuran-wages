package com.ankuran.wages.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
@Controller
public interface HealthController {

    @GetMapping("/applicationstatus")
    public ResponseEntity getApplicationStatus();
}
