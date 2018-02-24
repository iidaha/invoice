package com.github.iidaha.db.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.github.iidaha.model.InvoiceStatus;

import lombok.Data;

@Data
@Entity
@Table(name = "invoice")
public class InvoiceEntity extends AbstractEntity {
    @Id
    @Column(name = "invoice_no")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoiceGenerator")
    @SequenceGenerator(name = "invoiceGenerator", initialValue = 20000, allocationSize = 1)
    @Min(0)
    @NotNull
    private Integer invoiceNo;

    @Column(name = "client_no")
    @NotNull
    private int clientNo;

    @Column(name = "invoice_status")
    @NotNull
    private String invoiceStatus;

    @Column(name = "invoice_create_date")
    @NotNull
    private LocalDate invoiceCreateDate;

    @Column(name = "invoice_title")
    @Size(min = 0, max = 300)
    private String invoiceTitle;

    @Column(name = "invoice_amt")
    @NotNull
    private int invoiceAmt;

    @Column(name = "tax_amt")
    @NotNull
    private int taxAmt;

    @Column(name = "invoice_start_date")
    @NotNull
    private LocalDate invoiceStartDate;

    @Column(name = "invoice_end_date")
    @NotNull
    private LocalDate invoiceEndDate;

    @Column(name = "invoice_note")
    @Size(min = 0, max = 3000)
    private String invoiceNote;

    @Column(name = "create_user")
    @NotNull
    private String createUser;

    @Column(name = "update_user")
    @NotNull
    private String updateUser;

    @PrePersist
    public void onPrePersist() {
        setInvoiceStatus(InvoiceStatus.NEW.name());
    }

}
