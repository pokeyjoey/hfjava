package chapter2;

public class GuessGame {

   Player p1;
   Player p2;
   Player p3;
   
   public void startGame() {
	
	   // Make three plaer objects
       p1 = new Player();
       p2 = new Player();
       p3 = new Player();

	   // holds the three guesses players make
       int guessp1 = 0;
       int guessp2 = 0;
       int guessp3 = 0;

	   // hold a boolean based on the players answer
       boolean p1isRight = false;
       boolean p2isRight = false;
       boolean p3isRight = false;

	   // Target holds the players guess
       int targetNumber = (int) (Math.random() * 10);
       System.out.println("I'm thinking of a number between 0 and 9...");
       while(true) {
           System.out.println("Number to guess is " + targetNumber);
           
		   // call each players guess method
           p1.guess();
           p2.guess();
           p3.guess();
           
		   // get each players guess
           guessp1 = p1.number;
           System.out.println("Player one guessed " + guessp1);
           guessp2 = p2.number;
           System.out.println("Player two guessed " + guessp2);
           guessp3 = p3.number;
           System.out.println("Player three guessed " + guessp3);
           
		   // check the guesses
           if (guessp1 == targetNumber) {
               p1isRight = true;
           }
           if (guessp2 == targetNumber) {
               p2isRight = true;
           }
           if (guessp3 == targetNumber) {
               p3isRight = true;
           }
           
		   // if there is a winning guess
           if (p1isRight || p2isRight || p3isRight)
           {
               System.out.println("We have a winner!");
               System.out.println("Player one got it right? " + p1isRight);
               System.out.println("Player two got it right? " + p2isRight);
               System.out.println("Player three got it right? " + p3isRight);
               System.out.println("Game is over");
               break;
           }
		   // otherwise stay in the loop and guess again
           else
           {
               System.out.println("Players will have to try again.");
           }
       }
   }
}
