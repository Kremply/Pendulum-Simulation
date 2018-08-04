/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick
 */
public class Vector {
    
    double xComponent, yComponent;
    
    public Vector(double x, double y) {
        this.xComponent = x;
        this.yComponent = y;
    }
    
    //needed as part of the convex hull algorithm and for finding the farthest pair within the vertices of the convex hull
    public double getAngle( Vector other ) {  
        double vDotw = this.dotProduct( other );
        double magV = this.magnitude();
        double magW = other.magnitude();
        
        return Math.acos( vDotw / (magV*magW) );
    }
    
    //only used inside getAngle()
    private double dotProduct( Vector other ) {
        return this.xComponent*other.xComponent + this.yComponent*other.yComponent;
    }
    
    //only used inside getAngle()
    private double magnitude() {
        return Math.sqrt( this.xComponent*this.xComponent + this.yComponent*this.yComponent );
    }
}
