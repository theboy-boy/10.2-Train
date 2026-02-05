import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Display extends JPanel{
	public Display(){}
	// paintCommponent is not explicitly called. It is executed whenever the JPanel is called.
	// Graphics g object is implicitly passed to function.
	public void paintComponent(Graphics g){
		super.paintComponent(g); //satisfies the parent class' requirements.
		setBackground(Color.WHITE);
		Caboos railCar = new Caboos(Color.black, 3);
		railCar.drawCar(g);
		Pasenger railCar2 = new Pasenger(Color.black, 1);
		railCar2.drawCar(g);
		Fraight railCar3 = new Fraight(Color.black, 2);
		railCar3.drawCar(g);
		Locomotive railCar4 = new Locomotive(Color.blue, 0);
		railCar4.drawCar(g);
	}
}
