import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Se simula el movimiento de los objetos. Además de simular movimiento se verifíca el contacto con el personaje principal<br>
 * dentro del escenario, si los dos objetos se interceptan se le disminuye una vida al personaje principal.
 * 
 * @author Manuel Alejandro Valdes-Marrero  
 * @author Esdras Salgado Díaz 
 * @version 30/01/2017
 */
public class Fantasma extends Enemigo
{
    /**
     *Se inicializa objeto fantasma (propiedades).
     */
     public Fantasma(){
         velocidad=-1;
        getImage().scale(40,40);
        vida=10;
        puntos=10;
    }
    /**
     * Movimiento del personaje. El personaje se desplaza de izquierda a derecha del escenario, si detecta borde se elimina<br>
     * si no verifica el contacto con el personaje principal como la cantidas de vidad que posee.
     */
    public void act() 
    {
       setLocation(getX()-2,getY());
        if(isAtEdge()){
          getWorld().removeObject(this);
        }else{
            contacto();
        }
           sigoVivo();
    } 
    /**
     *Se verifica la vida de lo enemigo. Si la vida del enemigo es igual o menor a cero se remueve del escenario.
     */
    public void sigoVivo(){
        if(vida<=0){
           getWorld().removeObject(this);
        }
        
    }
    /**
     * Contacto con el personaje principal. En dado caso de que el enemigo tuviera contacto con el personaje principal
     * se le asiga la vida de 1. (Esto para seguidamente ser removido).
     */
    private void contacto(){
        Heroe heroe = (Heroe) getOneIntersectingObject(Heroe.class);
        if(heroe!=null){
            vida=1;
        }
    }
}
