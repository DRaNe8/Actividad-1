import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {

	public static void main(String[] args) {

		// Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);
		// Mostramos cuánto tiempo ha pasado
		System.out.println(calcularPeriodo("El descubrimiento de América", fecha));
		System.out.println(calcularPeriodo("Mi nacimiento", LocalDate.of(1992, 4, 14)));
		System.out.println(calcularPeriodo("Nacimiento de mi hermano", LocalDate.of(1989, 10, 10)));
		System.out.println(calcularPeriodo("Nacimiento de Alba", LocalDate.of(2000, 02, 18)));
	}

	public static String calcularPeriodo(String nombre, LocalDate fecha) {

		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fecha, fechaActual);

		// Cálculo de las diferencias
		int anyos = periodo.getYears();
		int meses = periodo.getMonths();
		int dias = periodo.getDays();

		String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);

		return texto;
	}

}
