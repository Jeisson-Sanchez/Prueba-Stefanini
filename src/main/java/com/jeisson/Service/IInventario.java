package com.jeisson.Service;

import com.jeisson.Model.DTO.InventarioDTO;
import com.jeisson.Model.Entity.Inventario;

import java.util.List;

public interface IInventario {
    Inventario Guardar (Inventario inventario);
    List<Inventario> Inventarios();
    Inventario ActualizarEstado(InventarioDTO inventarioDto);
}


