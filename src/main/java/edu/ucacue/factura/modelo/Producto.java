package edu.ucacue.factura.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30)
	private String cedula;
	private String nombre;
	private String apellido;
	private String telf;
	private String correo;
	private String descripcion; //LOCAL 
	private double precio; //NUMERO DE  RUCSIR
	private String stock; //FECHA
	

	
	
	public Producto(String nombre, String descripcion, double precio, String stock, String cedula, String apellido, String telf, String correo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido=apellido;
		this.telf=telf;
		this.correo=correo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	
	
	public Producto() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String cantidad) {
		this.stock = cantidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelf() {
		return telf;
	}


	public void setTelf(String telf) {
		this.telf = telf;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}



}
