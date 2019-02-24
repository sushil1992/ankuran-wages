package com.ankuran.wages.repository;

import com.ankuran.wages.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
@Repository
public interface CenterRepository extends JpaRepository<Centre, Long> {
}
