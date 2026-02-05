import javax.swing.*;
import java.awt.*;  
public class Fraight extends RailCar {
    public Fraight(Color color, int xCord){
        super(color, xCord);
    }
    public void drawCar(Graphics g ){
        color=Color.green;
        super.drawCar(g);
        g.drawLine(xCord+130, 200, xCord+320, 300);
        g.drawLine(xCord+130, 300, xCord+320, 200);
    }
}