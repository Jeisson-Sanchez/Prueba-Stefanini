package com.jeisson.Service.impl;

import com.jeisson.Model.DTO.InventarioDTO;
import com.jeisson.Model.Entity.Inventario;
import com.jeisson.Model.dao.InventarioDao;
import com.jeisson.Service.IInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventarioImpl implements IInventario {

    @Autowired
    private InventarioDao inventarioDao;

    @Transactional(readOnly = true)
    @Override
    public List<Inventario> Inventarios() {
        return (List<Inventario>) inventarioDao.findAll();
    }

    @Transactional
    @Override
    public Inventario Guardar(Inventario inventario) {
        return inventarioDao.save(inventario);
    }

    @Transactional
    @Override
    public Inventario ActualizarEstado(InventarioDTO inventarioDto) {
        Inventario inventario = inventarioDao.findById(inventarioDto.getIdInventario())
                .orElseThrow(() -> new RuntimeException("Inventario no encontrado"));

        inventario.setEstado(inventarioDto.getEstado());
        return inventarioDao.save(inventario);
    }
}
