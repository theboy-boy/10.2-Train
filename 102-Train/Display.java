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
		Train train = new Train();
		train.addCar("locomotive");
		train.addCar("passenger");
		train.addCar("fraight");
		train.addCar("caboos");
		train.addCar(1, "caboos");
		train.showTrain(g);
	}
}
