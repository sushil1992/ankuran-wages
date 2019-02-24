package com.ankuran.wages.provider;

import com.ankuran.wages.model.request.SampleRequest;
import com.ankuran.wages.model.response.CentreResponseDTO;

public interface CentreProvider {

    public CentreResponseDTO fetchCentreByName(String centreName);
}
