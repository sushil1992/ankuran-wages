package com.ankuran.wages.resource.resourceImpl;

import com.ankuran.wages.resource.HealthController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
@Component
public class HealthControllerImpl implements HealthController {
    @Override
    public ResponseEntity getApplicationStatus() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
