package com.jeisson.Controller;

import com.jeisson.Model.DTO.InventarioDTO;
import com.jeisson.Model.Entity.Inventario;
import com.jeisson.Service.IInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class InventarioController {

    @Autowired
    private IInventario inventarioService;

    @GetMapping("Inventarios")
    public List<Inventario> Inventarios(){
        return inventarioService.Inventarios();
    }

    @PostMapping("Inventario")
    public Inventario Guardar(@RequestBody Inventario inventario){
        return inventarioService.Guardar(inventario);
    }

    @PutMapping("Inventario")
    public Inventario Actualizar(@RequestBody Inventario inventario){
        return inventarioService.Guardar(inventario);
    }

    @PutMapping("EstadoInventario")
    public Inventario ActualizarEstado(@RequestBody InventarioDTO inventarioDTO){
        return inventarioService.ActualizarEstado(inventarioDTO);
    }
}
