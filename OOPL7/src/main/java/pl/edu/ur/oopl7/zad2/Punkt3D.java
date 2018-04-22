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
public class Punkt3D extends Punkt2D{
    
    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public Punkt3D(){
        
    }
    
    public int getz(){
     return z;   
    }
    
    
    public Punkt3D Losuj(){
     Random n = new Random();   
     Punkt3D p1 = new Punkt3D(n.nextInt(21)-10, n.nextInt(21)-10, n.nextInt(21)-10);
     return p1;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + z; //To change body of generated methods, choose Tools | Templates.
    }
    
}
