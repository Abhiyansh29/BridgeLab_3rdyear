import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Q1
        // int people = 10;
        // double[][] data = new double[people][2];
        // for (int i = 0; i < people; i++) {
        //     System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
        //     data[i][0] = sc.nextDouble();
        //     System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
        //     data[i][1] = sc.nextDouble();
        // }
        // System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        // for (int i = 0; i < people; i++) {
        //     double w = data[i][0];
        //     double h = data[i][1] / 100; // convert cm to m
        //     double bmi = Math.round((w / (h * h)) * 10.0) / 10.0;
        //     String status = "";
        //     if (bmi <= 18.4) status = "Underweight";
        //     else if (bmi <= 24.9) status = "Normal";
        //     else if (bmi <= 39.9) status = "Overweight";
        //     else status = "Obese";

        //     System.out.println((i + 1) + "\t" + w + "\t\t" + data[i][1] + "\t\t" + bmi + "\t" + status);
        // }

        // Q2
    // String text=sc.nextLine();
    //     int len=0;
    //     try { while(true){ text.charAt(len); len++; } } catch(Exception e){}
    //     char[] unique=new char[len];
    //     int k=0;
    //     for(int i=0;i<len;i++){
    //         char c=text.charAt(i);
    //         boolean found=false;
    //         for(int j=0;j<i;j++){
    //             if(c==text.charAt(j)){ found=true; break; }
    //         }
    //         if(!found){ unique[k++]=c; }
    //     }
    //     char[] result=new char[k];
    //     for(int i=0;i<k;i++) result[i]=unique[i];
    //     for(char c:result) System.out.print(c+" ");

    //Q3
    // String text=sc.nextLine();
    //     int[] freq=new int[256];
    //     for(int i=0;i<text.length();i++) freq[text.charAt(i)]++;
    //     char ans=0;
    //     for(int i=0;i<text.length();i++){
    //         if(freq[text.charAt(i)]==1){ ans=text.charAt(i); break; }
    //     }
    //     if(ans!=0) System.out.println(ans); else System.out.println("None");
    //     sc.close(); 

    //  Q4
    //  String text=sc.nextLine();
    //     int[] freq=new int[256];
    //     for(int i=0;i<text.length();i++) freq[text.charAt(i)]++;
    //     for(int i=0;i<256;i++){
    //         if(freq[i]>0) System.out.println((char)i+" "+freq[i]);
    //     }
    //     sc.close();

    // Q5
    //  String text=sc.nextLine();
        // int len=text.length(); 
        // char[] unique=new char[len];
        // int k=0;
        // for(int i=0;i<len;i++){
        //     char c=text.charAt(i);
        //     boolean found=false;
        //     for(int j=0;j<i;j++) if(c==text.charAt(j)) found=true;
        //     if(!found) unique[k++]=c;
        // }
        // int[] freq=new int[256];
        // for(int i=0;i<len;i++) freq[text.charAt(i)]++;
        // for(int i=0;i<k;i++) System.out.println(unique[i]+" "+freq[unique[i]]);
        // Q6

        //  String text=sc.nextLine();
        // char[] arr=text.toCharArray();
        // int[] freq=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]=='0') continue;
        //     int count=1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){ count++; arr[j]='0'; }
        //     }
        //     freq[i]=count;
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!='0') System.out.println(arr[i]+" "+freq[i]);
        // }
        // sc.close();


        // Q7
        // String text = sc.nextLine();
        // int start = 0, end = text.length() - 1;
        // boolean isPal = true;
        // while (start < end) {
        //     if (text.charAt(start) != text.charAt(end)) {
        //         isPal = false;
        //         break;
        //     }
        //     start++;
        //     end--;
        // }
        // System.out.println("Logic1: " + isPal);
        // start = 0;
        // end = text.length() - 1;
        // boolean recPal = true;
        // while (true) {
        //     if (start >= end) break;
        //     if (text.charAt(start) != text.charAt(end)) {
        //         recPal = false;
        //         break;
        //     }
        //     start++;
        //     end--;
        // }
        // System.out.println("Logic2: " + recPal);
        // char[] arr = text.toCharArray();
        // char[] rev = new char[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     rev[i] = text.charAt(arr.length - 1 - i);
        // }
        // boolean arrPal = true;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != rev[i]) arrPal = false;
        // }
        // System.out.println("Logic3: " + arrPal);

        // Q8
        // String s1=sc.nextLine();
        // String s2=sc.nextLine();
        // if(s1.length()!=s2.length()){ System.out.println("Not Anagram"); return; }
        // int[] freq1=new int[256];
        // int[] freq2=new int[256];
        // for(int i=0;i<s1.length();i++) freq1[s1.charAt(i)]++;
        // for(int i=0;i<s2.length();i++) freq2[s2.charAt(i)]++;
        // boolean isAna=true;
        // for(int i=0;i<256;i++) if(freq1[i]!=freq2[i]){ isAna=false; break; }
        // System.out.println(isAna?"Anagram":"Not Anagram");
        // sc.close();

        // Q9
        //  int m = sc.nextInt();
        // int y = sc.nextInt();
        // String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        // int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        // if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) days[2] = 29;
        // int y0 = y - (14 - m) / 12;
        // int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // int m0 = m + 12 * ((14 - m) / 12) - 2;
        // int d0 = (1 + x + (31 * m0) / 12) % 7;
        // System.out.println("   " + months[m] + " " + y);
        // System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // for (int i = 0; i < d0; i++) System.out.print("    ");
        // for (int i = 1; i <= days[m]; i++) {
        //     System.out.printf("%3d ", i);
        //     if ((i + d0) % 7 == 0 || i == days[m]) System.out.println();


        // }

        //Q10
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int numOfCards=suits.length*ranks.length;
        String[] deck=new String[numOfCards];
        int index=0;
        for(String suit:suits){
            for(String rank:ranks){
                deck[index++]=rank+" of "+suit;
            }
        }
        for(int i=0;i<numOfCards;i++){
            int randomCardNumber=i+(int)(Math.random()*(numOfCards-i));
            String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
        System.out.print("Enter number of players: ");
        int players=sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int n=sc.nextInt();
        if(n%players!=0){
            System.out.println("Cards cannot be evenly distributed!");
            return;
        }
        int cardsPerPlayer=n/players;
        String[][] distributed=new String[players][cardsPerPlayer];
        index=0;
        for(int i=0;i<players;i++){
            for(int j=0;j<cardsPerPlayer;j++){
                distributed[i][j]=deck[index++];
            }
        }
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1)+":");
            for(String card:distributed[i]){
                System.out.println("  "+card);
            }
            System.out.println();
        }
        sc.close(); 
    }
}
