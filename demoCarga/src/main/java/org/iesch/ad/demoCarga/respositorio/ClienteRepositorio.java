package org.iesch.ad.demoCarga.respositorio;

import org.iesch.ad.demoCarga.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {


}