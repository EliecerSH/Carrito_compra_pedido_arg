package com.arg.crud.repository;
import com.arg.crud.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {
}
