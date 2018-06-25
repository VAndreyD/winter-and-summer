public class WinterAndSummerSolution {

    public static int solution(int[] T) {
        int maxTemp = T[0];
        if (T.length >= 3) {
            for (int i = 0; i < T.length; i++) {
                if (T[i] > maxTemp) {
                    if (T[i + 1] > maxTemp) {
                        return i;
                    } else {
                        maxTemp = T[i];
                    }
                }
            }
        }
        return 1;
    }
}
