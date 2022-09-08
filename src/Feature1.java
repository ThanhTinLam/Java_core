public class Feature1 {
    static void maxArray() {
        int min;
        int number[] = new int[]{3, 5, 7, 8, 23, 34, 54, 23};
        min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Min of array ="+ min);
    }


}
