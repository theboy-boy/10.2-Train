import javax.swing.*;
import java.awt.*;              

public class RailCar{
    protected Color color;
    protected int xCord;

    public RailCar(Color color, int xCord) {
        this.color = color;
        this.xCord = xCord;
    }
    public void drawCar(Graphics g){
        g.setColor(color);
        g.fillRect(xCord+130, 200, 190, 100);
        g.setColor(Color.black);
        g.fillOval(xCord+125, 275, 50, 50);
        g.fillOval(xCord+275, 275, 50, 50);

    }


}

