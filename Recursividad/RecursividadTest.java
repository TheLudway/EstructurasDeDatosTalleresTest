package co.edu.utadeo.rec;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursividadTest {

	@Test
	public void factorialTest() {
		assertTrue(Recursividad.factorial(0) == 1);
		assertTrue(Recursividad.factorial(1) == 1);
		assertTrue(Recursividad.factorial(2) == 2);
		assertTrue(Recursividad.factorial(3) == 6);
		assertTrue(Recursividad.factorial(4) == 24);
		assertTrue(Recursividad.factorial(10) == 3628800);
	}

	@Test
	public void bunnyEarsTest() {
		assertTrue(Recursividad.bunnyEars(0) == 0);
		assertTrue(Recursividad.bunnyEars(1) == 2);
		assertTrue(Recursividad.bunnyEars(2) == 4);
		assertTrue(Recursividad.bunnyEars(3) == 6);
		assertTrue(Recursividad.bunnyEars(125) == 250);
	}

	@Test
	public void fibonacciTest() {
		assertTrue(Recursividad.fibonacci(0) == 0);
		assertTrue(Recursividad.fibonacci(1) == 1);
		assertTrue(Recursividad.fibonacci(2) == 1);
		assertTrue(Recursividad.fibonacci(3) == 2);
		assertTrue(Recursividad.fibonacci(4) == 3);
		assertTrue(Recursividad.fibonacci(5) == 5);
		assertTrue(Recursividad.fibonacci(6) == 8);
		assertTrue(Recursividad.fibonacci(7) == 13);
		assertTrue(Recursividad.fibonacci(8) == 21);
		assertTrue(Recursividad.fibonacci(9) == 34);
		assertTrue(Recursividad.fibonacci(30) == 832040);
	}

	@Test
	public void bunnyEars2Test() {
		assertTrue(Recursividad.bunnyEars2(0) == 0);
		assertTrue(Recursividad.bunnyEars2(1) == 2);
		assertTrue(Recursividad.bunnyEars2(2) == 5);
		assertTrue(Recursividad.bunnyEars2(3) == 7);
		assertTrue(Recursividad.bunnyEars2(4) == 10);
		assertTrue(Recursividad.bunnyEars2(100) == 250);
	}

	@Test
	public void triangleTest() {
		assertTrue(Recursividad.triangle(0) == 0);
		assertTrue(Recursividad.triangle(1) == 1);
		assertTrue(Recursividad.triangle(2) == 3);
		assertTrue(Recursividad.triangle(3) == 6);
		assertTrue(Recursividad.triangle(4) == 10);
		assertTrue(Recursividad.triangle(60) == 1830);
	}

	@Test
	public void sumDigitsTest() {
		assertTrue(Recursividad.sumDigits(0) == 0);
		assertTrue(Recursividad.sumDigits(1) == 1);
		assertTrue(Recursividad.sumDigits(11) == 2);
		assertTrue(Recursividad.sumDigits(12) == 3);
		assertTrue(Recursividad.sumDigits(49) == 13);
		assertTrue(Recursividad.sumDigits(126) == 9);
		assertTrue(Recursividad.sumDigits(126442) == 19);
	}

	@Test
	public void count7Test() {
		assertTrue(Recursividad.count7(0) == 0);
		assertTrue(Recursividad.count7(7) == 1);
		assertTrue(Recursividad.count7(717) == 2);
		assertTrue(Recursividad.count7(771) == 2);
		assertTrue(Recursividad.count7(123) == 0);
		assertTrue(Recursividad.count7(1237234324) == 1);
	}

	@Test
	public void changeXYTest() {
		assertTrue(Recursividad.changeXY("").equals(""));
		assertTrue(Recursividad.changeXY("x").equals("y"));
		assertTrue(Recursividad.changeXY("hello").equals("hello"));
		assertTrue(Recursividad.changeXY("xhelxlox").equals("yhelyloy"));
		assertTrue(Recursividad.changeXY("hjkhxx").equals("hjkhyy"));
	}

	@Test
	public void changePiTest() {
		assertTrue(Recursividad.changePi("").equals(""));
		assertTrue(Recursividad.changePi("x").equals("x"));
		assertTrue(Recursividad.changePi("pi").equals("3.14159265359"));
		assertTrue(Recursividad.changePi("xpix").equals("x3.14159265359x"));
		assertTrue(Recursividad.changePi("xpipipx").equals(
				"x3.141592653593.14159265359px"));
	}

	@Test
	public void reverseTest() {
		assertTrue(Recursividad.reverse("").equals(""));
		assertTrue(Recursividad.reverse("hello").equals("olleh"));
		assertTrue(Recursividad.reverse("bogota").equals("atogob"));
		assertTrue(Recursividad.reverse("xyz").equals("zyx"));
		assertTrue(Recursividad.reverse("amor").equals("roma"));
		assertTrue(Recursividad.reverse("arroz").equals("zorra"));
	}
}
