package co.edu.utadeo.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedStackTest {

	@Test
	public void nodeTest1() {
		Node n = new Node(5);
		assertTrue(n.getData()==5);
	}

	@Test
	public void nodeTest2() {
		Node n = new Node(5);
		n.setData(10);
		assertTrue(n.getData()==10);
	}
	
	@Test
	public void nodeTest3() {
		Node n = new Node(5);
		assertTrue(n.getNext()==null);
	}

	@Test
	public void nodeTest4() {
		Node n = new Node(5);
		Node m = new Node(10);
		n.setNext(m);
		assertTrue(n.getNext()==m);
		assertTrue(n.getNext().getData()==10);
	}

	@Test
	public void nodeTest5() {
		Node n = new Node(5);
		Node m = new Node(10);
		n.setNext(m);
		assertTrue(n.getNext()==m);
		m.setData(25);
		assertTrue(n.getNext().getData()==25);
	}
	
	
	@Test
	public void lifoTest1() throws StackOverflowException, StackUnderflowException {
		LinkedStack s = new LinkedStack();
		s.push(1);
		assertTrue(s.pop() == 1);
	}

	@Test
	public void lifoTest2() throws StackOverflowException, StackUnderflowException {
		LinkedStack s = new LinkedStack();
		s.push(1);
		s.push(2);
		assertTrue(s.pop() == 2);
		assertTrue(s.pop() == 1);
	}
	
	@Test
	public void lifoTest3() throws StackOverflowException, StackUnderflowException {
		LinkedStack s = new LinkedStack();
		s.push(3);
		s.push(2);
		s.push(1);
		assertTrue(s.pop() == 1);
		assertTrue(s.pop() == 2);
		assertTrue(s.pop() == 3);
	}
	
	@Test
	public void lifoTest4() throws StackOverflowException, StackUnderflowException {
		LinkedStack s = new LinkedStack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		assertTrue(s.pop() == 1);
		assertTrue(s.pop() == 2);
		assertTrue(s.pop() == 3);
		assertTrue(s.pop() == 4);
	}
	
	@Test
	public void lifoTest5() throws StackOverflowException, StackUnderflowException {
		LinkedStack s = new LinkedStack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		assertTrue(s.pop() == 1);
		assertTrue(s.pop() == 2);
		assertTrue(s.pop() == 3);
		assertTrue(s.pop() == 4);
		assertTrue(s.pop() == 5);
	}
	
	
	
	@Test
	public void emptyStackTest1() {
		LinkedStack s = new LinkedStack();
		assertTrue(s.isEmpty());
	}

	@Test
	public void emptyStackTest2() throws StackOverflowException {
		LinkedStack s = new LinkedStack();
		s.push(1);
		assertFalse(s.isEmpty());
	}

	@Test
	public void emptyStackTest3() throws StackOverflowException {
		LinkedStack s = new LinkedStack();
		s.push(1);
		s.push(3);
		s.push(2);
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void isFullTest1() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		assertFalse(s.isFull());
	}

	@Test
	public void isFullTest2() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		assertFalse(s.isFull());
	}
	
	@Test
	public void isFullTest3() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		assertFalse(s.isFull());
	}
	
	@Test
	public void getSizeTest1() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		assertTrue(s.getSize()==5);
	}

	@Test
	public void getSizeTest2() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		assertTrue(s.getSize()==0);
	}
	
	@Test
	public void getSizeTest3() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		assertTrue(s.getSize()==4);
	}
	
	@Test
	public void stackOverFlowTest() throws StackOverflowException{
		LinkedStack s = new LinkedStack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
	}

	@Test(expected=StackUnderflowException.class)
	public void stackUnderFlowTest() throws StackUnderflowException {
		LinkedStack s = new LinkedStack();
		s.pop();
	}

	@Test(expected=StackUnderflowException.class)
	public void stackUnderFlowTest2() throws StackUnderflowException, StackOverflowException {
		LinkedStack s = new LinkedStack();
		s.push(1);
		s.pop();
		s.pop();
	}

	@Test(expected=StackUnderflowException.class)
	public void stackUnderFlowTest3() throws StackUnderflowException, StackOverflowException {
		LinkedStack s = new LinkedStack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

}




