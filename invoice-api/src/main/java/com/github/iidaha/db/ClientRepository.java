package com.github.iidaha.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.iidaha.db.entity.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

}
