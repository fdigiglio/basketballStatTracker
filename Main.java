import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        // try {
        //     File myObj = new File("basketballStats2021.txt");
        //     if (myObj.createNewFile()) {
        //       System.out.println("File created: " + myObj.getName());
        //     } else {
        //       System.out.println("File already exists.");
        //     }
        //   } catch (IOException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }

        Scanner input = new Scanner(System.in);

        //THREES
        System.out.println("Enter Number of Threes Made:");
        double numberOfThrees = input.nextDouble(); 
        System.out.println("Enter Number of Threes Attempted:");
        double numberOfThreesAttempted = input.nextDouble(); 

        
        System.out.println("Enter Number of Threes Off the Dribble Made:");
        double numberOfThreesOffDribble = input.nextDouble(); 
        System.out.println("Enter Number of Threes Off the Dribble Attempted:");
        double numberOfThreesOffDribbleAttempted = input.nextDouble(); 

        //MID RANGE
        System.out.println("Enter Number of Mid Range Shots Made:");
        double numberOfMidRange = input.nextDouble(); 
        System.out.println("Enter Number of Mid Range Shots Attempted:");
        double numberOfMidRangeAttempted = input.nextDouble(); 


        System.out.println("Enter Number of Mid Range Shots Off the Dribble Made:");
        double numberOfMidRangeOffDribble = input.nextDouble(); 
        System.out.println("Enter Number of Mid Range Shots Off the Dribble Attempted:");
        double numberOfMidRangeOffDribbleAttempted = input.nextDouble(); 

        //FLOATERS
        System.out.println("Enter Number of Floaters Made:");
        double numberOfFloaters = input.nextDouble(); 
        System.out.println("Enter Number of Floaters Attempted:");
        double numberOfFloatersAttempted = input.nextDouble(); 

        //FREE THROWS
        System.out.println("Enter Number of Free Throws Made:");
        double numberOfFreeThrows = input.nextDouble(); 
        System.out.println("Enter Number of Free Throws Attempted:");
        double numberOfFreeThrowsAttempted = input.nextDouble(); 

        Stats stats = new Stats(numberOfThrees, numberOfThreesOffDribble, numberOfMidRange, numberOfMidRangeOffDribble, numberOfFloaters, numberOfFreeThrows, numberOfThreesAttempted, numberOfThreesOffDribbleAttempted, numberOfMidRangeAttempted, numberOfMidRangeOffDribbleAttempted, numberOfFloatersAttempted, numberOfFreeThrowsAttempted);
        
        System.out.println(stats.returnStats());

        try(FileWriter fw = new FileWriter("basketballStats2021.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(stats.returnStats());
            
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
            System.out.println("An error occurred.");
            
        }


        

    }
}