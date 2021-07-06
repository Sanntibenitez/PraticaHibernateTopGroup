package com.tg.practice.model2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50, nullable = false)
	private String apellido;

	@Column(length = 50, nullable = false)
	private String nombre;

	@Column(nullable = false)
	private LocalDate fechaNacimiento;

	@Column(nullable = false)
	private Integer nLegajo;

	@Column(nullable = false)
	private Integer dni;

	@Column(length = 25, nullable = false)
	private Integer cuil;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date fechaIngreso;

	@Column(length = 50, nullable = false)
	private String mail;

	@Column
	private Double sueldo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable = false)
	private Puesto puesto;

	@ManyToMany
	private Set<Sucursal> sucursalesHabilitadas;

	@ManyToOne(fetch = FetchType.LAZY)
	private Sucursal sucursalPrincipal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getnLegajo() {
		return nLegajo;
	}

	public void setnLegajo(Integer nLegajo) {
		this.nLegajo = nLegajo;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public Set<Sucursal> getSucursalesHabilitadas() {
		return sucursalesHabilitadas;
	}

	public void setSucursalesHabilitadas(Set<Sucursal> sucursalesHabilitadas) {
		this.sucursalesHabilitadas = sucursalesHabilitadas;
	}

	public Sucursal getSucursalPrincipal() {
		return sucursalPrincipal;
	}

	public void setSucursalPrincipal(Sucursal sucursalPrincipal) {
		this.sucursalPrincipal = sucursalPrincipal;
	}

}
