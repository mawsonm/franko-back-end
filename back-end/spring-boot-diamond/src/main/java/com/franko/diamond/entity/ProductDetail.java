package com.franko.diamond.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product_detail")
@Data
public class ProductDetail {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="detail_id")
    private Long detailId;

    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

    @Column(name="size")
    private String size;

    @Column(name="color")
    private String color;

    @Column(name="units_in_stock")
    private int unitsInStock;

    @Column(name="image_url1")
    private String imageUrl1;

    @Column(name="image_url2")
    private String imageUrl2;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name="last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
