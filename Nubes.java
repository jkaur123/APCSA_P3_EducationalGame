import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nubes Se simula el movimento de las nubes.
 * 
 * @author Esdras Salgado Díaz 
 * @version 30/01/2017
 */
public class Nubes extends Actor
{
    /**
     *Se asigna un tamaño a las nubes.
     */
    public Nubes(){
        getImage().scale(80,40);
    }
    /**
     *Se simula movimiento de las nubes. En caso de que las nubes toquen borde del escenario se removerán.
     */
    public void act(){
        setLocation(getX()-2,getY());
        if(isAtEdge()){
          getWorld().removeObject(this);
        }
    }
  
}
