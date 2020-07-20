package sistemadefacturacion;

import custom.date.Date;
import java.util.ArrayList;

public class Factura {
    private String clientName;
    private long nit;
    private int number;
    private int day, month, year;
    private final ArrayList<Item> items;

    public Factura(int number, long nit, String clientName, int day, int month, int year) {
        this.clientName = clientName;
        this.nit = nit;
        this.number = number;
        this.day = day;
        this.month = month;
        this.year = year;

        items = new ArrayList<>();
    }

    public void agregarItem(int number, String description, double price) {
        items.add(new Item(number, description, price));
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format(
             "===================================================================\n" +
             "Nombre: %s       NIT: %d\n" +
             "Fecha: %s        No. %d\n" +
             "-------------------------------------------------------------------\n" +
             "CANTIDAD  DESCRIPCION                  PRECIO UNIT      TOTAL\n" +
             "%s" +
             "-------------------------------------------------------------------\n" +
             "TOTAL:                                                  %.2f\n" +
             "-------------------------------------------------------------------\n",
            getClientName(),
            getNit(),
            Date.getDate(getDay(), getMonth(), getYear()),
            getNumber(),
            getItems(),
            getTotal()
        );
    }

    private String getItems() {
        StringBuilder literal = new StringBuilder();

        for (Item item : this.items) {
            if (item == null) {
                continue;
            }

            literal.append(item);
        }

        return literal.toString();
    }

    private double getTotal() {
        double total = 0;

        for (Item item : this.items) {
            if (item == null) {
                continue;
            }

            total += item.getCount() * item.getPrice();
        }

        return total;
    }
}
