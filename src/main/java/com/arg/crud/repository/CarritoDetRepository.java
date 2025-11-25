package com.arg.crud.repository;
import com.arg.crud.model.Carrito_detalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoDetRepository extends JpaRepository<Carrito_detalle, Integer> {
}
