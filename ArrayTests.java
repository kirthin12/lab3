import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceWMany()
  {
    int[] input = {1, 2, 3};
    int[] reverseInput = {3,2,1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals (reverseInput, input);
  }

  @Test
  public void testReversedWMany()
  {
    int[] input = {1, 2, 3, 4, 5};
    int[] reverseInput = {5,4,3,2,1};
    assertArrayEquals (reverseInput, ArrayExamples.reversed(input));
  }

  @Test
  public void averageWithoutLowest()
  {
    double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input), 0.0);
  }

  @Test
  public void averageWithoutLowestWMultipleCpoiesOfLowest()
  {
    double[] input = {1.0, 1.0, 1.0, 2.0, 3.0, 4.0};
    assertEquals(2.2, ArrayExamples.averageWithoutLowest(input), 0.0);
  }
  
}
