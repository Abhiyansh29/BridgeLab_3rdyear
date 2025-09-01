import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Level3 {
    // Q1

    //     public static int findSum(int[] heights) {
    //     int sum = 0;
    //     for (int h : heights) sum += h;
    //     return sum;
    // }

    // public static double findMean(int[] heights) {
    //     return (double) findSum(heights) / heights.length;
    // }

    // public static int findShortest(int[] heights) {
    //     int min = heights[0];
    //     for (int h : heights) min = Math.min(min, h);
    //     return min;
    // }

    // public static int findTallest(int[] heights) {
    //     int max = heights[0];
    //     for (int h : heights) max = Math.max(max, h);
    //     return max;
    // }

    // public static void main(String[] args) {
    //     int[] heights = new int[11];
    //     for (int i = 0; i < heights.length; i++) {
    //         heights[i] = (int)(Math.random() * 101) + 150;
    //     }

    //     System.out.println("Players' Heights: " + Arrays.toString(heights));
    //     System.out.println("Shortest Height: " + findShortest(heights));
    //     System.out.println("Tallest Height: " + findTallest(heights));
    //     System.out.println("Mean Height: " + findMean(heights));
    // }


    // Q2
    
    // public static int countDigits(int number) {
    //     return String.valueOf(number).length();
    // }

    // public static int[] getDigitsArray(int number) {
    //     String numStr = String.valueOf(number);
    //     int[] digits = new int[numStr.length()];
    //     for (int i = 0; i < numStr.length(); i++) {
    //         digits[i] = Character.getNumericValue(numStr.charAt(i));
    //     }
    //     return digits;
    // }

    // public static boolean isDuckNumber(int[] digits) {
    //     for (int i = 1; i < digits.length; i++) {
    //         if (digits[i] == 0) return true;
    //     }
    //     return false;
    // }

    // public static boolean isArmstrong(int[] digits, int number) {
    //     int n = digits.length;
    //     int sum = 0;
    //     for (int d : digits) {
    //         sum += Math.pow(d, n);
    //     }
    //     return sum == number;
    // }

    // public static int[] findLargestAndSecondLargest(int[] digits) {
    //     int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
    //     for (int d : digits) {
    //         if (d > largest) {
    //             secondLargest = largest;
    //             largest = d;
    //         } else if (d > secondLargest && d != largest) {
    //             secondLargest = d;
    //         }
    //     }
    //     return new int[]{largest, secondLargest};
    // }

    // public static int[] findSmallestAndSecondSmallest(int[] digits) {
    //     int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
    //     for (int d : digits) {
    //         if (d < smallest) {
    //             secondSmallest = smallest;
    //             smallest = d;
    //         } else if (d < secondSmallest && d != smallest) {
    //             secondSmallest = d;
    //         }
    //     }
    //     return new int[]{smallest, secondSmallest};
    // }

    // public static void main(String[] args) {
    //     int number = 153; // test number

    //     int digitCount = countDigits(number);
    //     int[] digits = getDigitsArray(number);

    //     System.out.println("Number: " + number);
    //     System.out.println("Digits Count: " + digitCount);
    //     System.out.println("Digits Array: " + Arrays.toString(digits));
    //     System.out.println("Is Duck Number? " + isDuckNumber(digits));
    //     System.out.println("Is Armstrong Number? " + isArmstrong(digits, number));

    //     int[] largestTwo = findLargestAndSecondLargest(digits);
    //     System.out.println("Largest Digit: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

    //     int[] smallestTwo = findSmallestAndSecondSmallest(digits);
    //     System.out.println("Smallest Digit: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    // }


    // Q3
    //  public static int countDigits(int number) {
    //     return String.valueOf(number).length();
    // }

    // public static int[] getDigitsArray(int number) {
    //     String numStr = String.valueOf(number);
    //     int[] digits = new int[numStr.length()];
    //     for (int i = 0; i < numStr.length(); i++) {
    //         digits[i] = Character.getNumericValue(numStr.charAt(i));
    //     }
    //     return digits;
    // }

    // public static int[] reverseArray(int[] digits) {
    //     int[] reversed = new int[digits.length];
    //     for (int i = 0; i < digits.length; i++) {
    //         reversed[i] = digits[digits.length - 1 - i];
    //     }
    //     return reversed;
    // }

    // public static boolean areArraysEqual(int[] arr1, int[] arr2) {
    //     return Arrays.equals(arr1, arr2);
    // }

    // public static boolean isPalindrome(int[] digits) {
    //     int[] reversed = reverseArray(digits);
    //     return areArraysEqual(digits, reversed);
    // }

    // public static boolean isDuckNumber(int[] digits) {
    //     for (int i = 1; i < digits.length; i++) { // leading 0 not allowed
    //         if (digits[i] == 0) return true;
    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = sc.nextInt();

    //     int digitCount = countDigits(number);
    //     int[] digits = getDigitsArray(number);
    //     int[] reversedDigits = reverseArray(digits);

    //     System.out.println("Number: " + number);
    //     System.out.println("Digits Count: " + digitCount);
    //     System.out.println("Digits Array: " + Arrays.toString(digits));
    //     System.out.println("Reversed Array: " + Arrays.toString(reversedDigits));
    //     System.out.println("Arrays Equal? " + areArraysEqual(digits, reversedDigits));
    //     System.out.println("Is Palindrome? " + isPalindrome(digits));
    //     System.out.println("Is Duck Number? " + isDuckNumber(digits));

    //     sc.close();
    // }

    // Q4

    
    // public static int countDigits(int number) {
    //     return String.valueOf(number).length();
    // }

    // public static int[] getDigitsArray(int number) {
    //     String numStr = String.valueOf(number);
    //     int[] digits = new int[numStr.length()];
    //     for (int i = 0; i < numStr.length(); i++) {
    //         digits[i] = Character.getNumericValue(numStr.charAt(i));
    //     }
    //     return digits;
    // }

    // public static int[] reverseArray(int[] digits) {
    //     int[] reversed = new int[digits.length];
    //     for (int i = 0; i < digits.length; i++) {
    //         reversed[i] = digits[digits.length - 1 - i];
    //     }
    //     return reversed;
    // }

    // public static boolean areArraysEqual(int[] arr1, int[] arr2) {
    //     return Arrays.equals(arr1, arr2);
    // }

    // public static boolean isPalindrome(int[] digits) {
    //     int[] reversed = reverseArray(digits);
    //     return areArraysEqual(digits, reversed);
    // }

    // public static boolean isDuckNumber(int[] digits) {
    //     for (int i = 1; i < digits.length; i++) { // leading 0 not allowed
    //         if (digits[i] == 0) return true;
    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = sc.nextInt();

    //     int digitCount = countDigits(number);
    //     int[] digits = getDigitsArray(number);
    //     int[] reversedDigits = reverseArray(digits);

    //     System.out.println("Number: " + number);
    //     System.out.println("Digits Count: " + digitCount);
    //     System.out.println("Digits Array: " + Arrays.toString(digits));
    //     System.out.println("Reversed Array: " + Arrays.toString(reversedDigits));
    //     System.out.println("Arrays Equal? " + areArraysEqual(digits, reversedDigits));
    //     System.out.println("Is Palindrome? " + isPalindrome(digits));
    //     System.out.println("Is Duck Number? " + isDuckNumber(digits));

    //     sc.close();
    // }

    // Q5
    //  public static boolean isPrime(int number) {
    //     if (number <= 1) return false;
    //     for (int i = 2; i <= Math.sqrt(number); i++) {
    //         if (number % i == 0) return false;
    //     }
    //     return true;
    // }

    // public static boolean isNeon(int number) {
    //     int square = number * number;
    //     int sum = 0;
    //     while (square > 0) {
    //         sum += square % 10;
    //         square /= 10;
    //     }
    //     return sum == number;
    // }

    // public static boolean isSpy(int number) {
    //     int sum = 0, product = 1;
    //     int temp = number;
    //     while (temp > 0) {
    //         int digit = temp % 10;
    //         sum += digit;
    //         product *= digit;
    //         temp /= 10;
    //     }
    //     return sum == product;
    // }

    // public static boolean isAutomorphic(int number) {
    //     int square = number * number;
    //     return String.valueOf(square).endsWith(String.valueOf(number));
    // }

    // public static boolean isBuzz(int number) {
    //     return number % 7 == 0 || number % 10 == 7;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = sc.nextInt();

    //     System.out.println("Number: " + number);
    //     System.out.println("Is Prime? " + isPrime(number));
    //     System.out.println("Is Neon? " + isNeon(number));
    //     System.out.println("Is Spy? " + isSpy(number));
    //     System.out.println("Is Automorphic? " + isAutomorphic(number));
    //     System.out.println("Is Buzz? " + isBuzz(number));

    //     sc.close();
    // }
    

    // Q6
    // public static boolean isPrime(int number) {
    //     if (number <= 1) return false;
    //     for (int i = 2; i <= Math.sqrt(number); i++) {
    //         if (number % i == 0) return false;
    //     }
    //     return true;
    // }

    // public static boolean isNeon(int number) {
    //     int square = number * number;
    //     int sum = 0;
    //     while (square > 0) {
    //         sum += square % 10;
    //         square /= 10;
    //     }
    //     return sum == number;
    // }

    // public static boolean isSpy(int number) {
    //     int sum = 0, product = 1;
    //     int temp = number;
    //     while (temp > 0) {
    //         int digit = temp % 10;
    //         sum += digit;
    //         product *= digit;
    //         temp /= 10;
    //     }
    //     return sum == product;
    // }

    // public static boolean isAutomorphic(int number) {
    //     int square = number * number;
    //     return String.valueOf(square).endsWith(String.valueOf(number));
    // }

    // public static boolean isBuzz(int number) {
    //     return number % 7 == 0 || number % 10 == 7;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = sc.nextInt();

    //     System.out.println("Number: " + number);
    //     System.out.println("Is Prime? " + isPrime(number));
    //     System.out.println("Is Neon? " + isNeon(number));
    //     System.out.println("Is Spy? " + isSpy(number));
    //     System.out.println("Is Automorphic? " + isAutomorphic(number));
    //     System.out.println("Is Buzz? " + isBuzz(number));

    // }


    // Q7
    //  public static int[] findFactors(int number) {
    //     int count = 0;
    //     for (int i = 1; i <= number; i++) {
    //         if (number % i == 0) {
    //             count++;
    //         }
    //     }
    //     int[] factors = new int[count];
    //     int index = 0;
    //     for (int i = 1; i <= number; i++) {
    //         if (number % i == 0) {
    //             factors[index++] = i;
    //         }
    //     }
    //     return factors;
    // }

    // public static int findGreatestFactor(int[] factors) {
    //     int max = factors[0];
    //     for (int f : factors) {
    //         if (f > max) {
    //             max = f;
    //         }
    //     }
    //     return max;
    // }

    // public static int findSumOfFactors(int[] factors) {
    //     int sum = 0;
    //     for (int f : factors) {
    //         sum += f;
    //     }
    //     return sum;
    // }

    // public static int findProductOfFactors(int[] factors) {
    //     int product = 1;
    //     for (int f : factors) {
    //         product *= f;
    //     }
    //     return product;
    // }

    // public static double findProductOfCubes(int[] factors) {
    //     double product = 1;
    //     for (int f : factors) {
    //         product *= Math.pow(f, 3);
    //     }
    //     return product;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = sc.nextInt();

    //     int[] factors = findFactors(number);

    //     System.out.print("Factors: ");
    //     for (int f : factors) {
    //         System.out.print(f + " ");
    //     }
    //     System.out.println();

    //     System.out.println("Greatest Factor: " + findGreatestFactor(factors));
    //     System.out.println("Sum of Factors: " + findSumOfFactors(factors));
    //     System.out.println("Product of Factors: " + findProductOfFactors(factors));
    //     System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));

    //     sc.close();
    // }

    // Q8

    //     public static int generateOTP() {
    //     return 100000 + (int)(Math.random() * 900000); // generates 6-digit OTP
    // }

    // public static boolean areOTPsUnique(int[] otps) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int otp : otps) {
    //         set.add(otp);
    //     }
    //     return set.size() == otps.length;
    // }

    // public static void main(String[] args) {
    //     int[] otps = new int[10];

    //     System.out.println("Generated OTPs:");
    //     for (int i = 0; i < 10; i++) {
    //         otps[i] = generateOTP();
    //         System.out.println("OTP " + (i + 1) + ": " + otps[i]);
    //     }

    //     if (areOTPsUnique(otps)) {
    //         System.out.println(" All OTPs are unique.");
    //     } else {
    //         System.out.println(" Duplicate OTPs found.");
    //     }
    // }


    // Q9
    //  static String getMonthName(int month) {
    //     String[] months = {
    //         "January", "February", "March", "April", "May", "June",
    //         "July", "August", "September", "October", "November", "December"
    //     };
    //     return months[month - 1];
    // }

    // static boolean isLeapYear(int year) {
    //     return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    // }

    // static int getDaysInMonth(int month, int year) {
    //     int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //     if (month == 2 && isLeapYear(year)) {
    //         return 29;
    //     }
    //     return days[month - 1];
    // }

    // static int getFirstDay(int month, int year) {
    //     // Zeller’s Congruence Algorithm
    //     if (month < 3) {
    //         month += 12;
    //         year--;
    //     }
    //     int k = year % 100;      // year of the century
    //     int j = year / 100;      // zero-based century
    //     int h = (1 + (13 * (month + 1)) / 5 + k + k/4 + j/4 + (5 * j)) % 7;
    //     int day = ((h + 5) % 7); // 0 = Sunday, 1 = Monday...
    //     return day;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter month (1-12): ");
    //     int month = sc.nextInt();

    //     System.out.print("Enter year: ");
    //     int year = sc.nextInt();

    //     String monthName = getMonthName(month);
    //     int days = getDaysInMonth(month, year);
    //     int startDay = getFirstDay(month, year);

    //     System.out.printf("\n     %s %d\n", monthName, year);
    //     System.out.println(" Su Mo Tu We Th Fr Sa");

    //     // First loop for spacing before 1st day
    //     for (int i = 0; i < startDay; i++) {
    //         System.out.print("   ");
    //     }

    //     // Second loop to print all days of the month
    //     for (int day = 1; day <= days; day++) {
    //         System.out.printf("%3d", day);
    //         if ((day + startDay) % 7 == 0) {
    //             System.out.println();
    //         }
    //     }
    //     System.out.println();
    // }


    // Q10
    //  static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
    //     // To avoid division by zero, use cross multiplication instead of direct slope equality
    //     return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1) &&
    //            (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    // }

    // // Method using area of triangle formula
    // static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
    //     int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
    //     return area == 0;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter x1, y1: ");
    //     int x1 = sc.nextInt(), y1 = sc.nextInt();

    //     System.out.print("Enter x2, y2: ");
    //     int x2 = sc.nextInt(), y2 = sc.nextInt();

    //     System.out.print("Enter x3, y3: ");
    //     int x3 = sc.nextInt(), y3 = sc.nextInt();

    //     boolean slopeCheck = areCollinearSlope(x1, y1, x2, y2, x3, y3);
    //     boolean areaCheck = areCollinearArea(x1, y1, x2, y2, x3, y3);

    //     System.out.println("\nUsing Slope Formula: " + (slopeCheck ? "Collinear" : "Not Collinear"));
    //     System.out.println("Using Area Formula : " + (areaCheck ? "Collinear" : "Not Collinear"));
    // }


    // Q11
    //   public static int[][] generateSalaryAndService(int size) {
    //     Random rand = new Random();
    //     int[][] data = new int[size][2];  // [salary, yearsOfService]
    //     for (int i = 0; i < size; i++) {
    //         int salary = 10000 + rand.nextInt(90000);  // random 5-digit salary
    //         int years = 1 + rand.nextInt(15);          // random years (1–15)
    //         data[i][0] = salary;
    //         data[i][1] = years;
    //     }
    //     return data;
    // }

    // // Method to calculate Bonus and New Salary
    // public static double[][] calculateBonusAndNewSalary(int[][] oldData) {
    //     int size = oldData.length;
    //     double[][] newData = new double[size][2]; // [newSalary, bonus]
    //     for (int i = 0; i < size; i++) {
    //         int salary = oldData[i][0];
    //         int years = oldData[i][1];
    //         double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
    //         double newSalary = salary + bonus;
    //         newData[i][0] = newSalary;
    //         newData[i][1] = bonus;
    //     }
    //     return newData;
    // }

    // // Method to display results in tabular format
    // public static void displayResults(int[][] oldData, double[][] newData) {
    //     double totalOld = 0, totalNew = 0, totalBonus = 0;

    //     System.out.printf("%-10s %-10s %-12s %-12s %-12s %-12s%n", 
    //             "EmpID", "Salary", "YearsService", "Bonus", "NewSalary", "Bonus%");
    //     System.out.println("---------------------------------------------------------------");

    //     for (int i = 0; i < oldData.length; i++) {
    //         int salary = oldData[i][0];
    //         int years = oldData[i][1];
    //         double newSalary = newData[i][0];
    //         double bonus = newData[i][1];
    //         String bonusPercent = (years > 5) ? "5%" : "2%";

    //         totalOld += salary;
    //         totalNew += newSalary;
    //         totalBonus += bonus;

    //         System.out.printf("%-10d %-10d %-12d %-12.2f %-12.2f %-12s%n", 
    //                 (i + 1), salary, years, bonus, newSalary, bonusPercent);
    //     }

    //     System.out.println("---------------------------------------------------------------");
    //     System.out.printf("%-10s %-10.2f %-12s %-12.2f %-12.2f %-12s%n", 
    //             "TOTAL", totalOld, "", totalBonus, totalNew, "");
    // }

    // public static void main(String[] args) {
    //     int size = 10;

    //     int[][] oldData = generateSalaryAndService(size);
    //     double[][] newData = calculateBonusAndNewSalary(oldData);
    //     displayResults(oldData, newData);
    // }
    // 

    //  Q12
    // public static double euclideanDistance(double x1, double y1, double x2, double y2) {
    //     return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    // }

    // public static double[] lineEquation(double x1, double y1, double x2, double y2) {
    //     double m = (y2 - y1) / (x2 - x1);
    //     double b = y1 - (m * x1);
    //     return new double[]{m, b};
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter x1 y1: ");
    //     double x1 = sc.nextDouble();
    //     double y1 = sc.nextDouble();
    //     System.out.print("Enter x2 y2: ");
    //     double x2 = sc.nextDouble();
    //     double y2 = sc.nextDouble();

    //     double distance = euclideanDistance(x1, y1, x2, y2);
    //     double[] line = lineEquation(x1, y1, x2, y2);

    //     System.out.printf("Euclidean Distance: %.2f%n", distance);
    //     System.out.printf("Equation of Line: y = %.2fx + %.2f%n", line[0], line[1]);
    // }


    // Q13
    //  public static int[][] generateScores(int n) {
    //     int[][] scores = new int[n][3];
    //     for (int i = 0; i < n; i++) {
    //         scores[i][0] = (int) (Math.random() * 41 + 60); 
    //         scores[i][1] = (int) (Math.random() * 41 + 60); 
    //         scores[i][2] = (int) (Math.random() * 41 + 60); 
    //     }
    //     return scores;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter number of students: ");
    //     int n = sc.nextInt();

    //     int[][] scores = generateScores(n);

    //     System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", 
    //                       "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");

    //     for (int i = 0; i < n; i++) {
    //         int total = scores[i][0] + scores[i][1] + scores[i][2];
    //         double average = total / 3.0;
    //         double percentage = (total / 300.0) * 100;
    //         System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f%n", 
    //                           scores[i][0], scores[i][1], scores[i][2], total, average, percentage);
    //     }
    // }


    // Q14


}
