/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad2;
import java.util.Random;

/**
 *
 * @author Kowali
 */
public class Punkt2D {
    
    private int x;
    private int y;
    
    public Punkt2D(){
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getx(){
     return x;   
    }
    
    public int gety(){
     return y;   
    }
    
    public Punkt2D Losuj(){
     Random n = new Random();   
     Punkt2D p1= new Punkt2D(n.nextInt(21)-10, n.nextInt(21)-10);
     return p1;
    }

    @Override
    public String toString() {
        return "Współrzędne punktu: " + x + "," + y; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
