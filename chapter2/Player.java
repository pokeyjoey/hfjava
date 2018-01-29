package chapter2;

public class Player {
	// holds the guess
    int number = 0;

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
