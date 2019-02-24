package com.ankuran.wages.provider.impl;

import com.ankuran.wages.enums.ErrorCode;
import com.ankuran.wages.exception.base.InvalidRequestException;
import com.ankuran.wages.model.request.SampleRequest;
import com.ankuran.wages.provider.SampleService;
import org.springframework.stereotype.Service;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public void demoMethod(SampleRequest sampleRequest) {
        if (sampleRequest == null) {
            throw new InvalidRequestException("Sample request is null");
        }

        if (sampleRequest.getAmount() < 0) {
            throw new InvalidRequestException("Amount can't be less than 0", ErrorCode.INVALID_INPUT);
        }
    }
}
