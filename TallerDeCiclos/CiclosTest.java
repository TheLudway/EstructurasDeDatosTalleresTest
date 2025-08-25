package co.edu.utadeo.fcni;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CiclosTest {

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
	public void testEjercicio1() {
		outContent.reset();
		new Ciclos().ejercicio1();
		assertTrue(outContent.toString().equals("1"+nl+"-3"+nl+"9"+nl+"-27"+nl+"81"+nl+"-243"+nl+"729"+nl+"-2187"+nl));
	}

	@Test
	public void testEjercicio2_1() {
		InputStream savedStandardInputStream = System.in;
		String input = "0";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		int result = new Ciclos().ejercicio2();
		System.setIn(savedStandardInputStream);
		assertTrue(result==0);
	}

	@Test
	public void testEjercicio2_2() {
		InputStream savedStandardInputStream = System.in;
		String input = "3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		int result = new Ciclos().ejercicio2();
		System.setIn(savedStandardInputStream);
		assertTrue(result==2);
	}

	@Test
	public void testEjercicio2_3() {
		InputStream savedStandardInputStream = System.in;
		String input = "10";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		int result = new Ciclos().ejercicio2();
		System.setIn(savedStandardInputStream);
		assertTrue(result==30);
	}

	@Test
	public void testEjercicio3_1() {
		InputStream savedStandardInputStream = System.in;
		String input = "0\n5\n4\n-1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		int result = new Ciclos().ejercicio3();
		System.setIn(savedStandardInputStream);
		assertTrue(result==9);
	}

	@Test
	public void testEjercicio3_2() {
		InputStream savedStandardInputStream = System.in;
		String input = "-1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		int result = new Ciclos().ejercicio3();
		System.setIn(savedStandardInputStream);
		assertTrue(result==0);
	}

	@Test
	public void testEjercicio3_3() {
		InputStream savedStandardInputStream = System.in;
		String input = "7\n10\n-10\n-7\n-1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		int result = new Ciclos().ejercicio3();
		System.setIn(savedStandardInputStream);
		assertTrue(result==0);
	}


}
