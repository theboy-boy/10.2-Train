import javax.swing.*;
import java.awt.*;  
public class Pasenger extends RailCar {
    public Pasenger(Color color, int xCord){
        super(color, xCord);
    }
    public void drawCar(Graphics g ){
        color=Color.gray;
        super.drawCar(g);
        g.setColor(Color.black);
        g.fillRect(xCord+150, 210, 150, 60);
    }
}