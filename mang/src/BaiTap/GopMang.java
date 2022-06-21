package BaiTap;

public class GopMang {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4};
        int[] intArray2 = {5, 6, 7, 8};
        int[] sumArray = new int[intArray1.length + intArray2.length];

        for (int i = 0; i < sumArray.length; i++) {
            if (i < intArray1.length) {
                sumArray[i] = intArray1[i];
            } else {
                sumArray[i] = intArray2[i - intArray1.length];
            }
        }

        for (int e : sumArray) {
            System.out.print(e + "; ");
        }
    }
}
