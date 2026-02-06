import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Train{
    private ArrayList<RailCar> trainList= new ArrayList<RailCar>();

    public Train(){

    }

    public void addCar(String type){
        if (type.equals("locomotive")){
        trainList.add(new Locomotive(Color.blue, trainList.size()));
        }else if(type.equals("caboos")){
        trainList.add(new Caboos(Color.red, trainList.size()));
        }else if (type.equals("passenger")){
        trainList.add(new Pasenger(Color.gray, trainList.size()));
        }else if (type.equals("fraight")){
        trainList.add(new Fraight(Color.green, trainList.size()));
        }
        }
    
    public void addCar(int position, String type){
        for(int i = position; i < trainList.size(); i++){
            trainList.get(i).setPosition(i+1);
        }
        if (type.equals("locomotive")){
        trainList.add(position, new Locomotive(Color.blue, position));
        }else if(type.equals("caboos")){
        trainList.add(position, new Caboos(Color.red, position));
        }else if (type.equals("passenger")){
        trainList.add(position, new Pasenger(Color.gray, position));
        }else if (type.equals("fraight")){
        trainList.add(position, new Fraight(Color.green, position));
        }
    }
    public void showTrain(Graphics g){
        for(RailCar car: trainList){
            car.drawCar(g);
        }
    }


}