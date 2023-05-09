package com.bwk.desafio_crud_clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bwk.desafio_crud_clientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
