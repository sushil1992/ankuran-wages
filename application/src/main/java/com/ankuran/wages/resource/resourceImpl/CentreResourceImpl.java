package com.ankuran.wages.resource.resourceImpl;

import com.ankuran.wages.model.response.CentreResponseDTO;
import com.ankuran.wages.provider.CentreProvider;
import com.ankuran.wages.resource.CentreResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
public class CentreResourceImpl implements CentreResource {

    @Autowired
    private CentreProvider centreProvider;

    @Override
    public ResponseEntity getCentreId(String centreName) {
        CentreResponseDTO centreResponseDTO = centreProvider.fetchCentreByName(centreName);

        if (centreResponseDTO != null && centreResponseDTO.getId() != null) {
            return new ResponseEntity<CentreResponseDTO>(centreResponseDTO, HttpStatus.OK);
        }
        return new ResponseEntity<CentreResponseDTO>(HttpStatus.NO_CONTENT);
    }
}
