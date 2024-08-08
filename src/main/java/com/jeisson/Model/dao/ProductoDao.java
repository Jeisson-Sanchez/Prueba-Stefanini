package com.jeisson.Model.dao;

import com.jeisson.Model.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao  extends CrudRepository<Producto, Integer> {

}
