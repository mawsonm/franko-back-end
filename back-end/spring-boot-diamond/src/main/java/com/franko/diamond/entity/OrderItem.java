package com.franko.diamond.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="quantity")
    private int quantity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "detail_id")
    private ProductDetail product;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

}
