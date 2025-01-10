package Osc.example.Osc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "check_table")
public class CheckModel {

    @Id

    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;

}
