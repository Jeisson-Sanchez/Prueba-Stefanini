package com.jeisson.Service.impl;

import com.jeisson.Model.Entity.Producto;
import com.jeisson.Model.dao.ProductoDao;
import com.jeisson.Service.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoImpl implements IProducto {

    @Autowired
    private ProductoDao productoDao;

    @Transactional
    @Override
    public Producto Guardar(Producto producto) {
        return productoDao.save(producto);
    }

    @Transactional(readOnly = true)
    @Override
    public Producto ProductoPorId(Integer id) {
        return productoDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Producto> Productos () {
        return (List<Producto>) productoDao.findAll();
    }

    @Transactional
    @Override
    public void Eliminar(Producto producto) {
        productoDao.delete(producto);
    }
}
