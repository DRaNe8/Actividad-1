
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class pruebaCalcular {

	@Test
	void casoPrueba1() {
		CalcularPeriodo calc = new CalcularPeriodo();
		assertEquals("Nacimiento Einstein ocurrió hace 140 años, 2 meses y 0 días.",
		        calc.calcularPeriodo("Nacimiento Einstein", LocalDate.of(1879, Month.MARCH, 14)));
	}

}
