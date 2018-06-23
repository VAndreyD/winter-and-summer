public class WinterAndSummerSolution {

    public static int solution(int[] T){
        int maxWint = T[0];
        for (int i = 1; i < T.length; i++) {
            if (T[i+1] > maxWint){
                return i+1;
            }
        }
        return 0;
    }
}
