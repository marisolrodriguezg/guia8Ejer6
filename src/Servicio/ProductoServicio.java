
package Servicio;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicio {
    private HashMap<String,Producto>productoMap;
    private Scanner leer;

    public ProductoServicio() {
        this.productoMap=new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    public void introducirProducto(){
        System.out.println("ingrese el nombre del producto a cargar");
        String nomProducto=leer.next();
        nomProducto=nomProducto.toUpperCase();
        
        System.out.println("ingrese el predcio del producto");
        Double precProd=leer.nextDouble();
        productoMap.put(nomProducto,new Producto(nomProducto, precProd));
    } 
     public void mostrarProducto(){
         for (java.util.Map.Entry<java.lang.String, Entidades.Producto> entry : productoMap.entrySet()) {
               //String key = entry.getKey();
             //Producto value = entry.getValue();
             System.out.println("nombre : " + entry.getKey()+" precio $ " + entry.getValue() );
         } 
    }
    public void modificarPrecio(){
        System.out.println("a que producto quieres cambian el precio");
         String prodCamb=leer.next();
        prodCamb=prodCamb.toUpperCase();
        System.out.println("que precio ingresamos ?");
        Double nuevoPrecio=leer.nextDouble();
        productoMap.put(prodCamb,new Producto(nuevoPrecio));
    }
    public void eliminarProducto(){
        System.out.println("que producto desea eliminar");
        String prodEliminar=leer.next();
        prodEliminar=prodEliminar.toUpperCase();
        productoMap.remove(prodEliminar);
    }
    
    public void menu() {
        ProductoServicio ps=new ProductoServicio();
        int operacion;
        do {
            System.out.println("----------------------------------");
            System.out.println("ingrese la opcion que desee: ");
            System.out.println("1) ingresar producto");
            System.out.println("2)eliminar producto");
            System.out.println("3) mostrar productos");
            System.out.println("4) modificar precio de producto existente");
            System.out.println("5) salir");

            System.out.println("--------------------------------");

            operacion = leer.nextInt();
            switch (operacion) {
                case 1:
                    ps.introducirProducto();
                    break;
                case 2:
                    ps.eliminarProducto();
                    break;
                case 3:
                    ps.mostrarProducto();
                    break;
                case 4:
                    ps.modificarPrecio();
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N");

                    String si = leer.next();

                    if (si.equals("s")) {
                        System.out.println("salir del programa");
                        operacion=0;
                        break;
                    } else {

                        if (si.equals("n")) {
                            System.out.println("continuar en el programa");
                        }
                       break; 
                    }
                default:
                    System.out.println("el num es incorrecto");

            }
        //} while (operacion == 1 || operacion == 2 || operacion == 3 || operacion == 4|| operacion== 5);
        }while (operacion!=0);
    }
}
