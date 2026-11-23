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
public class Menu {
    private int opcion;
    private  Scanner scaner;

    private static final Atencion atencion = new Atencion();
    //base menu 
    private String menuDesplegable = 
            "\n========================================="+
            "\n0) Pedir atencion"+
           "\n"+             
	    "\n1) Salir"+
             "\n"+
            "\n3) Detalles de venta previa "+

            "\n=========================================";

    public static void main(String[] args){
     String menuDesplegable = 
            "\n========================================="+
            "\n0) Pedir atencion"+
           "\n"+             
            "\n1) Salir"+
 "\n"+
            "\n2) Detalles de venta previa "+
             "\n"+
             "\n3) Lista de objetos"+
            "\n=========================================";

	    
	   
	//Acciones 
		
		//==================================================
		int opcion = 0;
		do{
			 System.out.println(menuDesplegable);
		
		Scanner escaner = new Scanner(System.in);
		 opcion = escaner.nextInt();
		escoger(opcion);
		
		}while(opcion != 1);
		
		
		
		
		//==================================================
	}
		//Metodo para escoger 
		public static void escoger(int opcion){
               
	switch(opcion){
			case 0:
				System.out.print("Iniciando reguistro ");
			
			atencion.gestiondecliente();
			
				break;
			case 1:
				System.out.println("Saliendo....");
				break;
                        case 2: 
                            System.out.println("\nDetalle de la venta ");
                        atencion.comprobarcompra();
               
                            break;
                        case 3:
                            System.out.println("\n----------------");
                            atencion.gestionarInventario();
                            break;
				default:
				System.out.println("Error, vuelvelo a intentar");
				break;
		
		
		}
		}
		
    }
    
	
	
	
	
    

