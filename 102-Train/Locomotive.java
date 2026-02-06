import javax.swing.*;
import java.awt.*;  
public class Locomotive extends RailCar {
    public Locomotive(Color color, int position){
        super(color, position);
    }
    public void drawCar(Graphics g ){
        color=Color.blue;
        super.drawCar(g);
        int[] xCords = {xCord+50, xCord+130, xCord+130};
        int[] yCords = {300, 300, 240};
        g.drawPolygon(xCords, yCords, 3);
        g.fillPolygon(xCords, yCords, 3);
        g.fillRect(xCord+150, 150, 20, 50);
    }
    
}