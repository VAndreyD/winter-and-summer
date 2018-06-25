import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class WinterAndSummerTest {
    @Test
    public void solutionTest() {
        int[] T1 = {5, -2, 3, 8, 6};
        Assert.assertEquals(3, WinterAndSummerSolution.solution(T1));
        int[] T2 = {-5, -5, -5, -42, 6, 12};
        Assert.assertEquals(4, WinterAndSummerSolution.solution(T2));
        int[] T3 = {-5, -5, 4, -42, 6, 12};
        Assert.assertEquals(4, WinterAndSummerSolution.solution(T3));
        int[] T4 = {-5, 25};
        Assert.assertEquals(1, WinterAndSummerSolution.solution(T4));
    }
}
