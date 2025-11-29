package com.arg.crud.controller;
import com.arg.crud.model.Carrito;
import com.arg.crud.model.Carrito_detalle;
import com.arg.crud.repository.CarritoDetRepository;
import com.arg.crud.repository.CarritoRepository;
import com.arg.crud.repository.MetodosPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/carrito")
@CrossOrigin("*")
public class CarritoController {

    @Autowired
    private CarritoRepository carRepo;
    private CarritoDetRepository carDetRepo;


    public CarritoController(CarritoRepository carRepo, CarritoDetRepository carDetRepo) {
        this.carRepo = carRepo;
        this.carDetRepo = carDetRepo;
    }

    //-----------------------------metodos de carrito-----------------------------------------------------------------

    @GetMapping
    public List<Carrito> findAll() {
        return carRepo.findAll();
    }

    @GetMapping("/{id}")
    public Carrito findById(@PathVariable int id) {
        return carRepo.findById(id).get();
    }

    @PutMapping("/{id}")
    public Carrito update(@PathVariable int id, @RequestBody Carrito carrito) {
        return carRepo.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        carRepo.deleteById(id);
    }

    @PostMapping
    public Carrito save(@RequestBody Carrito carrito) {
        return carRepo.save(carrito);
    }

    //---------------------------------------------METODOS DETALLE CARRIO ----------------------------------------------

    @GetMapping("/detalle")
    public List<Carrito_detalle> findAllCarritoDet() {
        return carDetRepo.findAll();
    }

    @GetMapping("/detalle/{id}")
    public Carrito_detalle findCarritoDetById(@PathVariable int id) {
        return carDetRepo.findById(id).get();
    }

    @PostMapping("/detalle")
    public Carrito_detalle save(@RequestBody Carrito_detalle carrito_detalle) {
        // Validar que exista el carrito
        Carrito carrito = carRepo.findById(carrito_detalle.getId_carrito())
                .orElseGet(() -> {
                    Carrito c = new Carrito();
                    c.setId_cliente(14); // por defecto si no hay usuario
                    c.setEstado("activo");
                    c.setFecha_creacion(LocalDate.now());
                    return carRepo.save(c);
                });

        carrito_detalle.setId_carrito(carrito.getId_carrito());
        return carDetRepo.save(carrito_detalle);
    }

    @PutMapping("/detalle/{id}")
    public Carrito_detalle update(@PathVariable Integer id, @RequestBody Carrito_detalle carrito_detalle){
        return carDetRepo.save(carrito_detalle);
    }

    @DeleteMapping("/detalle/{id}")
    public void delete(@PathVariable Integer id) {
        if (carDetRepo.existsById(id)) {
            carDetRepo.deleteById(id);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "El detalle del carrito con ID " + id + " no existe"
            );
        }
    }


}
