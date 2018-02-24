package com.github.iidaha.db;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.iidaha.db.entity.InvoiceEntity;
import com.github.iidaha.model.Client;
import com.github.iidaha.model.Invoice;
import com.github.iidaha.model.InvoiceAmount;
import com.github.iidaha.model.InvoiceDetail;
import com.github.iidaha.model.InvoiceProperty;
import com.github.iidaha.model.InvoiceStatus;

@Service
public class RemoteInvoice {
    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ClientRepository clientRepository;

    public List<Invoice> fetchAll() {
        return invoiceRepository.findAll().stream().map(this::toInvoice).collect(Collectors.toList());
    }

    public Invoice fetch(Integer invoiceId) {
        return Optional.ofNullable(invoiceId).map(invoiceRepository::findOne).map(this::toInvoice).orElse(null);
    }

    public Invoice create(String userId, int clientId, InvoiceDetail invoiceDetail) {
        InvoiceEntity entity = toEntity(userId, clientId, invoiceDetail);
        entity.setCreateUser(userId);
        entity.setUpdateUser(userId);

        InvoiceEntity savedEntity = invoiceRepository.save(entity);
        return toInvoice(savedEntity);
    }

    public Invoice update(int invoiceNo, String status, String userId, int clientId, InvoiceDetail invoiceDetail) {
        InvoiceEntity entity = toEntity(userId, clientId, invoiceDetail);
        entity.setInvoiceNo(invoiceNo);
        entity.setInvoiceStatus(status);
        InvoiceEntity savedEntity = invoiceRepository.save(entity);
        return toInvoice(savedEntity);
    }

    private Invoice toInvoice(InvoiceEntity entity) {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNo(entity.getInvoiceNo());
        invoice.setInvoiceStatus(InvoiceStatus.fromValue(entity.getInvoiceStatus()));

        InvoiceDetail detail = new InvoiceDetail();
        detail.setInvoiceTitle(entity.getInvoiceTitle());
        detail.setInvoiceNote(entity.getInvoiceNote());
        detail.setInvoiceStartDate(entity.getInvoiceStartDate());
        detail.setInvoiceEndDate(entity.getInvoiceEndDate());
        detail.setInvoiceCreateDate(entity.getCreateDatetime().toLocalDate());
        invoice.setDetail(detail);

        InvoiceAmount amount = new InvoiceAmount();
        amount.setInvoiceAmt(8);
        amount.setTaxAmt(1);
//        amount.setInvoiceAmt(entity);
//        amount.setTaxAmt();
        invoice.setAmount(amount);

        Client client = new Client();
        client.setClientNo(entity.getClientNo());
        client.setClientChargeFirstName("first");
        client.setClientChargeLastName("last");
//        client.setClientNo(clientNo);
//        client.setClientChargeFirstName(clientChargeFirstName);
//        client.setClientChargeLastName(clientChargeLastName);
        invoice.setClient(client);

        InvoiceProperty property = new InvoiceProperty();
        property.setCreateUser(entity.getCreateUser());
        property.setCreateDatetime(entity.getCreateDatetime());
        property.setUpdateUser(entity.getUpdateUser());
        property.setUpdateDatetime(entity.getUpdateDatetime());
        invoice.setProperty(property);

        return invoice;
    }

    private InvoiceEntity toEntity(String userId, int clientId, InvoiceDetail detail) {
        InvoiceEntity entity = new InvoiceEntity();
        entity.setInvoiceTitle(detail.getInvoiceTitle());
        entity.setInvoiceNote(detail.getInvoiceNote());
        entity.setInvoiceStartDate(detail.getInvoiceStartDate());
        entity.setInvoiceEndDate(detail.getInvoiceEndDate());
        entity.setInvoiceCreateDate(detail.getInvoiceCreateDate());

        entity.setInvoiceAmt(100);
        entity.setTaxAmt(8);

        entity.setClientNo(clientId);

        return entity;
    }

}
