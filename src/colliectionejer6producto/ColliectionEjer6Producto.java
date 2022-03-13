
package colliectionejer6producto;

import Servicio.ProductoServicio;
import java.util.Scanner;

public class ColliectionEjer6Producto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio pss = new ProductoServicio();
        pss.menu();

    }

}
