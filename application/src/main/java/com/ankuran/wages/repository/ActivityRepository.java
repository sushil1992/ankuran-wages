package com.ankuran.wages.repository;

import com.ankuran.wages.model.ActivityDao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
public interface ActivityRepository extends JpaRepository<ActivityDao, Long> {
    public ActivityDao findByActorEmployeeIdAndCentreId(Long employeeId, Long centerId);
}
