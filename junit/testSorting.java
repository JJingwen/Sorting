import static org.junit.Assert.*;

import org.junit.Test;

public class testSorting {

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {3,2,1};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {3,2,1};
		ss.swapReferences(aaa, 1, 2);
		ss.swap(aa, 1, 2);
		assertEquals(false, ss.isSorted(aa));
		
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {2,5,1};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {2,5,1};
		ss.swapReferences(aaa, 1, 2);
		ss.swap(aa, 1, 2);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}

	@Test
	public void test3() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {0,0,0};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {0,0,0};
		ss.swapReferences(aaa, 1, 2);
		ss.swap(aa, 1, 2);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	
	@Test
	public void test4() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {1,2,3,6};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {1,2,3,6};
		ss.swapReferences(aaa, 2, 1);
		ss.swap(aa, 1, 2);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	
	@Test
	public void test5() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {1,2,3,6,0};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {1,2,3,6,0};
		ss.swapReferences(aaa, 3, 4);
		ss.swap(aa, 1, 2);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	
	@Test
	public void test6() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {1,2,-1,6,0};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {1,2,-1,6,0};
		ss.swapReferences(aaa, 2, 1);
		ss.swap(aa, 1, 2);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	
	@Test
	public void test7() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {1,2,192,6,0};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {1,2,192,6,0};
		ss.swapReferences(aaa, 2, 1);
		ss.swap(aa, 1, 2);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	
	@Test
	public void test8() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {1,2,192,6,0,-2};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {1,2,192,6,0,-2};
		ss.swapReferences(aaa, 2, 1);
		ss.swap(aa, 2, 5);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	@Test
	public void test9() {
		//fail("Not yet implemented");
		Sorting ss = new Sorting();
		
		int [] aa = {1,2,192,6,0,3,2,1,5,4,3,2,1,6,5,4,3,2,1};
		ss.insertionSort(aa);
		assertEquals(true, ss.isSorted(aa));
		ss.quicksort(aa);
		Object[] aaa = {1,2,192,6,0,3,2,1,5,4,3,2,1,6,5,4,3,2,1};
		ss.swapReferences(aaa, 6, 15);
		ss.swap(aa, 6, 15);
		ss.quicksort(aa);
		assertEquals(true, ss.isSorted(aa));
	}
	
	
}
