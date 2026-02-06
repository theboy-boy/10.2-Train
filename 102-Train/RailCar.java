import javax.swing.*;
import java.awt.*;              

public class RailCar{
    protected Color color;
    protected int xCord;

    public RailCar(Color color, int position) {
        this.color = color;
        this.xCord = position*240;
    }
    public void drawCar(Graphics g){
        g.setColor(color);
        g.fillRect(xCord+130, 200, 190, 100);
        g.setColor(Color.black);
        g.fillOval(xCord+125, 275, 50, 50);
        g.fillOval(xCord+275, 275, 50, 50);
        g.fillRect(xCord+80, 280, 50, 10);

    }
    public void setPosition(int position){
        xCord=position*240;
    }

}

