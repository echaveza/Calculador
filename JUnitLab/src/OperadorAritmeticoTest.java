import static org.junit.Assert.*;

import org.junit.Test;

public class OperadorAritmeticoTest {

	@Test
	public void suma() {

	 int esperado=18;
	 int a = 15;
	 int b = 3;

	 int suma = OperadorAritmetico.suma(a, b);

	 assertEquals(esperado, suma);
	}
	@Test
	public void division() {
	int esperado=4;
	int a = 60;
	int b = 15;
	int division;
	try {
	 division = OperadorAritmetico.division(a, b);
	 assertEquals(esperado, division);
	} catch (Exception e) {
	 fail();
	}
	}
}
