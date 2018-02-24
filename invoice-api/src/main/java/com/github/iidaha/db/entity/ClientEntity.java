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
@Table(name = "client")
public class ClientEntity extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientGenerator")
    @SequenceGenerator(name = "clientGenerator", initialValue = 1000, allocationSize = 1)
    @Column(name = "client_no")
    @NotNull
    private int clientNo;

    @Column(name = "client_charge_last_name")
    @NotNull
    @Size(min = 0, max = 150)
    private String clientChargeLastName;

    @Column(name = "client_charge_first_name")
    @NotNull
    @Size(min = 0, max = 150)
    private String clientChargeFirstName;

    @Column(name = "client_name")
    @NotNull
    @Size(min = 0, max = 300)
    private String clientName;

    @Column(name = "client_address")
    @NotNull
    @Size(min = 0, max = 300)
    private String clientAddress;

    @Column(name = "client_tel")
    @NotNull
    @Size(min = 0, max = 150)
    private String clientTel;

    @Column(name = "client_fax")
    @Size(min = 0, max = 150)
    private String clientFax;

}
