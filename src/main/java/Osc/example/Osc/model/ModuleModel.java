package Osc.example.Osc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "module_table")
public class ModuleModel {
    @Id
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
    private Timestamp createdOn;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "updatedOn")
    private Timestamp updatedOn;
    @Column(name = "updatedBy")
    private String updatedBy;
}
