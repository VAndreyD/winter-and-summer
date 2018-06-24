import java.util.Arrays;

public class WinterAndSummerSolution {

    public static int solution(int[] T) {
        int maxTemp = T[0];
        for (int i = 1; i < T.length; i++) {
            if (T[i] > maxTemp) {
                int avg = avgT(Arrays.copyOf(T, i+1),  i+1);
                int avgTempNext = avgT(Arrays.copyOf(T, i + 2), i + 1);
                {
                    if (avgTempNext > avg) {
                        return i;
                    } else {
                        maxTemp = T[i];
                    }
                }
            }
        }
        return 1;
    }

    private static int avgT(int[] T, int count) {
        int sumElem = 0;
        for (int i = 0; i < T.length; i++) {
            sumElem += T[i];
        }
        return sumElem / (count);
    }
}
