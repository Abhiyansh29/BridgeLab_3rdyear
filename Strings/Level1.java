import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

import javax.sound.midi.Soundbank;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // Q1
        
        // System.out.println("Enter the First String:");
        // String s1=sc.nextLine();
        // System.out.println("Enter the Second String:");
        // String s2=sc.nextLine();
        // boolean eq=true;
        // if(s1.length()!=s2.length()){
        //     eq=false;
        // }
        // else{
        //     for(int i=0;i<s1.length();i++){
        //         if(s1.charAt(i)!=s2.charAt(i)){
        //             eq=false;
        //         }
        //     }

        // }
        // boolean eq2=s1.equals(s2);
        // System.out.println("Ans by charAt()="+eq);
        // System.out.println("Ans by eqauls()="+eq2);

        // Q2
        // System.out.println("Enter the String");
        // String S1=sc.nextLine();
        // System.out.println("Enter the Starting index");
        // int start=sc.nextInt();
        // System.out.println("Enter the Ending index");
        // int end=sc.nextInt();
        // String by_char="";
        // for(int i=start;i<end;i++){
        //     by_char+=S1.charAt(i);
        // }
        // boolean eq=true;
        // String by_sub=S1.substring(start,end);
        // if(by_char.length()!=by_sub.length()){
        //     eq=false;
        // }
        // else{
        //     for(int i=0;i<by_char.length();i++){
        //         if(by_char.charAt(i)!=by_sub.charAt(i)){
        //                 eq=false;
        //         }
        //     }
        // }
        // System.out.println("SubString by charAt me="+by_char);
        // System.out.println("SubString by substring me="+by_sub);
        // System.out.println("check equality b/w both ="+eq);

    //    Q3
        // System.out.print("Enter a string: ");
        // String text=sc.next();
        // char[] customChars=new char[text.length()];
        // for(int i=0;i<text.length();i++){
        //     customChars[i]=text.charAt(i);
        // }
        // char[] builtInChars=text.toCharArray();
        // boolean areEqual=true;
        // if(customChars.length!=builtInChars.length){
        //     areEqual=false;
        // }else{
        //     for(int i=0;i<customChars.length;i++){
        //         if(customChars[i]!=builtInChars[i]){
        //             areEqual=false;
        //             break;
        //         }
        //     }
        // }
        // System.out.println("Custom char array: "+Arrays.toString(customChars));
        // System.out.println("Built-in char array: "+Arrays.toString(builtInChars));
        // System.out.println("Arrays equal? "+areEqual);
    
    // Q4   
    //  String text = null;
    //     System.out.println(text.length()); 


    // Q5
        // System.out.print("Enter a string: ");
        // String str = sc.next();
        // try {
        //     System.out.println(str.charAt(str.length()));
        // } catch (StringIndexOutOfBoundsException e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

    // Q6

    // System.out.print("Enter a string: ");
    // String str = sc.next();
    // try {
    //         System.out.println(str.substring(5, 2));
    // } catch (IllegalArgumentException e) {
    //     System.out.println("Error: " + e.getMessage());
    // }
        
    // Q7
        // System.out.print("Enter a string: ");
        // String str=sc.next();
        // int num=Integer.parseInt(str);
        // System.out.println("Number is: "+num);

    //  Q8
    //  String[] names = new String[3];
    //     System.out.println("Enter 3 names:");
    //     for (int i = 0; i < names.length; i++) {
    //         names[i] = sc.next();
    //     }
    //     try {
    //         System.out.println("Accessing index 5:" + names[5]);
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Error:" + e.getMessage());
    //     }

    // Q9

    // System.out.println("Enter text:");
    //     String text = sc.nextLine();
    //     String manualUpper = "";
    //     for(int i = 0; i < text.length(); i++){
    //         char ch = text.charAt(i);
    //         if(ch >= 'a' && ch <= 'z'){
    //             manualUpper += (char)(ch - 32);
    //         } else {
    //             manualUpper += ch;
    //         }
    //     }
    //     String builtInUpper = text.toUpperCase();
    //     boolean isSame = true;
    //     if(manualUpper.length() != builtInUpper.length()) {
    //         isSame = false;
    //     } else {
    //         for(int i = 0; i < manualUpper.length(); i++){
    //             if(manualUpper.charAt(i) != builtInUpper.charAt(i)){
    //                 isSame = false;
    //                 break;
    //             }
    //         }
    //     }
    //     System.out.println("Manual Uppercase: " + manualUpper);
    //     System.out.println("Built-in Uppercase: " + builtInUpper);
    //     System.out.println("Are both same? " + isSame);


    // Q10

    //     System.out.println("Enter text:");
    //     String text = sc.nextLine();
    //     String manualLower = "";
    //     for(int i = 0; i < text.length(); i++){
    //         char ch = text.charAt(i);
    //         if(ch >= 'A' && ch <= 'Z'){
    //             manualLower += (char)(ch + 32);
    //         } else {
    //             manualLower += ch;
    //         }
    //     }
    //     String builtInLower = text.toLowerCase();
    //     boolean isSame = true;
    //     if(manualLower.length() != builtInLower.length()) {
    //         isSame = false;
    //     } else {
    //         for(int i = 0; i < manualLower.length(); i++){
    //             if(manualLower.charAt(i) != builtInLower.charAt(i)){
    //                 isSame = false;
    //                 break;
    //             }
    //         }
    //     }
    //     System.out.println("Manual Lowercase: " + manualLower);
    //     System.out.println("Built-in Lowercase: " + builtInLower);
    //     System.out.println("Are both same? " + isSame);
       

    }
}
