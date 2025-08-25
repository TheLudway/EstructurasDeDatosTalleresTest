package co.edu.utadeo.fcni;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParenthesisCheckerTest {

	@Test
	public void test1() {
		assertTrue(ParenthesisChecker.isValid(""));
	}

	@Test
	public void test2() {
		assertTrue(ParenthesisChecker.isValid("abcde"));
	}

	@Test
	public void test3() {
		assertTrue(ParenthesisChecker.isValid("()"));
	}

	@Test
	public void test4() {
		assertTrue(ParenthesisChecker.isValid("[]"));
	}

	@Test
	public void test5() {
		assertTrue(ParenthesisChecker.isValid("{}"));
	}

	@Test
	public void test6() {
		assertTrue(ParenthesisChecker.isValid("ab{cd}ef"));
	}

	@Test
	public void test7() {
		assertTrue(ParenthesisChecker.isValid("()[]{}"));
	}

	@Test
	public void test8() {
		assertTrue(ParenthesisChecker.isValid("((()))"));
	}

	@Test
	public void test9() {
		assertTrue(ParenthesisChecker.isValid("({[]})"));
	}

	@Test
	public void test10() {
		assertTrue(ParenthesisChecker.isValid("({[([])]})({[([])]})"));
	}

	@Test
	public void test11() {
		assertTrue(ParenthesisChecker.isValid("({[([]()){}]})({{[]}[([])]})"));
	}

	@Test
	public void test12() {
		assertFalse(ParenthesisChecker.isValid("("));
	}

	@Test
	public void test13() {
		assertFalse(ParenthesisChecker.isValid(")"));
	}

	@Test
	public void test14() {
		assertFalse(ParenthesisChecker.isValid("[[]"));
	}

	@Test
	public void test15() {
		assertFalse(ParenthesisChecker.isValid("[[)"));
	}

	@Test
	public void test16() {
		assertFalse(ParenthesisChecker.isValid("[[{{}}]]]"));
	}

	@Test
	public void test17() {
		assertFalse(ParenthesisChecker.isValid("[[{{}}])[]"));
	}

	@Test
	public void test18() {
		assertFalse(ParenthesisChecker.isValid("{]"));
	}

	@Test
	public void test19() {
		assertFalse(ParenthesisChecker.isValid("((((()))})"));
	}

	@Test
	public void test20() {
		assertFalse(ParenthesisChecker.isValid("{[{[]}]}("));
	}
}
