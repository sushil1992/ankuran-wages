package com.ankuran.wages.provider.impl;

import com.ankuran.wages.mapper.CentreMapper;
import com.ankuran.wages.model.CentreDao;
import com.ankuran.wages.model.request.SampleRequest;
import com.ankuran.wages.model.response.CentreResponseDTO;
import com.ankuran.wages.provider.CentreProvider;
import com.ankuran.wages.repository.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CentreProviderImpl implements CentreProvider {

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private CentreMapper centreMapper;

    @Override
    public CentreResponseDTO fetchCentreByName(String centreName) {
        CentreDao centreDao = centerRepository.findByName(centreName);
        CentreResponseDTO centreDTO = centreMapper.mapCentreDaoToDTO(centreDao);
        return centreDTO;
    }
}
