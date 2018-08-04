
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick
 */
public class Point2D {
    
    double x, y;
    
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //Returns the vector that stretches between "this" and "other".
    public Vector subtract( Point2D other ) {
        return new Vector( this.x - other.x, this.y - other.y);
    }
}
