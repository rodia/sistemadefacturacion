package custom.date;

import java.io.Serializable;

public class Date {
    public static final String[] months = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
    };

    public static Serializable getMonthLiteral(int month) {
        if (month < 1 || month > 12) {
            return new IllegalArgumentException("The month is not valid. it must be a number between 1 and 12.");
        }

        return months[month - 1];
    }

    public static Serializable getDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return new IllegalArgumentException("The day is not valid. it must be a number between 1 and 31.");
        }
        if (month < 1 || month > 12) {
            return new IllegalArgumentException("The month is not valid. It must be a number between 1 and 12.");
        }

        return String.format("%d de %s de %d", day, Date.getMonthLiteral(month), year);
    }
}
