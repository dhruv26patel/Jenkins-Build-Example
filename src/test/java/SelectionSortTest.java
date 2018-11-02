import org.junit.*;

public class SelectionSortTest {

    @Test
    public void selectionSort_SortingUnsortedList(){
        SelectionSort tester = new SelectionSort();

        int[] testArr = {4,2,88,10,22};
        int[] solutionArr = {2,4,10,22,88};

        Assert.assertArrayEquals(tester.sort(testArr), solutionArr);

    }

    @Test
    public void selectionSort_EmptyList(){
        SelectionSort tester = new SelectionSort();

        int[] testArr = {};
        int[] solutionArr = null;

        Assert.assertArrayEquals(tester.sort(testArr), solutionArr);

    }

}
