package co.edu.utadeo.flexlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlexListTest {

	@Test
	public void isEmptyTest() {
		FlexList f = new FlexList();
		assertTrue(f.isEmpty());
	}

	@Test
	public void isEmptyTest2() {
		FlexList f = new FlexList(new int[]{4, 5});
		assertFalse(f.isEmpty());
	}

	@Test
	public void getSizeTest() {
		FlexList f = new FlexList();
		assertTrue(f.getSize()==0);
	}

	@Test
	public void getSizeTest2() {
		FlexList f = new FlexList(new int[]{4, 5});
		assertTrue(f.getSize()==2);
	}

	@Test
	public void getSizeTest3() {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23});
		assertTrue(f.getSize()==4);
	}

	@Test
	public void getSizeTest4() {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		assertTrue(f.getSize()==5);
	}

	@Test
	public void clearTest() {
		FlexList f = new FlexList();
		f.clear();
		assertTrue(f.getSize()==0);
	}

	@Test
	public void clearTest2() {
		FlexList f = new FlexList(new int[]{4, 5});
		f.clear();
		assertTrue(f.getSize()==0);
	}

	@Test
	public void clearTest3() {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23});
		f.clear();
		assertTrue(f.getSize()==0);
	}

	@Test
	public void clearTest4() {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.clear();
		assertTrue(f.getSize()==0);
	}

	@Test
	public void getTest() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5});
		assertTrue(f.get(0)==4);
		assertTrue(f.get(1)==5);
	}

	@Test
	public void getTest2() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		assertTrue(f.get(0)==4);
		assertTrue(f.get(1)==5);
		assertTrue(f.get(2)==67);
		assertTrue(f.get(3)==23);
		assertTrue(f.get(4)==5);
	}

	@Test(expected=InvalidIndexException.class)
	public void getTest3() throws InvalidIndexException {
		FlexList f = new FlexList();
		f.get(3);
	}

	@Test(expected=InvalidIndexException.class)
	public void getTest4() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5});
		f.get(3);
	}

	@Test
	public void removeTest() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.remove(0);
		int[] expected = {5, 67, 23, 5, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==4);
	}

	@Test
	public void removeTest2() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.remove(1);
		int[] expected = {4, 67, 23, 5, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==4);
	}

	@Test
	public void removeTest3() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.remove(2);
		int[] expected = {4, 5, 23, 5, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==4);
	}

	@Test
	public void removeTest4() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.remove(3);
		int[] expected = {4, 5, 67, 5, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==4);
	}

	@Test
	public void removeTest5() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.remove(4);
		int[] expected = {4, 5, 67, 23, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==4);
	}

	@Test(expected=InvalidIndexException.class)
	public void removeTest6() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.remove(5);
	}

	@Test(expected=InvalidIndexException.class)
	public void removeTest7() throws InvalidIndexException {
		FlexList f = new FlexList();
		f.remove(2);
	}

	@Test(expected=InvalidIndexException.class)
	public void removeTest8() throws InvalidIndexException {
		FlexList f = new FlexList(new int[]{4, 5});
		f.remove(2);
	}

	@Test(expected=ListFullException.class)
	public void addTest() throws ListFullException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.add(5);
	}

	@Test(expected=ListFullException.class)
	public void addTest1() throws InvalidIndexException, ListFullException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.add(0, 5);
	}

	@Test(expected=ListFullException.class)
	public void addTest2() throws InvalidIndexException, ListFullException {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23, 5});
		f.add(4, 5);
	}

	@Test(expected=InvalidIndexException.class)
	public void addTest3() throws InvalidIndexException, ListFullException {
		FlexList f = new FlexList();
		f.add(4, 5);
	}

	@Test(expected=InvalidIndexException.class)
	public void addTest4() throws InvalidIndexException, ListFullException {
		FlexList f = new FlexList(new int[]{4, 5});
		f.add(3, 5);
	}

	@Test
	public void addTest5() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList();
		f.add(25);
		int[] expected = {25, 0, 0, 0, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==1);
	}

	@Test
	public void addTest6() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList(new int[]{4, 5});
		f.add(25);
		int[] expected = {4, 5, 25, 0, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==3);
	}

	@Test
	public void addTest7() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList();
		f.add(0,25);
		int[] expected = {25, 0, 0, 0, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==1);
	}

	@Test
	public void addTest8() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList(new int[]{4, 5});
		f.add(2,25);
		int[] expected = {4, 5, 25, 0, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==3);
	}

	@Test
	public void addTest9() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList(new int[]{4, 5});
		f.add(1,25);
		int[] expected = {4, 25, 5, 0, 0};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==3);
	}

	@Test
	public void addTest10() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList(new int[]{4, 5, 67, 23});
		f.add(1,25);
		int[] expected = {4, 25, 5, 67, 23};
		int[] actual = f.toArray();
		assertArrayEquals(expected, actual);
		assertTrue(f.getSize()==5);
	}

	@Test(expected=InvalidIndexException.class)
	public void addTest11() throws ListFullException, InvalidIndexException  {
		FlexList f = new FlexList(new int[]{4, 5});
		f.add(3,25);
	}


}
