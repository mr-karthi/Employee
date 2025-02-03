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
@Table(name = "module_table")
public class ModuleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "moduleId")
    private  String moduleId;
    @Column(name = "moduleName")
    private  String moduleName;
    @Column(name = "description")
    private  String description;
    @Column(name = "projectId")
    private  String projectId;
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
