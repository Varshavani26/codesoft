import java.util.*;
import java.util.random.*;


/**
 * numbergame
 */
public class numbergame {

    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int totalScore =0;
        int attempts_allowed = 3;
        int count=0;
        
        
        // int randy = min + (int) (Math.random()* (max - min + 1 ));
        // System.out.println("the random number generated is : "+randy);

        while (playAgain) {
        
        int randomInt = rand.nextInt(100)+1;
        System.out.println("The random number is  generated ");
        System.out.println("You have " + attempts_allowed + " attempts to guess the number.");

        int attempts_made=0;

        while (attempts_made<attempts_allowed) {

        System.out.println("Enter Your  Guess Number : ");
        
        int x= sc.nextInt();
        System.out.println("  Guessed Number is  : "+x);
        if(randomInt==x)
        {
            System.out.println("Congratulations! You guessed the number in \" + attempts_made + \" attempts_made.");
            totalScore +=1;
        }
        else if(randomInt>x)
        {
            System.out.println("Sorry! your guess is too Less , Try Again ");
        }
        else
        {
            System.out.println("Sorry! your guess is too high , Try Again");
        } 

        attempts_made++;
        count++;
        // System.out.println("Congratulations! You guessed the number in \" + attempts_made + \" attempt.");      
        }

        if (attempts_made>=attempts_allowed) {
            System.out.println("you have done with all your attempts ");
            System.out.println("Your Total Score is : "+totalScore);
            
        }
        System.out.println("Do You Want to play Again (Yes/No)");
        String resp = sc.next();

        playAgain = resp.equalsIgnoreCase("yes");
        
        // if(resp.equalsIgnoreCase("no"))
        // {
        //     System.out.println("Your Total Score is : "+totalScore+"out of "+count +" "+"attempts");
        // }

     }
     if(totalScore==0)
     {
        System.out.println("You have loose the  game!");
        System.out.println("Your score is  "+totalScore+" "+" Out Of "+count +" "+"Attempts");

     }
     else

     System.out.println("You Have Won "+totalScore+""+"Games Out Of "+count +" "+"Attempts");

     
     
    }
        

     
}

// import java.util.*;

// public class numbergame {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         boolean playAgain = true;
//         int totalScore = 0;

//         while (playAgain) {
//             int attempts = 0;
//             int maxAttempts = 10;
//             Random rand = new Random();
//             int randomInt = rand.nextInt(100) + 1;

//             System.out.println("I have generated a random number between 1 and 100."+randomInt);
//             System.out.println("You have " + maxAttempts + " attempts to guess the number.");

//             boolean guessedCorrectly = false;
//             while (attempts < maxAttempts && !guessedCorrectly) {
//                 System.out.print("Enter your guess: ");
//                 int guess = sc.nextInt();
//                 attempts++;

//                 if (guess == randomInt) {
//                     guessedCorrectly = true;
//                     System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
//                     totalScore += (maxAttempts - attempts + 1); // Higher score for fewer attempts
//                 } else if (guess < randomInt) {
//                     System.out.println("Your guess is too low.");
//                 } else {
//                     System.out.println("Your guess is too high.");
//                 }
//             }

//             if (!guessedCorrectly) {
//                 System.out.println("Sorry, you have used all your attempts. The number was " + randomInt);
//             }

//             System.out.print("Do you want to play again? (yes/no): ");
//             String response = sc.next();
//             playAgain = response.equalsIgnoreCase("yes");
//         }

//         System.out.println("Your total score is: " + totalScore);
//         sc.close();
//     }
// }
