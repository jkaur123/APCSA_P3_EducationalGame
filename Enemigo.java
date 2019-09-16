import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo Controla puntos y vida de los personajes malos.
 * 
 * @author Manuel Alejandro Valdes-Marrero 
 * @author Esdras Salgado Díaz
 * @version 30/01/2017
 */
public class Enemigo extends Actor
{
    /**
     * Tendrá la velocidad con la que se movera el enemigo.
     */
    protected int velocidad;
    /**
     * Tendrá las vidas con la participará el enemigo.
     */
    protected int vida;
    /**
     * Tendrá los puntos que se darán al personaje principal al morir.
     */
    protected int puntos;
    /**
     * Verifíca constantemente la vida de los enemigos llamando a otro método.
     */
    public void act() 
    {
        sigoVivo();
    } 
    /**
     * Verifíca vida de los enemigos. Si las vida de los enemigos es menor o igual a cero, remueve a los objetos del escenario.
     */
    protected void sigoVivo(){
        if(vida<=0){
        getWorld().removeObject(this);
        }
    }
   /**
     * Quita vida a los enemigos. Si las vida de los enemigos es mayor a cero, resta una vida al enemigo.
     */
    public void quitarVida(){
        if(vida>0){
            vida--;
        }
    }
    /**
     * gtePuntos 
     * @return puntos que da el enemigo. 
     */
    public int getPuntos(){
        return puntos;
    }
}
