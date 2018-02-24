package com.github.iidaha.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.iidaha.db.entity.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Integer> {
    public InvoiceEntity save(InvoiceEntity e);

}
