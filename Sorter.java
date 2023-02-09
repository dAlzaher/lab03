import java.util.Arrays;
public class Sorter {
    public static void main(String[] args) {
        // Assuming:   A.Dhaffer     B.Hayder

        // this is only a test case
        int[] numbers = {4,2,6,8,5,2,5,4,9,11,23,7,0};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    //this is the requirement of 6.b in the PDF file
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    //this is the requirement of 9 in the PDF file
    public static void sort(int[] arr){
        insertionSort(arr);
    }

}
//    next is:
//        1- addition of selectionSort method
//        2- addition of the method sort(array) that call selection sort
//        3- pulling the project that Hayder pushed earlier
//        4- solve any conflict
//        5- push the final version of the project
//        6- prepare the PDF report for submission