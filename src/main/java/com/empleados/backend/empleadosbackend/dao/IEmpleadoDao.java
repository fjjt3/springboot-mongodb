package com.empleados.backend.empleadosbackend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.empleados.backend.empleadosbackend.model.Empleado;

public interface IEmpleadoDao extends MongoRepository<Empleado, String> {

}
