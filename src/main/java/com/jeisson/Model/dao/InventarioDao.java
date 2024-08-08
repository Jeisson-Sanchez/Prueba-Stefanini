package com.jeisson.Model.dao;

import com.jeisson.Model.Entity.Inventario;
import org.springframework.data.repository.CrudRepository;

public interface InventarioDao extends CrudRepository<Inventario, Integer> {
}
