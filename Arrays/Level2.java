import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1
        // double[] salary = new double[10];
        // double[] years = new double[10];
        // double[] bonus = new double[10];
        // double[] newSalary = new double[10];
        // double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Enter salary for employee " + (i + 1) + ": ");
        //     salary[i] = sc.nextDouble();
        //     System.out.print("Enter years of service for employee " + (i + 1) + ": ");
        //     years[i] = sc.nextDouble();
        //     if (salary[i] <= 0 || years[i] < 0) {
        //         System.out.println("Invalid input. Enter again.");
        //         i--;
        //     }
        // }
        // for (int i = 0; i < 10; i++) {
        //     if (years[i] > 5) {
        //         bonus[i] = salary[i] * 0.05;
        //     } else {
        //         bonus[i] = salary[i] * 0.02;
        //     }
        //     newSalary[i] = salary[i] + bonus[i];
        //     totalBonus += bonus[i];
        //     totalOldSalary += salary[i];
        //     totalNewSalary += newSalary[i];
        // }
        // System.out.println("Total Bonus Payout: " + totalBonus);
        // System.out.println("Total Old Salary: " + totalOldSalary);
        // System.out.println("Total New Salary: " + totalNewSalary);

        // Q2
        //  String[] names = {"Amar","Akbar","Anthony"};
        // int[] ages = new int[3];
        // int[] heights = new int[3];
        // for (int i = 0; i < 3; i++) {
        //     System.out.print("Enter age of " + names[i] + ": ");
        //     ages[i] = sc.nextInt();
        //     System.out.print("Enter height of " + names[i] + ": ");
        //     heights[i] = sc.nextInt();
        // }
        // int minAgeIndex = 0, maxHeightIndex = 0;
        // for (int i = 1; i < 3; i++) {
        //     if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
        //     if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
        // }
        // System.out.println("Youngest: " + names[minAgeIndex]);
        // System.out.println("Tallest: " + names[maxHeightIndex]);

        // Q3
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int maxDigit = 10;
        // int[] digits = new int[maxDigit];
        // int index = 0;
        // while (number != 0 && index < maxDigit) {
        //     digits[index] = number % 10;
        //     number /= 10;
        //     index++;
        // }
        // int largest = 0, secondLargest = 0;
        // for (int i = 0; i < index; i++) {
        //     if (digits[i] > largest) {
        //         secondLargest = largest;
        //         largest = digits[i];
        //     } else if (digits[i] > secondLargest && digits[i] != largest) {
        //         secondLargest = digits[i];
        //     }
        // }
        // System.out.println("Largest digit = " + largest);
        // System.out.println("Second Largest digit = " + secondLargest);

        // Q4
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int maxDigit = 10;
        // int[] digits = new int[maxDigit];
        // int index = 0;
        // while (number != 0) {
        //     if (index == maxDigit) {
        //         maxDigit += 10;
        //         int[] temp = new int[maxDigit];
        //         for (int i = 0; i < digits.length; i++) {
        //             temp[i] = digits[i];
        //         }
        //         digits = temp;
        //     }
        //     digits[index] = number % 10;
        //     number /= 10;
        //     index++;
        // }
        // int largest = 0, secondLargest = 0;
        // for (int i = 0; i < index; i++) {
        //     if (digits[i] > largest) {
        //         secondLargest = largest;
        //         largest = digits[i];
        //     } else if (digits[i] > secondLargest && digits[i] != largest) {
        //         secondLargest = digits[i];
        //     }
        // }
        // System.out.println("Largest digit = " + largest);
        // System.out.println("Second Largest digit = " + secondLargest);

        // Q5
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int temp = number;
        // int count = 0;
        // while (temp != 0) {
        //     count++;
        //     temp /= 10;
        // }
        // int[] digits = new int[count];
        // for (int i = 0; i < count; i++) {
        //     digits[i] = number % 10;
        //     number /= 10;
        // }
        // System.out.print("Reversed Number = ");
        // for (int i = 0; i < count; i++) {
        //     System.out.print(digits[i]);
        // }

        // Q6
        //  System.out.print("Enter number of persons: ");
        // int n = sc.nextInt();
        // double[] height = new double[n];
        // double[] weight = new double[n];
        // double[] bmi = new double[n];
        // String[] status = new String[n];
        // for (int i = 0; i < n; i++) {
        //     System.out.println("\nPerson " + (i + 1) + ": ");
        //     System.out.print("Enter height (m): ");
        //     height[i] = sc.nextDouble();
        //     System.out.print("Enter weight (kg): ");
        //     weight[i] = sc.nextDouble();
        //     bmi[i] = weight[i] / (height[i] * height[i]);
        //     if (bmi[i] <= 18.4) status[i] = "Underweight";
        //     else if (bmi[i] <= 24.9) status[i] = "Normal";
        //     else if (bmi[i] <= 39.9) status[i] = "Overweight";
        //     else status[i] = "Obese";
        // }
        // System.out.println("\nHeight\tWeight\tBMI\tStatus");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + status[i]);
        // }

        // Q7
        //  System.out.print("Enter number of persons: ");
        // int n = sc.nextInt();
        // double[][] personData = new double[n][3];
        // String[] status = new String[n];
        // for (int i = 0; i < n; i++) {
        //     System.out.println("\nPerson " + (i + 1) + ": ");
        //     System.out.print("Enter height (m): ");
        //     personData[i][0] = sc.nextDouble();
        //     System.out.print("Enter weight (kg): ");
        //     personData[i][1] = sc.nextDouble();
        //     personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
        //     if (personData[i][2] <= 18.4) status[i] = "Underweight";
        //     else if (personData[i][2] <= 24.9) status[i] = "Normal";
        //     else if (personData[i][2] <= 39.9) status[i] = "Overweight";
        //     else status[i] = "Obese";
        // }
        // System.out.println("\nHeight   Weight   BMI   Status");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(personData[i][0] + "   " +
        //                        personData[i][1] + "   " +
        //                        String.format("%.2f", personData[i][2]) + "   " +
        //                        status[i]);
        // }

        // Q8
        // System.out.print("Enter number of students: ");
        // int n = sc.nextInt();
        // int[] phy = new int[n];
        // int[] chem = new int[n];
        // int[] math = new int[n];
        // double[] percent = new double[n];
        // String[] grade = new String[n];   
        // for (int i = 0; i < n; i++) {
        //     System.out.println("\nStudent " + (i + 1) + ": ");
        //     System.out.print("Enter Physics marks: ");
        //     phy[i] = sc.nextInt();
        //     System.out.print("Enter Chemistry marks: ");
        //     chem[i] = sc.nextInt();
        //     System.out.print("Enter Math marks: ");
        //     math[i] = sc.nextInt();
        //     percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
        //     if (percent[i] >= 80) grade[i] = "A";
        //     else if (percent[i] >= 70) grade[i] = "B";
        //     else if (percent[i] >= 60) grade[i] = "C";
        //     else if (percent[i] >= 50) grade[i] = "D";
        //     else if (percent[i] >= 40) grade[i] = "E";
        //     else grade[i] = "R";
        // }
        // System.out.println("\nPhysics   Chemistry   Math   %age   Grade");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(phy[i] + "   " + chem[i] + "   " + math[i] + 
        //                        "   " + String.format("%.2f", percent[i]) + "   " + grade[i]);
        // }

        // Q9
        //  System.out.print("Enter number of students: ");
        // int n = sc.nextInt();
        // int[][] marks = new int[n][3]; // 0=phy,1=chem,2=math
        // double[] percent = new double[n];
        // String[] grade = new String[n];
        // for (int i = 0; i < n; i++) {
        //     System.out.println("\nStudent " + (i + 1) + ": ");
        //     System.out.print("Enter Physics marks: ");
        //     marks[i][0] = sc.nextInt();
        //     System.out.print("Enter Chemistry marks: ");
        //     marks[i][1] = sc.nextInt();
        //     System.out.print("Enter Math marks: ");
        //     marks[i][2] = sc.nextInt();
        //     percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
        //     if (percent[i] >= 80) grade[i] = "A";
        //     else if (percent[i] >= 70) grade[i] = "B";
        //     else if (percent[i] >= 60) grade[i] = "C";
        //     else if (percent[i] >= 50) grade[i] = "D";
        //     else if (percent[i] >= 40) grade[i] = "E";
        //     else grade[i] = "R";
        // }
        // System.out.println("\nPhysics   Chemistry   Math   %age   Grade");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(
        //         marks[i][0] + "   " +
        //         marks[i][1] + "   " +
        //         marks[i][2] + "   " +
        //         String.format("%.2f", percent[i]) + "   " +
        //         grade[i]
        //     );
        // }

        // Q10
        // System.out.print("Enter a number:");
        // long number=sc.nextLong();
        // String numStr=Long.toString(number);
        // int length=numStr.length();
        // int[] digits=new int[length];
        // int[] frequency=new int[10];
        // for(int i=0;i<length;i++){
        //     digits[i]=numStr.charAt(i)-'0';
        // }
        // for(int d:digits){
        //     frequency[d]++;
        // }
        // System.out.println("Digit Frequency:");
        // for(int i=0;i<10;i++){
        //     if(frequency[i]>0){
        //         System.out.println(i+" -> "+frequency[i]);
        //     }
        // }
    }
}
