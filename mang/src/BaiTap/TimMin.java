package BaiTap;

public class TimMin {
    public static void main(String[] args) {
        int[][] ints = {{1, 2, 3}, {123, 123, 555}, {6, 4, 77}};
        int min = ints[0][0];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] < min) {
                    min = ints[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
