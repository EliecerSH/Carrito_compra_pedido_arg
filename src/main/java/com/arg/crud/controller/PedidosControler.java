package com.arg.crud.controller;
import com.arg.crud.model.Detalle_pedidos;
import com.arg.crud.model.Estado_pedido;
import com.arg.crud.model.Pedidos;
import com.arg.crud.repository.DetPedidosRepository;
import com.arg.crud.repository.EstadoPedidoRepository;
import com.arg.crud.repository.PedidosRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/pedidos")
@CrossOrigin("*")
public class PedidosControler {

    private PedidosRepository pedRepo;
    private DetPedidosRepository detRepo;
    private EstadoPedidoRepository estRepo;

    public PedidosControler(PedidosRepository pedRepo, DetPedidosRepository detRepo, EstadoPedidoRepository estRepo) {
        this.pedRepo = pedRepo;
        this.detRepo = detRepo;
        this.estRepo = estRepo;
    }

    //---------------------------------------metodos de pedido----------------------------------------------------------

    @GetMapping
    public List<Pedidos> findAll() {
        return pedRepo.findAll();
    }

    @GetMapping("{id}")
    public Pedidos findById(@PathVariable int id) {
        return pedRepo.findById(id).get();
    }

    @PostMapping
    public Pedidos save(@RequestBody Pedidos pedidos){
        return pedRepo.save(pedidos);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        pedRepo.deleteById(id);
    }

    @PostMapping("{id}")
    public Pedidos update(@PathVariable int id, @RequestBody Pedidos pedidos){
        return pedRepo.save(pedidos);
    }

    //-------------------------------------------METODOS DETALLE PEDIDO-------------------------------------------------

    @GetMapping("/detalle")
    public List<Detalle_pedidos> findAll_detalle() {
        return detRepo.findAll();
    }

    @GetMapping("/detalle/{id}")
    public Detalle_pedidos findById_detalle(@PathVariable int id) {
        return detRepo.findById(id).get();
    }

    @DeleteMapping("/detalle/{id}")
    public void delete_detalle(@PathVariable int id) {
        detRepo.deleteById(id);
    }

    @PutMapping("/detalle/{id}")
    public Detalle_pedidos  update_detalle(@PathVariable int id, @RequestBody Detalle_pedidos detalle){
        return detRepo.save(detalle);
    }

    @PostMapping("/detalle")
    public Detalle_pedidos save_detalle(@RequestBody Detalle_pedidos detalle){
        return detRepo.save(detalle);
    }

    //----------------------------------------metodos de estado pedido-------------------------------------------------

    @GetMapping("/estado")
    public List<Estado_pedido> findAll_estado() {
        return estRepo.findAll();
    }

    @GetMapping("/estado/{id}")
    public Estado_pedido findById_estado(@PathVariable int id) {
        return estRepo.findById(id).get();
    }
}
