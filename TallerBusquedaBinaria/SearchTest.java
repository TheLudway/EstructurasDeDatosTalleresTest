package co.edu.utadeo.fcni;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	@Test
	public void test1() {
		int[] list1={11, 9, 22, 32, 9};
		assertTrue(Search.simpleSearch(11,list1)==0);
	}

	@Test
	public void test2() {
		int[] list1={11, 9, 22, 32, 9};
		assertTrue(Search.simpleSearch(9,list1)==1 || Search.simpleSearch(9,list1)==4);
	}

	@Test
	public void test3() {
		int[] list1={11, 9, 22, 32, 9};
		assertTrue(Search.simpleSearch(22,list1)==2);
	}

	@Test
	public void test4() {
		int[] list1={11, 9, 22, 32, 9};
		assertTrue(Search.simpleSearch(32,list1)==3);
	}

	@Test
	public void test5() {
		int[] list1={11, 9, 22, 32, 9};
		assertTrue(Search.simpleSearch(33,list1)==-1);
	}

	@Test
	public void test6() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(2,list2)==0);
	}

	@Test
	public void test7() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(9,list2)==1);
	}

	@Test
	public void test8() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(22,list2)==2);
	}

	@Test
	public void test9() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(32,list2)==3);
	}

	@Test
	public void test10() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(90,list2)==4);
	}

	@Test
	public void test11() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(1,list2)==-1);
	}

	@Test
	public void test12() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(5,list2)==-1);
	}

	@Test
	public void test13() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(25,list2)==-1);
	}

	@Test
	public void test14() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(35,list2)==-1);
	}

	@Test
	public void test15() {
		int[] list2={2, 9, 22, 32, 90};
		assertTrue(Search.binarySearch(99,list2)==-1);
	}

}
