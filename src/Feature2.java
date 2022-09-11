public class Feature2 {
    static void maxArray(){
        int max;
        int number[] = new int[]{23,2,34,54,23,12,76};
        max = number[0];
        for (int i=0 ; i<number.length;i++){
            if(number[i]> max){
                max= number[i];
            }
        }
        System.out.println("Max of array ="+ max);
    }
}
