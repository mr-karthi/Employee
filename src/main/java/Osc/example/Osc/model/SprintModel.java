package Osc.example.Osc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sprintTable")
public class SprintModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sprintId")
    private  String sprintId;
    @Column(name = "sprintName")
    private  String sprintName;
    @Column(name = "description")
    private String description;
    @Column(name = "projectId")
    private String projectId;
    @Column(name = "status")
    private String status;
    @Column(name = "createdOn")
    private Date createdOn = new Date();
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "updatedOn")
    private Date updatedOn;
    @Column(name = "updatedBy")
    private String updatedBy;
}
