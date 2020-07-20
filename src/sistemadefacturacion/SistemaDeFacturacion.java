package sistemadefacturacion;

import java.util.Iterator;

public class SistemaDeFacturacion implements Iterable<Factura> {
    public static final int INITIAL_LENGTH = 10;
    private Factura[] items;
    private int count;

    public SistemaDeFacturacion() {
        items = new Factura[INITIAL_LENGTH];
        count = 0;
    }

    public Factura crearFactura(int number, long nit, String clientName, int day, int month, int year) {
        if (items.length == count) {
            upgrade();
        }

        Factura factura = new Factura(number, nit, clientName, day, month, year);
        items[count++] = factura;

        return factura;
    }

    private void upgrade() {
        Factura[] newItems = new Factura[items.length + INITIAL_LENGTH];
        System.arraycopy(items, 0, newItems, 0, items.length);

        items = newItems;
    }

    public Factura getItem(int index) {
        return items[index];
    }

    public int getCount() {
        return count;
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
