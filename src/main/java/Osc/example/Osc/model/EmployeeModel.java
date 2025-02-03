package Osc.example.Osc.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employeeTable")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Date createdOn;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "updatedOn")
    private Date updatedOn;
    @Column(name = "updatedBy")
    private String updatedBy;
}
