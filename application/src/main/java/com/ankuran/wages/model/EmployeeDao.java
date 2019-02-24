package com.ankuran.wages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
@Entity
@Table(name = "employee")
public class EmployeeDao {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "mobile")
    private String mobileNo;

    @Column(name = "joining_time")
    private Date joiningTime;

    @Column(name = "spouse_full_name")
    private String spouseFullName;

    @Column(name = "spouse_employee_id")
    private String spouseEmployeeId;

    @Column(name = "centre")
    private Long centerId;

    @Column(name = "status")
    private Byte status;

}
