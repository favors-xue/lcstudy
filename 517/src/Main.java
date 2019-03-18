public class Main {

    public static void main(String[] args) {
        int[] test = new int[]{1,0,6,1};

        Solution s = new Solution();
        int move = s.findMinMoves(test);
        System.out.println(move);
    }
}
