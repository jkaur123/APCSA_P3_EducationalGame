import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton_inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonInicio extends Botones
{
    /**
     * Act - do whatever the Boton_inicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // GreenfootSound worthIt = new GreenfootSound("Worth It.mp3");
    public BotonInicio(){
          getImage().scale(300,200);
    }
    public void act() 
    {
        
         if(Greenfoot.mouseMoved(this)) {
             getImage().scale(300,200);
            setImage("play.png");
        }else if (Greenfoot.mouseMoved(null)) {
        }if(Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
        }
    }       
}

