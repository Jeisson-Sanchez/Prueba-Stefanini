package com.jeisson.Controller;

import com.jeisson.Model.Entity.Producto;
import com.jeisson.Service.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductoController {

    @Autowired
    private IProducto productoService;

    //@PostMapping("Producto")
    //public Producto Guardar(@RequestBody Producto producto){
    //    return productoService.Guardar(producto);
    //}

    //@PutMapping("Producto")
    //public Producto Actualizar(@RequestBody Producto producto){
    //    return productoService.Guardar(producto);
    //}

    //@DeleteMapping("Producto/{id}")
    //public void Eliminar(@PathVariable Integer id){
    //    Producto productoEliminar = productoService.ProductoPorId(id);
    //    productoService.Eliminar(productoEliminar);
    //}

    //@GetMapping("Producto/{id}")
    //public Producto ProductoPorId (@PathVariable Integer id){
    //    return productoService.ProductoPorId(id);
    //}

    @GetMapping("Productos")
    public List<Producto>  Productos (){
        return productoService.Productos();
    }

}
