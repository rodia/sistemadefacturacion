import sistemadefacturacion.Factura;
import sistemadefacturacion.SistemaDeFacturacion;

public class Main {

    public static void main(String[] args) {
        SistemaDeFacturacion sf = new SistemaDeFacturacion();

        Factura f1 = sf.crearFactura(439433, 392021012L, "Juan Perez", 10, 2, 2020);
        f1.agregarItem(2, "leche", 6);
        f1.agregarItem(3, "cocacolas", 13);
        f1.agregarItem(7, "chocolates", 5);

        Factura f2 = sf.crearFactura(2342342, 459239823121L, "Pedro Vaca", 12, 2, 2020);
        f2.agregarItem(5, "papas fritas", 9.50);
        f2.agregarItem(2, "leche", 6);

        Factura f3 = sf.crearFactura(5292212, 392021012L, "Juan Perez", 12, 2, 2020);
        f3.agregarItem(5, "leche", 6);
        f3.agregarItem(2, "kg. queso", 25.30);

        for (Factura f : sf) {
            System.out.println(f); // String.format();
        }

        //===================================================================
        //Nombre: Juan Perez                    NIT: 4392021012
        //Fecha: 10 de febrero de 2020              No. 439433
        //-------------------------------------------------------------------
        // CANTIDAD  DESCRIPCION                  PRECIO UNIT      TOTAL
        // 2         leches                          6.00          12.00
        // 3         cocacolas                      13.00          39.00
        // 7         chocolates                      5.00          35.00
        // -----------------------------------------------------------------
        // TOTAL:                                                  86.00
        // -----------------------------------------------------------------
    }
}
