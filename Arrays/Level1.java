import java.util.*;
public class   Level1 {
    public static void main(String[] args) {
        Scanner scnn=new Scanner(System.in);
        
        // Q1
        // int n=scnnnn.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=scnnnn.nextInt();
        //     if(arr[i]<0){
        //         System.out.println("Invalid number");
        //     }
        //     else if(arr[i]>=18){
        //         System.out.println("The student with the age "+arr[i] + " can vote");
        //     }
        //     else {
        //         System.out.println("The student with the age "+arr[i] + " cannot vote");
        //     }
        // }

        // Q2
        // int n=scnnnn.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=scnnnn.nextInt();
            
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         System.out.println(arr[i]+" The num is zero");
        //     }
        //     else if(arr[i]<0){
        //         System.out.println(arr[i]+" The num is negative");
        //     }
        //     else{
        //         if(arr[i]%2==0){
        //             System.out.println(arr[i]+" The num is Positive and even also");
        //         }
        //         else{
        //             System.out.println(arr[i]+" The num is Positive and odd also");
        //         }
        //     }
            
        // }
        // if(arr[0]==arr[n-1]){
        //     System.out.println("first and last ele is equal");
        // }
        // else if(arr[0]>arr[n-1]){
        //     System.out.println("first ele is Greater");
        // }
        // else{
        //     System.out.println("Last ele is Greater");

        // }


        // Q3
        // int number=scnnnn.nextInt();
        // int arr[]=new int[10];
        // for(int i=1;i<11;i++){
        //     arr[i-1]=number*i;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("number * i = "+arr[i]);
        // }

        // Q4
        // double[] values = new double[10];
        // double total = 0.0;
        // int index = 0;
        // System.out.println("Enter numbers (max 10, stop with 0 or negative):");
        // while (true) {
        //     double num = scnnnn.nextDouble();
        //     if (num <= 0 || index == 10) {
        //         break;
        //     }
        //     values[index] = num;
        //     index++;
        // }
        // System.out.println("You entered:");
        // for (int i = 0; i < index; i++) {
        //     System.out.print(values[i] + " ");
        //     total += values[i];
        // }
        // System.out.println("\nSum of entered numbers: " + total);


        // Q5
        // int[] multiplicationResult = new int[10];
        // System.out.print("Enter a number between 6 and 9: ");
        // int number = scnnnn.nextInt();
        // if (number < 6 || number > 9) {
        //     System.out.println("Number must be between 6 and 9.");
        //     return;
        // }
        // for (int i = 0; i < 10; i++) {
        //     multiplicationResult[i] = number * (i + 1);
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        // }

        // Q6
        //   double[] heights = new double[11];
        // double sum = 0;
        // System.out.println("Enter heights of 11 players:");
        // for (int i = 0; i < heights.length; i++) {
        //     heights[i] = scnnnn.nextDouble();
        //     sum += heights[i];
        // }
        // double mean = sum / heights.length;
        // System.out.println("Mean height of football team: " + mean);

        // Q7
        // System.out.print("Enter a natural number: ");
        // int number = scnnnn.nextInt();
        // if (number <= 0) {
        //     System.out.println("Error: Enter a natural number.");
        //     return;
        // }
        // int[] odd = new int[number / 2 + 1];
        // int[] even = new int[number / 2 + 1];
        // int oddIndex = 0, evenIndex = 0;
        // for (int i = 1; i <= number; i++) {
        //     if (i % 2 == 0) {
        //         even[evenIndex++] = i;
        //     } else {
        //         odd[oddIndex++] = i;
        //     }
        // }
        // System.out.print("Odd numbers: ");
        // for (int i = 0; i < oddIndex; i++) {
        //     System.out.print(odd[i] + " ");
        // }
        // System.out.print("\nEven numbers: ");
        // for (int i = 0; i < evenIndex; i++) {
        //     System.out.print(even[i] + " ");
        // }

        // // Q8
        //  System.out.print("Enter a number: ");
        // int num = scnnnn.nextInt();
        // int maxFactor = 10;
        // int[] factors = new int[maxFactor];
        // int index = 0;
        // for (int i = 1; i <= num; i++) {
        //     if (num % i == 0) {
        //         if (index == maxFactor) {
        //             maxFactor *= 2;
        //             int[] temp = new int[maxFactor];
        //             for (int j = 0; j < factors.length; j++) {
        //                 temp[j] = factors[j];
        //             }
        //             factors = temp;
        //         }
        //         factors[index++] = i;
        //     }
        // }
        // System.out.print("Factors of " + num + ": ");
        // for (int i = 0; i < index; i++) {
        //     System.out.print(factors[i] + " ");
        // }


        // Q9
        // System.out.print("Enter number of rows: ");
        // int rows = scnn.nextInt();
        // System.out.print("Enter number of columns: ");
        // int cols = scnn.nextInt();
        // int[][] matrix = new int[rows][cols];
        // System.out.println("Enter elements of the matrix:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         matrix[i][j] = scnn.nextInt();
        //     }
        // }
        // int[] array = new int[rows * cols];
        // int index = 0;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         array[index++] = matrix[i][j];
        //     }
        // }
        // System.out.print("1D Array: ");
        // for (int val : array) {
        //     System.out.print(val + " ");
        // }

        // Q10
        System.out.print("Enter a positive number: ");
        int n = scnn.nextInt();
        if (n <= 0) {
            System.out.println("Number must be positive.");
            return;
        }
        String[] results = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
