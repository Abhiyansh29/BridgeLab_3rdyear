import java.util.Arrays;
import java.util.Scanner;

public class Level2 {

    // Q1
    // public static void sum(int arr[]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=arr[i];
    //     }
    //     System.out.println(sum);
    // }
    // public static void product(int arr[]){
    //     int prod=1;
    //     for(int i=0;i<arr.length;i++){
    //         prod*=arr[i];
    //     }
    //     System.out.println(prod);
    // }
    // public static void sq(int arr[]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=Math.pow(arr[i],2);
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     Scanner scn=new Scanner(System.in);
    //     int n=scn.nextInt();
    //     int cnt=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             cnt++;
    //         }
    //     }
    //     int arr[]=new int[cnt];
    //     int k=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             arr[k]=i;
    //             k++;
    //         }
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    //     sum(arr);
    //     product(arr);
    //     sq(arr);
    
     // }

    //  Q2

    // public static int sum(int n){
    //     int su=0;
    //     for(int i=0;i<=n;i++){
    //         su+=i;
    //     }
    //     return su;
    // }
    // public static void main(String[] args) {
    //     Scanner scn=new Scanner(System.in);
    //     int n=scn.nextInt();
    //     int y=sum(n);
    //     int fo=n*(n+1)/2;
    //     System.out.println(y);
    //     System.out.println(fo);
    //     System.out.println(y==fo);
        
        
    // }


    // Q3
    // public static void check(int year){
    //     if(year%4==0){
    //         if(year%100==0){
    //             if(year%400==0){
    //                 System.out.println("Leap Year");
    //             }
    //             else{
    //                 System.out.println("Not leap year");
    //             }
    //         }
    //         else{
    //             System.out.println("Not leap year");
    //         }
    //     }
    //     else{
    //         System.out.println("Not leap year");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner scn=new Scanner(System.in);
    //     int year=scn.nextInt();
    //     check(year);
    // }

    //  Q4
    //  public static double convertKmToMiles(double km) {
    //     double km2miles = 0.621371;
    //     return km * km2miles;
    // }

  
    // public static double convertMilesToKm(double miles) {
    //     double miles2km = 1.60934;
    //     return miles * miles2km;
    // }


    // public static double convertMetersToFeet(double meters) {
    //     double meters2feet = 3.28084;
    //     return meters * meters2feet;
    // }

    
    // public static double convertFeetToMeters(double feet) {
    //     double feet2meters = 0.3048;
    //     return feet * feet2meters;
    // }
    // public static void main(String[] args) {
    //     System.out.println("10 km = " + convertKmToMiles(10) + " miles");
    //     System.out.println("5 miles = " + convertMilesToKm(5) + " km");
    //     System.out.println("100 meters = " + convertMetersToFeet(100) + " feet");
    //     System.out.println("50 feet = " + convertFeetToMeters(50) + " meters");
    // }

    // Q5
    //  public static double convertYardsToFeet(double yards) {
    //     double yards2feet = 3;
    //     return yards * yards2feet;
    // }

   
    // public static double convertFeetToYards(double feet) {
    //     double feet2yards = 0.333333;
    //     return feet * feet2yards;
    // }

    // public static double convertMetersToInches(double meters) {
    //     double meters2inches = 39.3701;
    //     return meters * meters2inches;
    // }

   
    // public static double convertInchesToMeters(double inches) {
    //     double inches2meters = 0.0254;
    //     return inches * inches2meters;
    // }

   
    // public static double convertInchesToCentimeters(double inches) {
    //     double inches2cm = 2.54;
    //     return inches * inches2cm;
    // }

    
    // public static void main(String[] args) {
    //     System.out.println("10 yards = " + convertYardsToFeet(10) + " feet");
    //     System.out.println("15 feet = " + convertFeetToYards(15) + " yards");
    //     System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
    //     System.out.println("50 inches = " + convertInchesToMeters(50) + " meters");
    //     System.out.println("20 inches = " + convertInchesToCentimeters(20) + " cm");
    // }


    // Q6

    // public static double convertFahrenheitToCelsius(double fahrenheit) {
    //     double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
    //     return fahrenheit2celsius;
    // }

    // public static double convertCelsiusToFahrenheit(double celsius) {
    //     double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
    //     return celsius2fahrenheit;
    // }

   
    // public static double convertPoundsToKilograms(double pounds) {
    //     double pounds2kilograms = 0.453592;
    //     return pounds * pounds2kilograms;
    // }

    
    // public static double convertKilogramsToPounds(double kilograms) {
    //     double kilograms2pounds = 2.20462;
    //     return kilograms * kilograms2pounds;
    // }

  
    // public static double convertGallonsToLiters(double gallons) {
    //     double gallons2liters = 3.78541;
    //     return gallons * gallons2liters;
    // }

   
    // public static double convertLitersToGallons(double liters) {
    //     double liters2gallons = 0.264172;
    //     return liters * liters2gallons;
    // }

    
    // public static void main(String[] args) {
    //     System.out.println("100°F = " + convertFahrenheitToCelsius(100) + " °C");
    //     System.out.println("0°C = " + convertCelsiusToFahrenheit(0) + " °F");
    //     System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
    //     System.out.println("70 kg = " + convertKilogramsToPounds(70) + " pounds");
    //     System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
    //     System.out.println("50 liters = " + convertLitersToGallons(50) + " gallons");
    // }



    // Q7
    
    // public static boolean canStudentVote(int age) {
    //     if (age < 0) {
            
    //         return false;
    //     } else if (age >= 18) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        

    //     int[] ages = new int[10]; 
    //     for (int i = 0; i < ages.length; i++) {
    //         System.out.print("Enter age of student " + (i + 1) + ": ");
    //         ages[i] = sc.nextInt();
    //     }

    //     // Check voting eligibility
    //     for (int i = 0; i < ages.length; i++) {
    //         boolean canVote = canStudentVote(ages[i]);
    //         if (canVote) {
    //             System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
    //         } else {
    //             System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is NOT eligible to vote.");
    //         }
    //     }

    // }

    // Q8
    // System.out.println("Enter the ages ");
        // int AmarAge=scn.nextInt();
        // int AkbarAge=scn.nextInt();
        // int AnthonyAge=scn.nextInt();
        // System.out.println("Enter the heights");
        // int AmarHeight=scn.nextInt();
        // int AkbarHeight=scn.nextInt();
        // int AnthonyHeight=scn.nextInt();
        // if(AmarAge<AkbarAge && AmarAge<AnthonyAge){
        //     System.out.println("Amar is the youngest");
        // }
        // else if(AkbarAge<AmarAge && AkbarAge<AnthonyAge){
        //     System.out.println("Akbar is the youngest");
        // }
        // else{
        //     System.out.println("Anthony is the youngest");
        // }
        // if(AmarHeight>AkbarHeight && AmarHeight>AnthonyHeight){
        //     System.out.println("Amar is the tallest");
        // }
        // else if(AkbarHeight>AmarHeight && AkbarHeight>AnthonyHeight){
        //     System.out.println("Akbar is the tallest");
        // }
        // else{
        //     System.out.println("Anthony is the tallest");
        // }


        // Q9
    
    // public static boolean isPositive(int num) {
    //     return num >= 0;
    // }

   
    // public static boolean isEven(int num) {
    //     return num % 2 == 0;
    // }

    
    // public static int compare(int num1, int num2) {
    //     if (num1 > num2) {
    //         return 1;
    //     } else if (num1 == num2) {
    //         return 0;
    //     } else {
    //         return -1;
    //     }
    // }

    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int[] numbers = new int[5];

      
    //     for (int i = 0; i < numbers.length; i++) {
    //         System.out.print("Enter number " + (i + 1) + ": ");
    //         numbers[i] = sc.nextInt();
    //     }

    //     System.out.println("\n--- Checking Numbers ---");
    //     for (int i = 0; i < numbers.length; i++) {
    //         int num = numbers[i];
    //         if (isPositive(num)) {
    //             if (isEven(num)) {
    //                 System.out.println("Number " + num + " is Positive and Even");
    //             } else {
    //                 System.out.println("Number " + num + " is Positive and Odd");
    //             }
    //         } else {
    //             System.out.println("Number " + num + " is Negative");
    //         }
    //     }

        
    //     int result = compare(numbers[0], numbers[numbers.length - 1]);
    //     System.out.println("\n--- Comparing First and Last Elements ---");
    //     if (result == 1) {
    //         System.out.println("First element (" + numbers[0] + ") is greater than Last element (" + numbers[4] + ")");
    //     } else if (result == 0) {
    //         System.out.println("First element (" + numbers[0] + ") is equal to Last element (" + numbers[4] + ")");
    //     } else {
    //         System.out.println("First element (" + numbers[0] + ") is less than Last element (" + numbers[4] + ")");
    //     }

        
    // }

    // Q10
    
    //  public static double calculateBMI(double weight, double heightCm) {
    //     // double heightMeters = heightCm / 100.0; 
    //     return weight / (heightMeters * heightMeters);
    // }
    // public static String getBMIStatus(double bmi) {
    //     if (bmi < 18.5) {
    //         return "Underweight";
    //     } else if (bmi >= 18.5 && bmi < 24.9) {
    //         return "Normal";
    //     } else if (bmi >= 25 && bmi < 29.9) {
    //         return "Overweight";
    //     } else {
    //         return "Obese";
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     double[][] data = new double[10][3];
    //     String[] bmiStatus = new String[10];
    //     for (int i = 0; i < 10; i++) {
    //         System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
    //         double weight = scanner.nextDouble();
    //         System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
    //         double height = scanner.nextDouble();
    //         double bmi = calculateBMI(weight, height);
    //         String status = getBMIStatus(bmi);
    //         data[i][0] = weight;
    //         data[i][1] = height;
    //         data[i][2] = bmi;
    //         bmiStatus[i] = status;
    //     }
    //     System.out.println("\n--- BMI Report ---");
    //     System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
    //     for (int i = 0; i < 10; i++) {
    //         System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
    //                 data[i][0], data[i][1], data[i][2], bmiStatus[i]);
    //     }
    // }


    // Q11
    //  public static double[] findRoots(double a, double b, double c) {
    //     double delta = Math.pow(b, 2) - (4 * a * c);
    //     if (delta > 0) {
    //         double root1 = (-b + Math.sqrt(delta)) / (2 * a);
    //         double root2 = (-b - Math.sqrt(delta)) / (2 * a);
    //         return new double[]{root1, root2};
    //     } else if (delta == 0) {
    //         double root = -b / (2 * a);
    //         return new double[]{root};
    //     } else {
    //         return new double[]{}; 
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter value of a: ");
    //     double a = scanner.nextDouble();
    //     System.out.print("Enter value of b: ");
    //     double b = scanner.nextDouble();
    //     System.out.print("Enter value of c: ");
    //     double c = scanner.nextDouble();
    //     double[] roots = findRoots(a, b, c);
    //     if (roots.length == 2) {
    //         System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
    //     } else if (roots.length == 1) {
    //         System.out.println("The equation has one real root: " + roots[0]);
    //     } else {
    //         System.out.println("The equation has no real roots.");
    //     }
    // }

    // Q12

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));
        double[] result = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}