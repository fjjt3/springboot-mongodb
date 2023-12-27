package com.empleados.backend.empleadosbackend.service;

import java.util.List;

import com.empleados.backend.empleadosbackend.model.Empleado;

public interface IEmpleadoService {
	
	List <Empleado> buscar();
	Empleado buscarPorId(String id);
	Empleado guardar(Empleado empleado);
	void eliminar (String id);
}
