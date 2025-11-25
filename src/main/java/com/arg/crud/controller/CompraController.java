package com.arg.crud.controller;
import com.arg.crud.model.Compra;
import com.arg.crud.model.Metodos_envio;
import com.arg.crud.model.Metodos_pago;
import com.arg.crud.repository.CompraRepository;
import com.arg.crud.repository.MetodosEnvioRepository;
import com.arg.crud.repository.MetodosPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/compra")
@CrossOrigin("*")
public class CompraController {
    @Autowired
    private CompraRepository comRepo;
    private MetodosPagoRepository metRepo;
    private MetodosEnvioRepository meteRepo;

    public CompraController(CompraRepository comRepo, MetodosPagoRepository metRepo, MetodosEnvioRepository meteRepo) {
        this.comRepo = comRepo;
        this.metRepo = metRepo;
        this.meteRepo = meteRepo;
    }

    //---------------------------------------metodos de compra--------------------------------------------------------

    @GetMapping
    public List<Compra> findAll() {
        return comRepo.findAll();
    }

    @GetMapping("{id}")
    public Compra findById(@PathVariable Integer id) {
        return comRepo.findById(id).get();
    }

    @PutMapping("{id}")
    public Compra update(@PathVariable Integer id, @RequestBody Compra compra) {
        return comRepo.save(compra);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        comRepo.deleteById(id);
    }

    @PostMapping
    public Compra create(@RequestBody Compra compra) {
        return comRepo.save(compra);
    }

    //-------------------------------------------metodos metodo pago---------------------------------------------------

    @GetMapping("/metodo_pago")
    public List<Metodos_pago> findAllMetodosPago() {
        return metRepo.findAll();
    }

    @GetMapping("/metodo_pago/{id}")
    public Metodos_pago findMetodosPagoById(@PathVariable Integer id) {
        return metRepo.findById(id).get();
    }

    @PutMapping("/metodo_pago/{id}")
    public Metodos_pago update(Metodos_pago metodos_pago, @PathVariable Integer id) {
        return metRepo.save(metodos_pago);
    }

    @DeleteMapping("/metodo_pago/{id}")
    public void deleteMetodosPagoById(@PathVariable Integer id) {
        metRepo.deleteById(id);
    }

    @PostMapping("/metodo_pago")
    public Metodos_pago create(@RequestBody Metodos_pago metodos_pago) {
        return metRepo.save(metodos_pago);
    }

    //----------------------------------------metodos envio------------------------------------------------------------

    @GetMapping("/metodos_envio")
    public List<Metodos_envio> findAllMetodosEnvio() {
        return meteRepo.findAll();
    }

    @GetMapping("/metodos_envio/{id}")
    public Metodos_envio findMetodosEnvioById(@PathVariable Integer id) {
        return meteRepo.findById(id).get();
    }

    @PutMapping("/metodos_envio/{id}")
    public Metodos_envio update(Metodos_envio metodos_envio, @PathVariable Integer id) {
        return meteRepo.save(metodos_envio);
    }

    @DeleteMapping("/metodos_envio/{id}")
    public void deleteMetodosEnvioById(@PathVariable Integer id) {
        meteRepo.deleteById(id);
    }

    @PostMapping("/metodos_envio")
    public Metodos_envio create(@RequestBody Metodos_envio metodos_envio) {
        return meteRepo.save(metodos_envio);
    }

}
