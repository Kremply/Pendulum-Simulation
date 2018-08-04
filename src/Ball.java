/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick
 */
public class Ball{
    double GRAVITY = 9.8;
    double angle;
    double aAcceleration;
    double aVelocity;
    double xVelocity;
    double yVelocity;
    double dampener;
    double mass;
    double kineticEnergy;
    int xPos;
    int yPos;
    int radius;
    int length;
    Anchor anch;
    
    public Ball(double a, double aA, double aV, int r, int l, Anchor anch){
        this.angle = a;
        this.aAcceleration = aA;
        this.aVelocity = aV;
        this.radius = r;
        this.length = l;
        this.dampener = 1;
        this.anch = anch;
        this.xPos = (anch.xPos + (int)(this.length*Math.sin(angle)));
        this.yPos = (anch.yPos + (int)(this.length*Math.cos(angle)));
    
    }
    public void aAcceleration(){  
        this.aAcceleration = (-GRAVITY/this.length)*Math.sin(this.angle);
    }
    public void aVelocity(){
        this.aVelocity = this.aVelocity + this.aAcceleration ; 
        this.aVelocity*= this.dampener; //dampener
    }
    public void calculateAngle(){
        this.angle = this.angle + this.aVelocity *0.1;
    }
    public void calculateBallPosition(){
        this.xPos = (400 + (int)(this.length*Math.sin(this.angle))) ;
        this.yPos = (100 + (int)(this.length*Math.cos(this.angle))) ;
    }
    public void calculateEnergy(double vel){
        calculateBallPosition();
        this.kineticEnergy = Math.abs(Math.round(this.mass* Math.pow(vel, 2)/2));
    }
    public void calculateVelocityComponents(){
        this.xVelocity = Math.abs(Math.round(this.aVelocity*Math.cos(this.angle)*100));
        this.yVelocity = Math.abs(Math.round(this.aVelocity*Math.sin(this.angle)*100));
    }
    public void updatePendulum(){
        aAcceleration();
        aVelocity();
        calculateAngle();
        calculateBallPosition();
    }
}
