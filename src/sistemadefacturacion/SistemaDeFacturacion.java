package sistemadefacturacion;

import java.util.ArrayList;
import java.util.Iterator;

public class SistemaDeFacturacion implements Iterable<Factura> {
    private final ArrayList<Factura> items;

    public SistemaDeFacturacion() {
        items = new ArrayList<>();
    }

    public Factura crearFactura(int number, long nit, String clientName, int day, int month, int year) {
        Factura factura = new Factura(number, nit, clientName, day, month, year);
        items.add(factura);

        return factura;
    }

    @Override
    public Iterator<Factura> iterator() {
        return this.items.iterator();
    }
}
