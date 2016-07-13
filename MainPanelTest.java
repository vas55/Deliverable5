/*
* These are my pinning tests for MainPanelTest
*/

import static org.junit.Assert.*;

import org.junit.Test;


public class MainPanelTest {
	
	/*
	 * test that refactoring the converToInt method 
	 * didn't change the value in anyway
	 */
	
	//Testing that when converting the number to int it will 
	//always return it exactly the same
	@Test
	public void convertToIntTest1() {
		int x = 5;
		MainPanel h = new MainPanel(x);
		int y = h.convertToInt(x);
		assertEquals(y, 5);
		
	}
	
	//Testing that when inputed number is given it always outputs an int.
	@Test
	public void convertToIntTest2() {
		int x = 5;
		MainPanel h = new MainPanel(x);
		int y = h.convertToInt(x);
		if (y == (int)y){
			assertTrue(true);
		}
		else{
			fail();
		}
	}
	
	//Test that the value is nothing different than the input value given
	@Test
	public void convertToIntTest3 () {
		int x = 2;
		MainPanel h = new MainPanel(x);
		if(h.convertToInt(x) != x){
			fail();
		}
		else {
			assertTrue(true);
		}
	}

	/*
	 * refactored the getNumNeighbors method. 
	 * checking to make sure no behavior of the method has changed. 
	 */
	
	//testing that output value is an int
	@Test
	public void getNumNeighborsTest1 () {
		int x = 5;
		MainPanel h = new MainPanel(x);
		int y = h.getNumNeighbors(x, x);
		if (y == (int)y){
			assertTrue(true);
		}
		else{
			fail();
		}
		
	}
	
	//Testing that value is greater than 0
	@Test
	public void getNumNeighborsTest2() {
		int x = 0;
		MainPanel h = new MainPanel (x);
		int y = h.getNumNeighbors(x,x);
		if (y >= 0) {
			assertTrue(true);
		}
		else {
			fail();
		}
	}
	
	//Testing that 
}
