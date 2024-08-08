package com.jeisson.Service;

import com.jeisson.Model.Entity.Producto;

import java.util.List;

public interface IProducto {

    Producto Guardar(Producto producto);

    Producto ProductoPorId(Integer id);

    List<Producto> Productos();

    void Eliminar(Producto producto);

}
