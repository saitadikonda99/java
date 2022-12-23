import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for( int k=0; k<arr.length; k++ ) {
            arr[k] = in.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = in.nextInt();
        int ans = BinarySearch( arr , target );
        System.out.println("index : " + ans);

    }
    static int BinarySearch( int[] arr , int target ) {
        int start = 0;
        int end = arr.length -1;
        while( start <= end) {
            int mid = start  + (end - start ) / 2;
            if( arr[mid] > target)
                 end = mid - 1;
            else if( arr[mid] < target )
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}