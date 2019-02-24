package com.ankuran.wages.resourceImpl;

import com.ankuran.wages.model.CentreDao;
import com.ankuran.wages.repository.CenterRepository;
import com.ankuran.wages.repository.EmployeeRepository;
import com.ankuran.wages.resource.CentreResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
public class CentreResourceImpl implements CentreResource {

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity getCentreId(String centreName) {
        CentreDao centreDao = centerRepository.findByName(centreName);

        if (centreDao != null && centreDao.getId() != null) {
            return new ResponseEntity<CentreDao>(centreDao, HttpStatus.OK);
        }
        return new ResponseEntity<CentreDao>(HttpStatus.NO_CONTENT);
    }
}
