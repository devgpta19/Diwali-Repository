import java.util.Arrays;
import java.util.Scanner;

public class CodingChallenge {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array1");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter Elements of Array1 (Assumed Sorted Ascendingly)");
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        
        System.out.println("Enter Size of Array2");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter Elements of Array2 (Assumed Sorted Ascendingly)");
        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        
        sc.close();
        
        int totalLength = n + m;
        int[] arr = new int[totalLength];
        
        int ptr1 = 0;
        int ptr2 = 0; 
        int arrIndex = 0;
        
        while (ptr1 < n && ptr2 < m) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                arr[arrIndex] = nums1[ptr1];
                ptr1++;
            } else {
                arr[arrIndex] = nums2[ptr2];
                ptr2++;
            }
            arrIndex++;
        }
        
        while (ptr1 < n) {
            arr[arrIndex] = nums1[ptr1];
            ptr1++;
            arrIndex++;
        }
        
        while (ptr2 < m) {
            arr[arrIndex] = nums2[ptr2];
            ptr2++;
            arrIndex++;
        }
        
        String str = Arrays.toString(arr); 
        System.out.println("Sorted Merged Array: " + str);
    }

}