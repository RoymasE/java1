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
public class Atencion {
    //Atributos 
    private Scanner scanner;
    private Cliente cliente;
    private String nombredelcliente;
    private double producto;
    private String producto_nombre_proveedor;
    private String nombredelproducto;
    private int unidad;
    private int dia;
    private int mes;
    private int anno;
    private int hora;
    private int minuto;
    private int correlativo;
    //metodos
    public void gestiondecliente(){
    System.out.println("\n --------Gestion de cliente---------");
        Cliente clienteutil = new Cliente();

		clienteutil.comprar();
                        this.cliente = clienteutil;
    }
    
    public void comprobante(double producto, int unidad, String nombredelproducto){
    System.out.println("\n El cliente pagara: "+producto * unidad);
    System.out.println("\n Por el producto: "+ nombredelproducto);
    System.out.println("\nCon respecto a: "+ unidad+  " unidades");
    

    }

public void comprobarcompra(){
Origen ori = new Origen();
ori.gestiondemantenimiento(this.cliente);

}



    
    public void gestiondeproducto(String nombredelproducto){
    this.nombredelproducto = nombredelproducto;
    }
    
    public void inventario(int unidad, String nombredelproducto){
    this.unidad = this.unidad;
   this.nombredelproducto = nombredelproducto;
  
    
    }
    
    public void venta(String nombredelproducto, int unidad, double producto, String nombredelcliente){
 double precioTotal = unidad * producto;
     
 
    }
    
    //getters and setters 

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombredelcliente() {
        return nombredelcliente;
    }

    public void setNombredelcliente(String nombredelcliente) {
        this.nombredelcliente = nombredelcliente;
    }

    public double getProducto() {
        return producto;
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public String getProducto_nombre_proveedor() {
        return producto_nombre_proveedor;
    }

    public void setProducto_nombre_proveedor(String producto_nombre_proveedor) {
        this.producto_nombre_proveedor = producto_nombre_proveedor;
    }

    public String getNombredelproducto() {
        return nombredelproducto;
    }

    public void setNombredelproducto(String nombredelproducto) {
        this.nombredelproducto = nombredelproducto;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }
    
    
    
}
