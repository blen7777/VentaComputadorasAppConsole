package mundopc.servicio;

import mundopc.modelo.Compotudora;

import java.util.ArrayList;
import java.util.List;

public class Orden
{
    private final int idOrden;
    private final List<Compotudora> compotudoras;
    private static int contadorOrdenes;

    public Orden(){
        compotudoras = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void agregar(Compotudora compotudora)
    {
        compotudoras.add(compotudora);
    }

    public void mostrarOrden()
    {
        System.out.println("Orden #: " + idOrden );
        System.out.println("Total computadoras: " + compotudoras.size());
        System.out.println();

        compotudoras.forEach(System.out::println);
    }

}
