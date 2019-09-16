import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso extends Actor
{
    /**
     * Act - do whatever the piso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public piso(){
        getImage().scale(80,40);
    }
    
    public void act(){
        setLocation(getX()-2,getY());
        if(isAtEdge()){
          getWorld().removeObject(this);
        }
    }
  
}
