package Osc.example.Osc.model;


import jakarta.persistence.*;
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
    @Lob
    @Column(name = "image")
    private byte[] image;


    public CheckModel(String filename, String contentType, byte[] bytes) {
    }
}
