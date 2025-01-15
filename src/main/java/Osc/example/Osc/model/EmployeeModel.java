package Osc.example.Osc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employeeModel")
public class EmployeeModel {
    @Id
    @Column(name = "empId")
    private String empId;
    @Column(name = "empName")
    private String empName;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "deptId")
    private Long deptId;
    @Column(name = "reportingTo")
    private String reportingTo;
    @Column(name = "designation")
    private String designation;
    @Column(name = "imageName")
    private String imageName;
    @Column(name = "imageType")
    private String imageType;
    @Column(name = "status")
    private String status;
    @Column(name = "createdOn")
    private Timestamp createdOn;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "updatedOn")
    private Timestamp updatedOn;
    @Column(name = "updatedBy")
    private String updatedBy;
}
