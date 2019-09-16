import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int puntos=1;
     public Vida(){
        getImage().scale(20,20);
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
            mundo.getVidas().add(puntos);
            mundo.removeObject(this);
        }
    }
}
