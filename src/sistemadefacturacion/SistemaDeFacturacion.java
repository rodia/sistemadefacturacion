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

    public Factura getItem(int index) {
        return items.get(index);
    }

    public int getCount() {
        return items.size();
    }

    @Override
    public Iterator<Factura> iterator() {
        return new ListIterator(this);
    }
}

final class ListIterator implements Iterator<Factura> {
    private final SistemaDeFacturacion list;
    private int index;

    public ListIterator(SistemaDeFacturacion list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.getCount();
    }

    @Override
    public Factura next() {
        return list.getItem(index++);
    }
}
