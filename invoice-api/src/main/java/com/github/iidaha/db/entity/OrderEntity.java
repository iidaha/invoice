package com.github.iidaha.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order")
public class OrderEntity extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderGenerator")
    @SequenceGenerator(name = "orderGenerator", initialValue = 50000, allocationSize = 1)
    @Column(name = "order_no")
    @NotNull
    private int orderNo;

    @Column(name = "client_no")
    @NotNull
    private int clientNo;

    @Column(name = "item_no")
    @NotNull
    private int itemNo;

    @Column(name = "item_name")
    @NotNull
    @Size(min = 0, max = 300)
    private String itemName;

    @Column(name = "item_type")
    @NotNull
    @Size(min = 0, max = 2)
    private String itemType;

    @Column(name = "item_price")
    @NotNull
    private int itemPrice;

    @Column(name = "item_count")
    @NotNull
    private int itemCount;

}
