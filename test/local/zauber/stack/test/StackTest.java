package local.zauber.stack.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import local.zauber.stack.Stack;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	Stack stack;
	
	@Before
	public void setUp() throws Exception{
		stack = new Stack();
	}
	
	@Test
	public void testIsEmpty() throws Exception{
		assertThat(stack.isEmpty(), is(true));
	}
	
	@Test
	public void testPush() throws Exception{
		stack.push(1);
		assertThat(stack.isEmpty(), is(false));
	}
	
	@Test
	public void testSize() throws Exception{
		assertThat(stack.size(), is(0));
		stack.push(1);
		assertThat(stack.size(), is(1));
	}
	
	@Test
	public void testPushAndPop() throws Exception {
		stack.push(1);
		assertThat(stack.pop(), is(1));
		assertThat(stack.size(), is(0));
		stack.push(2);
		assertThat(stack.pop(), is(2));
		assertThat(stack.size(), is(0));
		stack.push(3);
		stack.push(4);
		assertThat(stack.size(), is(2));
	}
	
	@Test
	public void testManyPush() throws Exception {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		assertThat(stack.size(), is(10));
		stack.push(11);
		assertThat(stack.size(), is(11));
	}
	
	@Test
	public void testTop() throws Exception{
		stack.push(1);
		assertThat(stack.top(), is(1));
		assertThat(stack.size(), is(1));
		assertThat(stack.top(), is(1));
		stack.push(2);
		assertThat(stack.top(), is(2));
		assertThat(stack.size(), is(2));
	}
	
	@Test
	public void testSearch() throws Exception {
		stack.push(1);
		assertThat(stack.search(1), is(1));
		stack.push(2);
		assertThat(stack.search(1), is(2));
		assertThat(stack.search(3), is(-1));
	}
	
}
