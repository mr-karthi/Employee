package Osc.example.Osc.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "employee_details_table")
public class EmployeeModel {

    @Id
    @Column(name = "empId")
    private Long empId;
    @Column(name = "empName")
    private String empName;
    @Column(name = "empRole")
    private Long empRole;
    @Column(name = "email")
    private String email;
    @Column(name = "designation")
    private String designation;
    @Column(name = "reportingTo")
    private String reportingTo;
    @Column(name = "yearsOfExperience")
    private Integer yearsOfExperience;
    @Column(name = "empType")
    private String empType;
    @Column(name = "depId")
    private Integer depId;
    @Column(name = "joinedOn")
    private Date joinedOn;
    @Column(name = "gender")
    private String gender;
    @Column(name = "bloodGroup")
    private String bloodGroup;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "community")
    private String community;
    @Column(name = "religion")
    private String religion;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "aadharNumber")
    private String aadharNumber;
    @Column(name = "createdOn")
    private Date createdOn;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "imageType")
    private String imageType;
    @Column(name = "imageOn")
    private String imageOn;
    @Column(name = "updationOn")
    private String updationOn;
    @Column(name = "updationBy")
    private String updationBy;
    @Column(name = "phoneNumber")
    private Long phoneNumber;
    @Column(name = "eme_name1")
    private String emeName1;
    @Column(name = "relationShip1")
    private String relationShip1;
    @Column(name = "eme_email1")
    private String emeEmail1;
    @Column(name = "eme_phone_no1")
    private Long emePhoneNo1;
    @Column(name = "eme_name2")
    private String emeName2;
    @Column(name = "relationShip2")
    private String relationShip2;
    @Column(name = "eme_email2")
    private String emeEmail2;
    @Column(name = "eme_phone_no2")
    private Long emePhoneNo2;

}