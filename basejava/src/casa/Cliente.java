/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author krr
 */
public class Cliente {
    private double producto;
    private int unidad;
    private String nombredelproducto; 
    private String nombredelcliente;
    private Scanner scanner;
    private String fecha;
    private String vendedor;
	//Constructor 
	public Cliente(){
	
	
	}
	
	
    //Metdodos
    public void comprar(){
        Scanner escaneo1 = new Scanner(System.in);
        	System.out.println("\nIngrese el nombre del producto");
	String nombredelproducto1 = escaneo1.next();
		System.out.println("\nIngrese el precio del producto");
	double producto1 = escaneo1.nextDouble();
		System.out.println("\nIngrese las unidades de la venta del producto");
	int unidad1 = escaneo1.nextInt();
	
		System.out.println("\nIngrese el nombre del cliente");
	String nombredelcliente1 = escaneo1.next();
	this.producto = producto1;
		this.unidad = unidad1;
		this.nombredelproducto = nombredelproducto1;
		this.nombredelcliente = nombredelcliente1;
	
   ///Demostrar nombre y venta realizada    
		System.out.println("\nIngresar el nombre del vendedor?");
		Scanner scaner = new Scanner(System.in);
		String nombre= scaner.next();
    this.vendedor = nombre;
		System.out.println("\nIngrese fecha");
		String fecha = scaner.next();
		this.fecha = fecha;
    }

    //getter and setter 
    public double getProducto() {
        return producto;
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getNombredelproducto() {
        return nombredelproducto;
    }

    public void setNombredelproducto(String nombredelproducto) {
        this.nombredelproducto = nombredelproducto;
    }

    public String getNombredelcliente() {
        return nombredelcliente;
    }

    public void setNombredelcliente(String nombredelcliente) {
        this.nombredelcliente = nombredelcliente;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}
