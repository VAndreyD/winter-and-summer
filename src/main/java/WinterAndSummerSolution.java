public class WinterAndSummerSolution {

    public static int solution(int[] T) {
        int maxTemp = T[0];
        for (int i = 0; i < T.length; i++) {
            if (T[i] > maxTemp) {
                try {
                    if (T[i + 1] > maxTemp) {
                        return i;
                    } else {
                        maxTemp = T[i];
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    return i;
                }
            }
        }

        return 1;
    }
}
