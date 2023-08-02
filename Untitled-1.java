import java.util.*;
class main{
class public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.print("Enter the elements: ");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("The subarrays are-");
      for (int i = 0; i < arr.length; i++) {
         for (int j = i; j < arr.length; j++) {
            for (int k = i; k <=j; k++) {
               System.out.print(arr[k] + " ");
            }
            System.out.println("");
         }
      }

}
}