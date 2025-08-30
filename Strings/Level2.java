import java.util.Random;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Q1

        // String str=sc.next();
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     count++;
        // }
        // System.out.println("Custom Length: "+count);
        // System.out.println("Built-in Length: "+str.length());
        // sc.close();

        // Q2
        // String text=sc.nextLine();
        // int len=0;
        // for(int i=0;i<text.length();i++) len++;
        // int spaces=1;
        // for(int i=0;i<len;i++){
        //     if(text.charAt(i)==' ') spaces++;
        // }
        // String[] manual=new String[spaces];
        // int start=0,index=0;
        // for(int i=0;i<=len;i++){
        //     if(i==len||text.charAt(i)==' '){
        //         String w="";
        //         for(int j=start;j<i;j++) w+=text.charAt(j);
        //         manual[index++]=w;
        //         start=i+1;
        //     }
        // }
        // String[] builtin=text.split(" ");
        // boolean same=true;
        // if(manual.length!=builtin.length) same=false;
        // else{
        //     for(int i=0;i<manual.length;i++){
        //         if(!manual[i].equals(builtin[i])){
        //             same=false;
        //             break;
        //         }
        //     }
        // }
        // System.out.println("Are both same? "+same);

        // Q3
        // String text=sc.nextLine();
        // int len=0;
        // for(int i=0;i<text.length();i++) len++;
        // int spaces=1;
        // for(int i=0;i<len;i++){
        //     if(text.charAt(i)==' ') spaces++;
        // }
        // String[] words=new String[spaces];
        // int start=0,index=0;
        // for(int i=0;i<=len;i++){
        //     if(i==len||text.charAt(i)==' '){
        //         String w="";
        //         for(int j=start;j<i;j++) w+=text.charAt(j);
        //         words[index++]=w;
        //         start=i+1;
        //     }
        // }
        // String[][] data=new String[words.length][2];
        // for(int i=0;i<words.length;i++){
        //     int wlen=0;
        //     for(int j=0;j<words[i].length();j++) wlen++;
        //     data[i][0]=words[i];
        //     data[i][1]=String.valueOf(wlen);
        // }
        // System.out.println("Word\tLength");
        // for(int i=0;i<data.length;i++){
        //     System.out.println(data[i][0]+"\t"+Integer.parseInt(data[i][1]));
        // }

        // Q4
        // String text=sc.nextLine();
        // int spaces=1;
        // for(int i=0;i<text.length();i++)if(text.charAt(i)==' ')spaces++;
        // String[] words=new String[spaces];
        // int start=0,index=0;
        // for(int i=0;i<=text.length();i++){
        //     if(i==text.length()||text.charAt(i)==' '){
        //         String w="";
        //         for(int j=start;j<i;j++)w+=text.charAt(j);
        //         words[index++]=w;
        //         start=i+1;
        //     }
        // }
        // String shortest=words[0],longest=words[0];
        // for(int i=1;i<words.length;i++){
        //     if(words[i].length()<shortest.length())shortest=words[i];
        //     if(words[i].length()>longest.length())longest=words[i];
        // }
        // System.out.println("Shortest: "+shortest);
        // System.out.println("Longest: "+longest);


        // Q5
        
        // String text=sc.nextLine();
        // int vowels=0,consonants=0;
        // for(int i=0;i<text.length();i++){
        //     char c=text.charAt(i);
        //     if(c>='A'&&c<='Z')c=(char)(c+32);
        //     if(c>='a'&&c<='z'){
        //         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')vowels++;
        //         else consonants++;
        //     }
        // }
        // System.out.println("Vowels: "+vowels);
        // System.out.println("Consonants: "+consonants);

        // Q6
        // String text = sc.nextLine();
        // String[][] result = new String[text.length()][2];
        // for (int i = 0; i < text.length(); i++) {
        //     char c = text.charAt(i);
        //     if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        //     String type;
        //     if (c >= 'a' && c <= 'z') {
        //         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') type = "Vowel";
        //         else type = "Consonant";
        //     } else type = "Not a Letter";
        //     result[i][0] = String.valueOf(text.charAt(i));
        //     result[i][1] = type;
        // }
        // System.out.println("Character\tType");
        // for (int i = 0; i < result.length; i++) {
        //     System.out.println(result[i][0] + "\t\t" + result[i][1]);
        // }

        // Q7
        //  String text = sc.nextLine();
        // int start = 0, end = text.length() - 1;
        // while (start < text.length() && text.charAt(start) == ' ') start++;
        // while (end >= 0 && text.charAt(end) == ' ') end--;
        // String trimmed = "";
        // for (int i = start; i <= end; i++) trimmed += text.charAt(i);
        // String builtin = text.trim();
        // boolean equal = true;
        // if (trimmed.length() != builtin.length()) equal = false;
        // else {
        //     for (int i = 0; i < trimmed.length(); i++) {
        //         if (trimmed.charAt(i) != builtin.charAt(i)) {
        //             equal = false;
        //             break;
        //         }
        //     }
        // }
        // System.out.println("Custom Trim: [" + trimmed + "]");
        // System.out.println("Built-in Trim: [" + builtin + "]");
        // System.out.println("Are equal? " + equal);

        // Q8
        // Random rand = new Random();
        // int[] ages = new int[10];
        // String[][] result = new String[10][2];
        // for (int i = 0; i < 10; i++) ages[i] = rand.nextInt(90) + 10;
        // for (int i = 0; i < 10; i++) {
        //     String canVote;
        //     if (ages[i] < 0) canVote = "false";
        //     else if (ages[i] >= 18) canVote = "true";
        //     else canVote = "false";
        //     result[i][0] = String.valueOf(ages[i]);
        //     result[i][1] = canVote;
        // }
        // System.out.println("Age\tCan Vote?");
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(result[i][0] + "\t" + result[i][1]);
        // }

        // Q9
        //  String[] choices = {"rock","paper","scissors"};
        // System.out.print("Enter number of games: ");
        // int games = sc.nextInt();
        // int playerWins = 0, compWins = 0, draws = 0;
        // String[][] results = new String[games][3];
        // for (int i = 0; i < games; i++) {
        //     System.out.print("Enter choice (rock/paper/scissors): ");
        //     String player = sc.next().toLowerCase();
        //     String comp = choices[(int)(Math.random() * 3)];
        //     String winner;
        //     if (player.equals(comp)) {
        //         winner = "Draw"; draws++;
        //     } else if ((player.equals("rock") && comp.equals("scissors")) ||
        //                (player.equals("scissors") && comp.equals("paper")) ||
        //                (player.equals("paper") && comp.equals("rock"))) {
        //         winner = "Player"; playerWins++;
        //     } else {
        //         winner = "Computer"; compWins++;
        //     }
        //     results[i][0] = player;
        //     results[i][1] = comp;
        //     results[i][2] = winner;
        // }
        // System.out.println("Game\tPlayer\tComputer\tWinner");
        // for (int i = 0; i < games; i++) {
        //     System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        // }
        // double playerPct = (playerWins * 100.0) / games;
        // double compPct = (compWins * 100.0) / games;
        // System.out.println("\nPlayer Wins: " + playerWins + " (" + playerPct + "%)");
        // System.out.println("Computer Wins: " + compWins + " (" + compPct + "%)");
        // System.out.println("Draws: " + draws);

        // Q10
        int students=5;
        int[][] scores=new int[students][3];
        Random rand=new Random();
        for(int i=0;i<students;i++){
            for(int j=0;j<3;j++){
                scores[i][j]=rand.nextInt(90)+10;
            }
        }
        int[] total=new int[students];
        double[] avg=new double[students];
        double[] per=new double[students];
        String[] grade=new String[students];
        for(int i=0;i<students;i++){
            total[i]=scores[i][0]+scores[i][1]+scores[i][2];
            avg[i]=Math.round((total[i]/3.0)*100.0)/100.0;
            per[i]=Math.round(((total[i]/300.0)*100)*100.0)/100.0;
            grade[i]=per[i]>=80?"A":per[i]>=70?"B":per[i]>=60?"C":per[i]>=50?"D":per[i]>=40?"E":"R";
        }
        System.out.println("Student Physics Chemistry Math Total Average Percentage Grade");
        for(int i=0;i<students;i++){
            System.out.println((i+1)+"\t"+scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+total[i]+"\t"+avg[i]+"\t"+per[i]+"\t"+grade[i]);
        }


    }
}
