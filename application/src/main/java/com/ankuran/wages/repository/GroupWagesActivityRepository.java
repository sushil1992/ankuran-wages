package com.ankuran.wages.repository;

import com.ankuran.wages.model.GroupWagesActivityDao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
public interface GroupWagesActivityRepository extends JpaRepository<GroupWagesActivityDao, Long> {
    public GroupWagesActivityDao findByActorEmployeeIdAndCentreId(Long employeeId, Long centerId);
}
