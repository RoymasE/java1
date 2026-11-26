/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;
//Encargado de dar informes de estado y conclusiones finales 
/**
 *
 * @author krr
 */
public class Origen {
    //variables 
    private String nombredelproducto;
    private String respuesta;
    //metodo
    
    public void gestiondemantenimiento(Cliente cliente2){
        Cliente cliente = cliente2;
System.out.println("\nEl producto : "+cliente.getNombredelproducto()+" Esta en un estado descrito como ");
//Agregar mas detalles
System.out.println("Nombre del producto: "+cliente.getNombredelproducto());
System.out.println("Precio del producto: "+cliente.getProducto());
System.out.println("Fecha de entrega : "+cliente.getFecha());
        System.err.println("Cantidad: "+cliente.getUnidad());
        System.err.println("Total a pagar : "+cliente.getProducto()* cliente.getUnidad());
        System.out.println("Vendido por: "+cliente.getVendedor());
System.out.println("=======================");



    }
    //getter and setter 

    public String getNombredelproducto() {
        return nombredelproducto;
    }

    public void setNombredelproducto(String nombredelproducto) {
        this.nombredelproducto = nombredelproducto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
}
