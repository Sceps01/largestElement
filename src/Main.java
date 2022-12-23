import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] arr = new int[] { 19,23,32,14,50,11,4};
      int largest;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        largest = arr[arr.length - 1];
        System.out.println("the largest number in th array is: " + largest);

        for( int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        } System.out.println("the largest is " + largest);
    }
}