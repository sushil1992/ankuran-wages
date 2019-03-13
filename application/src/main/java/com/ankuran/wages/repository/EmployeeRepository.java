package com.ankuran.wages.repository;

import com.ankuran.wages.model.CentreDao;
import com.ankuran.wages.model.EmployeeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDao, Long> {
    public EmployeeDao findByCenterIdAndAndFullName(Long centreId, String fullName);

}
