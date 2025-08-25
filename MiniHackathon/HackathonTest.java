package co.edu.utadeo.fcni;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HackathonTest {

	private static String nl = System.lineSeparator();

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void m1Test1() throws InvalidInputException {
		assertTrue(Hackathon.m1(1)==true);
	}

    @Test
	public void m1Test2() throws InvalidInputException {
		assertTrue(Hackathon.m1(2)==true);
	}


	@Test
	public void m1Test3() throws InvalidInputException {
		assertTrue(Hackathon.m1(4)==false);
	}

	@Test(expected=InvalidInputException.class)
	public void m1Test4() throws InvalidInputException {
		Hackathon.m1(0);
	}

	@Test(expected=InvalidInputException.class)
	public void m1Test5() throws InvalidInputException {
		Hackathon.m1(6);
	}

	@Test
	public void m2Test1() throws InvalidInputException {
		assertTrue(Hackathon.m2(1).equalsIgnoreCase("impar"));
	}

	@Test
	public void m2Test2() throws InvalidInputException {
		assertTrue(Hackathon.m2(2).equalsIgnoreCase("par"));
	}

	@Test
	public void m2Test3() throws InvalidInputException {
		assertTrue(Hackathon.m2(56).equalsIgnoreCase("par"));
	}

	@Test
	public void m2Test4() throws InvalidInputException {
		assertTrue(Hackathon.m2(277).equalsIgnoreCase("impar"));
	}

	@Test
	public void m2Test5() throws InvalidInputException {
		assertTrue(Hackathon.m2(-290).equalsIgnoreCase("par"));
	}

	@Test
	public void m3Test1() throws InvalidInputException {
		assertTrue(Hackathon.m3(1).equalsIgnoreCase("lunes"));
	}

	@Test
	public void m3Test2() throws InvalidInputException {
		assertTrue(Hackathon.m3(2).equalsIgnoreCase("martes"));
	}

	@Test
	public void m3Test3() throws InvalidInputException {
		assertTrue(Hackathon.m3(4).equalsIgnoreCase("jueves"));
	}

	@Test(expected=InvalidInputException.class)
	public void m3Test4() throws InvalidInputException {
		Hackathon.m3(8);
	}

	@Test(expected=InvalidInputException.class)
	public void m3Test5() throws InvalidInputException {
		Hackathon.m3(0);
	}

	@Test
	public void m4test1() throws InvalidInputException {
		Hackathon.m4("");
		assertTrue(outContent.toString().equals(""+nl));
		outContent.reset();
	}

	@Test
	public void m4test2() throws InvalidInputException {
		Hackathon.m4("hello");
		assertTrue(outContent.toString().equals("HELLO"+nl));
		outContent.reset();
	}

	@Test
	public void m4test3() throws InvalidInputException {
		Hackathon.m4("hElLo");
		assertTrue(outContent.toString().equals("HELLO"+nl));
		outContent.reset();
	}

	@Test
	public void m4test4() throws InvalidInputException {
		Hackathon.m4("HELLO");
		assertTrue(outContent.toString().equals("HELLO"+nl));
		outContent.reset();
	}

	@Test
	public void m4test5() throws InvalidInputException {
		Hackathon.m4("123");
		assertTrue(outContent.toString().equals("123"+nl));
		outContent.reset();
	}

	@Test
	public void m5test1() throws InvalidInputException {
		assertTrue(Hackathon.m5(-123).equals("negativo"));
	}

	@Test
	public void m5test2() throws InvalidInputException {
		assertTrue(Hackathon.m5(-1).equals("negativo"));
	}

	@Test
	public void m5test3() throws InvalidInputException {
		assertTrue(Hackathon.m5(0).equals("cero"));
	}

	@Test
	public void m5test4() throws InvalidInputException {
		assertTrue(Hackathon.m5(1).equals("positivo"));
	}

	@Test
	public void m5test5() throws InvalidInputException {
		assertTrue(Hackathon.m5(120).equals("positivo"));
	}

	@Test
	public void m6test1() throws InvalidInputException {
		assertTrue(Hackathon.m6('a'));
	}

	@Test
	public void m6test2() throws InvalidInputException {
		assertTrue(Hackathon.m6('a'));
		assertTrue(Hackathon.m6('e'));
		assertTrue(Hackathon.m6('i'));
		assertTrue(Hackathon.m6('o'));
		assertTrue(Hackathon.m6('u'));
	}

	@Test
	public void m6test3() throws InvalidInputException {
		assertTrue(Hackathon.m6('A'));
		assertTrue(Hackathon.m6('E'));
		assertTrue(Hackathon.m6('I'));
		assertTrue(Hackathon.m6('O'));
		assertTrue(Hackathon.m6('U'));
	}

	@Test
	public void m6test4() throws InvalidInputException {
		assertFalse(Hackathon.m6('b'));
		assertFalse(Hackathon.m6('d'));
		assertFalse(Hackathon.m6('h'));
		assertFalse(Hackathon.m6('n'));
		assertFalse(Hackathon.m6('t'));
	}

	@Test
	public void m6test5() throws InvalidInputException {
		assertFalse(Hackathon.m6('B'));
		assertFalse(Hackathon.m6('D'));
		assertFalse(Hackathon.m6('H'));
		assertFalse(Hackathon.m6('N'));
		assertFalse(Hackathon.m6('T'));
	}

	@Test
	public void m7test1() throws InvalidInputException {
		assertTrue(Hackathon.m7(1,1));
		assertTrue(Hackathon.m7(1,2));
		assertTrue(Hackathon.m7(2,1));
		assertTrue(Hackathon.m7(1,3));
		assertTrue(Hackathon.m7(3,1));
		assertTrue(Hackathon.m7(1,5));
		assertTrue(Hackathon.m7(5,1));
	}

	@Test
	public void m7test2() throws InvalidInputException {
		assertTrue(Hackathon.m7(2,2));
		assertTrue(Hackathon.m7(2,3));
		assertTrue(Hackathon.m7(3,2));
		assertTrue(Hackathon.m7(2,5));
		assertTrue(Hackathon.m7(5,2));
	}

	@Test
	public void m7test3() throws InvalidInputException {
		assertTrue(Hackathon.m7(3,3));
		assertTrue(Hackathon.m7(3,5));
		assertTrue(Hackathon.m7(5,3));
		assertTrue(Hackathon.m7(5,5));
	}

	@Test
	public void m7test4() throws InvalidInputException {
		assertFalse(Hackathon.m7(1,4));
		assertFalse(Hackathon.m7(4,1));
		assertFalse(Hackathon.m7(2,4));
		assertFalse(Hackathon.m7(4,2));
		assertFalse(Hackathon.m7(3,4));
		assertFalse(Hackathon.m7(4,3));
		assertFalse(Hackathon.m7(4,4));
		assertFalse(Hackathon.m7(4,5));
		assertFalse(Hackathon.m7(5,4));
	}

	@Test(expected=InvalidInputException.class)
	public void m7test5() throws InvalidInputException {
		Hackathon.m7(0,4);
	}

	@Test(expected=InvalidInputException.class)
	public void m8test1() throws InvalidInputException {
		Hackathon.m8(-500);
	}

	@Test
	public void m8test2() throws InvalidInputException {
		assertTrue(Hackathon.m8(0)==0);
	}

	@Test
	public void m8test3() throws InvalidInputException {
		assertTrue(Hackathon.m8(15000)==16500);
	}

	@Test
	public void m8test4() throws InvalidInputException {
		assertTrue(Hackathon.m8(15001)==17401.16);
	}

	@Test
	public void m8test5() throws InvalidInputException {
		assertTrue(Math.round(Hackathon.m8(100000))==116000);
	}

	@Test
	public void m9test1() throws InvalidInputException {
		assertTrue(Hackathon.m9(new int[]{})==0);
	}

@Test
	public void m9test2() throws InvalidInputException {
		assertTrue(Hackathon.m9(new int[]{2, 5, 45})==0);
	}

	@Test
	public void m9test3() throws InvalidInputException {
		assertTrue(Hackathon.m9(new int[]{7, 7, 77})==2);
	}

@Test
	public void m9test4() throws InvalidInputException {
		assertTrue(Hackathon.m9(new int[]{7, 7, 7, 7})==4);
	}

@Test
	public void m9test5() throws InvalidInputException {
		assertTrue(Hackathon.m9(new int[]{7})==1);
	}

	@Test
	public void m10Test1() throws InvalidInputException {
		assertTrue(Hackathon.m10(new int[]{})==0);
	}

	@Test()
	public void m10Test2() throws InvalidInputException {
		assertTrue(Hackathon.m10(new int[]{0})==0);
	}

	@Test()
	public void m10Test3() throws InvalidInputException {
		assertTrue(Hackathon.m10(new int[]{0,100,45,345435})==345580);
	}

	@Test()
	public void m10Test4() throws InvalidInputException {
		assertTrue(Hackathon.m10(new int[]{0,-100,45,-345435})==-345490);
	}

	@Test()
	public void m10Test5() throws InvalidInputException {
		assertTrue(Hackathon.m10(new int[]{1,2,3,4,5,6,7,8,9,10})==55);
	}

	@Test(expected=InvalidInputException.class)
	public void m11Test1() throws InvalidInputException {
		Hackathon.m11(new int[]{});
	}

	@Test()
	public void m11Test2() throws InvalidInputException {
		assertTrue(Hackathon.m11(new int[]{0})==0.0);
	}

	@Test()
	public void m11Test3() throws InvalidInputException {
		assertTrue(Hackathon.m11(new int[]{0,100,45,345435})==86395);
	}

	@Test()
	public void m11Test4() throws InvalidInputException {
		assertTrue(Hackathon.m11(new int[]{0,-100,45,-345435})==-86372.5);
	}

	@Test()
	public void m11Test5() throws InvalidInputException {
		assertTrue(Hackathon.m11(new int[]{1,2,3,4,5,6,7,8,9,10})==5.5);
	}

	@Test(expected=InvalidInputException.class)
	public void m12Test1() throws InvalidInputException {
		Hackathon.m12(new int[]{});
	}

	@Test()
	public void m12Test2() throws InvalidInputException {
		assertTrue(Hackathon.m12(new int[]{0})==0);
	}

	@Test()
	public void m12Test3() throws InvalidInputException {
		assertTrue(Hackathon.m12(new int[]{0,100,45,345435})==345435);
	}

	@Test()
	public void m12Test4() throws InvalidInputException {
		assertTrue(Hackathon.m12(new int[]{0,-100,45,-345435})==45);
	}

	@Test()
	public void m12Test5() throws InvalidInputException {
		assertTrue(Hackathon.m12(new int[]{1,2,3,4,5,6,7,8,9,10})==10);
	}

	@Test
	public void m13Test1() throws InvalidInputException {
		Hackathon.m13(new int[]{});
		assertTrue(outContent.toString().equals(""));
		outContent.reset();
	}

	@Test
	public void m13Test2() throws InvalidInputException {
		Hackathon.m13(new int[]{1});
		assertTrue(outContent.toString().equals("1"+nl));
		outContent.reset();
	}

	@Test
	public void m13Test3() throws InvalidInputException {
		Hackathon.m13(new int[]{1,2,3,4,5});
		assertTrue(outContent.toString().equals("5"+nl+"4"+nl+"3"+nl+"2"+nl+"1"+nl));
		outContent.reset();
	}

	@Test
	public void m13Test4() throws InvalidInputException {
		Hackathon.m13(new int[]{1,2,3,4,5,6,7,8,9,10});
		assertTrue(outContent.toString().equals("10"+nl+"9"+nl+"8"+nl+"7"+
				nl+"6"+nl+"5"+nl+"4"+nl+"3"+nl+"2"+nl+"1"+nl));
		outContent.reset();
	}

	@Test
	public void m13Test5() throws InvalidInputException {
		Hackathon.m13(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
		assertTrue(outContent.toString().equals("15"+nl+"14"+nl+"13"+nl+"12"+nl+"11"+nl+
				"10"+nl+"9"+nl+"8"+nl+"7"+nl+"6"+nl+"5"+nl+"4"+nl+"3"+nl+"2"+nl+"1"+nl));
		outContent.reset();
	}

	@Test
	public void m14Test1() throws InvalidInputException {
		Hackathon.m14(4,8,56);
		assertTrue(outContent.toString().equals("4"+nl+"8"+nl+"56"+nl));
		outContent.reset();
	}

	@Test
	public void m14Test2() throws InvalidInputException {
		Hackathon.m14(4,56,8);
		assertTrue(outContent.toString().equals("4"+nl+"8"+nl+"56"+nl));
		outContent.reset();
	}

	@Test
	public void m14Test3() throws InvalidInputException {
		Hackathon.m14(56,4,8);
		assertTrue(outContent.toString().equals("4"+nl+"8"+nl+"56"+nl));
		outContent.reset();
	}

	@Test
	public void m14Test4() throws InvalidInputException {
		Hackathon.m14(56,8,4);
		assertTrue(outContent.toString().equals("4"+nl+"8"+nl+"56"+nl));
		outContent.reset();
	}

	@Test
	public void m14Test5() throws InvalidInputException {
		Hackathon.m14(4,56,8);
		assertTrue(outContent.toString().equals("4"+nl+"8"+nl+"56"+nl));
		outContent.reset();
	}
}
