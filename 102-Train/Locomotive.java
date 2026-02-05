import javax.swing.*;
import java.awt.*;  
public class Locomotive extends RailCar {
    public Locomotive(Color color, int xCord){
        super(color, xCord);
    }
    public void drawCar(Graphics g ){
        color=Color.blue;
        super.drawCar(g);
        int[] xCords = {xCord+50, xCord+130, xCord+130};
        int[] yCords = {300, 300, 240};
        g.drawPolygon(xCords, yCords, 3);
        g.fillPolygon(xCords, yCords, 3);
    }
    
}