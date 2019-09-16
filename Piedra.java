import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piedra extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Piedra(){
    getImage().scale(20,20);
    }
    public void act() 
    {
        setLocation(getX()+3,getY()+1/2);
        if(isAtEdge()){
           getWorld().removeObject(this); 
        }else{
           contacto();
        }
    }   
    
    private void contacto(){
        Enemigo enemigo = (Enemigo) this.getOneIntersectingObject(Enemigo.class);
        if(enemigo!=null){
            MyWorld mundo = (MyWorld)getWorld();
            mundo.getContador().add(1);
            enemigo.quitarVida();
            mundo.removeObject(this);
        }
    }
}
