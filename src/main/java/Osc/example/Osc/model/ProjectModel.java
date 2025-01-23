package Osc.example.Osc.model;


import Osc.example.Osc.ProjectStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;




@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "project_table")
public class ProjectModel {


    @Id
    @Column(name = "projectId")
    private  String projectId;
    @Column(name = "projectName")
    private  String projectName;
    @Column(name = "projectType")
    private  String projectType;
    @Column(name = "clientId")
    private  String clientId;
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
