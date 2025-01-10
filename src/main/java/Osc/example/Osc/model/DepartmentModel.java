package Osc.example.Osc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "department_table")
public class DepartmentModel {
    @Id
    @Column(name = "deptId")
    private Long deptId;
    @Column(name = "deptName")
    private String deptName;
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
