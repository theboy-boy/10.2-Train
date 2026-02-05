import javax.swing.*;
import java.awt.*;  
public class Caboos extends RailCar {
    public Caboos(Color color, int xCord){
        super(color, xCord);
    }
    public void drawCar(Graphics g ){
        color=Color.red;
        super.drawCar(g);
        g.setColor(Color.red);
        g.fillRect(xCord+150, 170, 150, 30);
    }
}