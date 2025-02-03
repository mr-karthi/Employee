package Osc.example.Osc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "productTable")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1)
    @Column(name = "productId" , nullable = false, unique = true, length = 10)
    private  String productId;
    @Column(name = "productName", nullable = false, unique = true, length = 200)
    private  String productName;
    @Column(name = "description", nullable = false,columnDefinition = "TEXT")
    private  String description;
    @Column(name = "clientId", nullable = false,unique = true,length = 10)
    private  String clientId;
    @Column(name = "status", nullable = false,length = 20)
    private  String status;
    @Column(name = "createdOn", nullable = false)
    private Date createdOn;
    @Column(name = "createdBy", nullable = false, length = 10)
    private String createdBy;
    @Column(name = "updatedOn")
    private Date updatedOn;
    @Column(name = "updatedBy", length = 200)
    private String updatedBy;

}
