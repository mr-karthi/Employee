package Osc.example.Osc.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.expression.spel.ast.Assign;


import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "taskTable")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskId")
    private String taskId;
    @Column(name = "taskName")
    private String taskName;
    @Column(name = "sprintId")
    private String sprintId;
    @Column(name = "module")
    private String module;
    @Column(name = "layer")
    private String layer;
    @Column(name = "assignTo")
    private String assignTo;
    @Column(name = "eta")
    private Date eta;
    @Column(name = "description")
    private String description;
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
