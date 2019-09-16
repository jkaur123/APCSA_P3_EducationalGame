import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Se visulizará el movimiento del suelo hacia la izquierda
 * 
 * @author Esdras Salgado Díaz 
 * @version 30/01/2017
 */
public class Suelo extends Actor
{
    /**
     * Se asigna tamaño a el bloque de suelo.
     */
     public Suelo(){
        getImage().scale(100,15);
    }
    /**
     *Se simula movimiento del suelo. En caso de que el bloque de suelo toquen borde del escenario se removerán.
     */
    public void act() 
    {
       setLocation(getX()-1,getY());
        if(isAtEdge()){
          getWorld().removeObject(this);
        }
    } 
   
   
}
