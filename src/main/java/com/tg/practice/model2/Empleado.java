package com.tg.practice.model2;

import java.time.LocalDate;

public abstract class Empleado {
	
	private Long id;
	private String apellido;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Integer nLegajo;
	private Integer dni;
	private Integer cuil;
	private LocalDate fechaIngreso;
	private String mail;
	private Double sueldo;
	private Puesto puesto;
}
