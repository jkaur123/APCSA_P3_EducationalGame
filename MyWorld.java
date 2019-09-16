import greenfoot.*;
import java.util.*;

  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase MyWorld, Mundo Principal para representar el juego.<br>
 * Clase para instanciar al personaje principal, se generan de forma aleatoria nubes, vidas y enemigos ,
 * que tendrán participación en el juego, se controla el inicio y el fin de juego.
 * @author Esdras Salgado Díaz.
 * @author User anonimus (elimina_escenario,gameOver)
 * @version 30/01/2017
 */
public class MyWorld extends World
{

    
    /**
     * Contador para score, Lleva el registro de puntos.
     * Se encarga de almacenar el número de puntos por cada Hoja comida y enemigo Muerto.
     */
    protected Counter contador;
    /**
     * Contador para vidas, Lleva el registro de vidas.
     * Se encarga de almacenar el número de vidas del personaje principal.
     */
    protected Counter vidas;
    private SimpleTimer timer;
    private BotonInicio botonInicio = new BotonInicio();
    private Boolean banderaInicio=false;
    private GreenfootImage fondoJuego;
    private GreenfootImage fondoPortada;
     /**
     * Prepara el escenario.
     * Se preparan los fondos del escenario y portada. Inicia el juego. 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        fondoJuego = new GreenfootImage("fondo.jpg");
        fondoPortada = new GreenfootImage("portada.jpg");
        inicio();
    }
     /**
     * Se establece objetos de primera vista. 
     * Se carga el fondo del juego y se añade un botón de inicio.
     */
     public void inicio(){
                setBackground(fondoPortada);
                addObject(botonInicio,150,350);
    }

    /**
     * Posiciones de personajes y otros. Se instancian los objetos que participarán en el juego.<br>
     * Se predefinen las posiciones de cada objeto dependiendo su interacción.
     */
    private void prepare()
    {
        Heroe heroe = new Heroe();
        addObject(heroe,50,270);
        contador = new Counter("Score: ");
        addObject(contador, 500, 20);
        vidas = new Counter("Vidas: ");
        addObject(vidas, 100, 20);
        addObject(new Plataforma(),0,380);
         addObject(new Suelo(),570,395);
        addObject(new Suelo(),470,395);
        addObject(new Suelo(),420,395);
        addObject(new Suelo(),370,395);
        addObject(new Suelo(),320,395);
        addObject(new Suelo(),270,395);
        addObject(new Suelo(),220,395);
        addObject(new Suelo(),170,395);
        addObject(new Suelo(),120,395);
        addObject(new Suelo(),70,395);
        addObject(new Suelo(),20,395);
          timer = new SimpleTimer();
         timer.mark();
    }
    /**
     * getContador 
     * @return contador de score.
     */
    public Counter getContador(){
        return contador;
    }
    /**
     * getVidas 
     * @return contador de vida.
     */
     public Counter getVidas(){
        return vidas;
    }
    
  
    /**
     *Inicia la interacción de los objetos.
     *Se le da función al botón de inicio, se elimina la portada del juego y se crean los objetos en forma aleatoria.
     */
    public void act(){
        
        if(Greenfoot.mouseClicked(botonInicio))
        {
           setBackground(fondoJuego); 
           elimina_escenario();
           prepare();
           banderaInicio=true;
        }
        if(banderaInicio){
            
            if(Greenfoot.getRandomNumber(150)<1){//probabilidad de 0 de 100
                addObject(new Dinosaurio(),570,370);
               //addObject(new Nave(),1,Greenfoot.getRandomNumber(100)+50);
                //se crea objeto, se define posición de x,se obtiene numero alea-
                //torio y se le suma 50.
            }
            
            if(Greenfoot.getRandomNumber(250)<1){//probabilidad de 0 de 100
                addObject(new Fantasma(),570,Greenfoot.getRandomNumber(250)+100);
            }
            
             if(Greenfoot.getRandomNumber(250)<1){//probabilidad de 0 de 100
                addObject(new Nubes(),570,Greenfoot.getRandomNumber(250)+100);
            }
            
             if(Greenfoot.getRandomNumber(500)<1){//probabilidad de 0 de 100
                addObject(new Credito(),570,Greenfoot.getRandomNumber(150)+200);
            } 
             if(Greenfoot.getRandomNumber(2050)<1){//probabilidad de 0 de 100
                addObject(new Vida(),570,Greenfoot.getRandomNumber(150)+200);
            } 
              //addObject(new Suelo(),570,395);
           piso();
        }
    }
    /**
     *elimina_escenario Elimina la portada. Se elimina la portada del juego.
     */
     public void elimina_escenario()
    {
        
        List lista_mundo = getObjects(null);
        Iterator i = lista_mundo.iterator();
        while(i.hasNext())
        {
            Actor a = (Actor) i.next();
            if( a!= null ) 
            {
                removeObject(a);
            }
        }
    }
    
    /**
     *piso Se crea el piso. Cada determinado tiempo se añade un objeto de tipo piso el cual tendrá la función de simular movimiento.
     */
     private void piso() {
        if (timer!= null && timer.millisElapsed()>= 400){
              addObject(new Suelo(),570,395);
            timer = null;
         timer = new SimpleTimer();
         timer.mark();
        }
    }
    /**
     *Finaliza el juego. Se prepara textos para indicar al usuario que ha perdido y se le notifica su score.<br>
     *se le da color al texto, se posicionan los textos y se detiene el escenario.
     */
     public void gameOver()
    {
        Label label = new Label("GAME OVER\n" ,108);
        Label label2 = new Label("Score:\n"+ getContador().getValue(),108);
        label.setFillColor(Color.RED);
        label.setLineColor(Color.BLACK);
        label2.setFillColor(Color.YELLOW);
        label2.setLineColor(Color.BLACK);
        addObject(label, 300, 100);
        addObject(label2, 300, 250);
        Greenfoot.stop();
    }
}
