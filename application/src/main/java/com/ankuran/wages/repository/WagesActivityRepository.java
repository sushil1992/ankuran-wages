package com.ankuran.wages.repository;

import com.ankuran.wages.model.WagesActivityDao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sushil Mittal.
 * @Created At 12/03/19.
 */
public interface WagesActivityRepository extends JpaRepository<WagesActivityDao, Long> {
}
