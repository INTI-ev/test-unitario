package general;

import general.SampleStaticRoutines;
import general.SampleStaticRoutines2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SampleStaticRoutinesLargestParamTest {

	private Integer [] array;
	private Integer res;
	
	public SampleStaticRoutinesLargestParamTest(Object [] array, Object res) {
		this.array = (Integer[]) array;
		this.res = (Integer) res;
	}
	
	@Parameters
	public static Collection<Object[]> firstValues() {
	 return Arrays.asList(new Object[][] {
	   {new Integer [] { 1,2,3 }, 3 },
	   {new Integer [] { 2,1,3 }, 3 },
	   {new Integer [] { 3,1,2 }, 3 },
	   {new Integer [] { 3,1,2,-4,7,12 }, 12 },
	   {new Integer [] { -3,-1,-2 }, -1 },
	   {new Integer [] { 3,1,2,5,4,6 }, 6 },
	 });
	}
	
	@Test
	public void testFirst() {
		int max = SampleStaticRoutines2.largest((Integer[]) array);
		org.junit.Assert.assertEquals((int)res, max);
	}

}
