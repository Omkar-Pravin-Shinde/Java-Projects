import java.util.*;
class generator
{
    int numGenrator;
    int guessNumber()
    {

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Generate Random  Number from 0 to 100 ");
        // numGenrator =scan.nextInt();
        // return numGenrator;
        int number = 1 + (int)(100
                               * Math.random());
        return number;
    }
}



class player
{
    int numplayer;
    int GuessPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player Gauess Number !");
        numplayer = scan.nextInt();
        return numplayer;
    }
}


class umpire
{
    int numFromGenerator;
    int numFromPlayer1;
    // int numFromPlayer2;
    // int numFromPlayer3;

    void collectNumFromGenerator()
    {
        generator g = new generator();
        numFromGenerator = g.guessNumber();
    }

    void collectNumFromPlayer()
    {
        // player p2 = new player();
        // player p3 = new player();
        
        // numFromPlayer2 = p2.GuessPlayer();
        // numFromPlayer3 = p3.GuessPlayer();
        
    }
    
    void range()
    {
        int i =0;
        int k=5;
        for(i=0;i<k;i++)
        {

            player p1 = new player();
            numFromPlayer1 = p1.GuessPlayer();
            if(numFromGenerator == numFromPlayer1)
            {
            System.out.println("You win !!!!!");
            break;
            }
            else if(numFromGenerator > numFromPlayer1 && i != k-1)
            {
                System.out.println("Number is Bigger Than Your Guess");
            }
            else if(numFromGenerator < numFromPlayer1 && i != k-1)
            {
                System.out.println("Number is Smaller than Your Guess");
            }
            
        }
        if (i == k) {
            System.out.println(
                "You have exhausted"
                + k +" trials.");
 
            System.out.println(
                "The number was " + numFromGenerator);
        }
    }

    // void compare()
    // {
    //     if(numFromGenerator==numFromPlayer1)
    //     {
    //         if(numFromGenerator==numFromPlayer2 && numFromGenerator==numFromPlayer3)
    //         {
    //             System.out.println("All Win !!!!!!!");
    //         }
    //         else if(numFromGenerator==numFromPlayer2)
    //         {
    //             System.out.println("Player 1 and Player 2 win");
    //         }
    //         else if(numFromGenerator==numFromPlayer3)
    //         {
    //             System.out.println("Player 1 and Player 3 win");
    //         }
    //         else
    //         {
    //             System.out.println("Player 1 win..........");
    //         }
    //     }
    //     else if(numFromGenerator==numFromPlayer2)
    //     {
    //         if(numFromGenerator==numFromPlayer3)
    //         {
    //             System.out.println("Player 2 and 3 win");
    //         }
    //         else{
    //             System.out.println("player 2 win...........");
    //         }
    //     }
    //     else if(numFromGenerator==numFromPlayer3)
    //     {
    //             System.out.println("player 3 win...........");

    //     }
    //     else
    //     {
    //         System.out.println("All lost !!!!!");
    //     }
    // }
}

public class Gauesser 
{
    public static void main(String[] args) {
        System.out.println("Game Started");

        umpire u = new umpire();
        u.collectNumFromGenerator();
               
            u.collectNumFromPlayer();
            u.range();
        
        
       
        
    }
    
}
