import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credito extends Actor
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int puntos=2;
     public Credito(){
        getImage().scale(40,40);
        getImage().mirrorHorizontally();
    }
    public void act() 
    {
       setLocation(getX()-2,getY());
        if(isAtEdge()){
          getWorld().removeObject(this);
        }else{
            contacto();
        }
    } 
   
    private void contacto(){
        Heroe heroe = (Heroe) getOneIntersectingObject(Heroe.class);
        if(heroe!=null){
            MyWorld mundo = (MyWorld)getWorld();
            mundo.getContador().add(puntos);
            mundo.removeObject(this);
        }
    }
}
