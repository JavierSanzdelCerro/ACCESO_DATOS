package org.iesch.ad.demoCarga.respositorio;

import org.iesch.ad.demoCarga.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRespositorio extends JpaRepository<Pedido, Long> {


}
