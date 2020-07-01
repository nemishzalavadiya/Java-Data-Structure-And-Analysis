package Sorting;
import java.util.*;

 class quicksort_length_of_string   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }
        input.close();
        Arrays.sort(arr,
        new Comparator<String>()
        {
          public int compare(String s1,String s2)
           {
            return s1.length() - s2.length();
            }
        }
        );
        quicksort_length_of_string .printArray(arr);
    }
    public static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.println( arr[i]);
    }
 }
