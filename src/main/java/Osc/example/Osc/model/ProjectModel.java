package Osc.example.Osc.model;


import Osc.example.Osc.ProjectStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Timestamp;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "project_table")
public class ProjectModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId")
    private  String projectId;
    @Column(name = "projectName")
    private  String projectName;
    @Column(name = "projectType")
    private  String projectType;
    @Column(name = "clientId")
    private  String clientId;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private String status;
    @Column(name = "createdOn")
    private Date createdOn ;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "updatedOn")
    private Date updatedOn;
    @Column(name = "updatedBy")
    private String updatedBy;
}
