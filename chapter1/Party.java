import java.awt.*;
import java.awt.event.*;

class Party{
	public void buildInvite() {
		Frame f = new Frame();
		Label l = new Label("Party at Jeffs");
		Button b = new Button("You betcha");
		Button c = new Button("Shoot Me!!!");
		Panel p = new Panel();
		p.add(l);
	}

	public static void main(String[] args) {
		int x = 3;
		if (x == 3) {
			System.out.println("x must be 3");
		}
		System.out.println("this runs no matter what");
	}
}
