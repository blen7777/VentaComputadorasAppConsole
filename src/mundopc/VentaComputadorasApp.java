package mundopc;

import mundopc.modelo.Compotudora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp
{
    public static void main(String[] args) {

        // Crear objetos
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo =  new Teclado("Bluetooth0", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo =  new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);

        Compotudora compotudoraLenovo = new Compotudora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(compotudoraLenovo);


        //  Creamos una Orden
        Orden orden1 = new Orden();
        orden1.agregar(compotudoraLenovo);
        orden1.mostrarOrden();
    }
}
