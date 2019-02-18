package com.ankuran.wages.service.impl;

import com.ankuran.wages.service.SampleService;
import org.springframework.stereotype.Service;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public void demoMethod() {
        System.out.println("Demo method");
    }
}
