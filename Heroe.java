import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heroe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heroe extends Actor
{
     private Boolean ban=true;
    private GreenfootSound musicaFondo;
    private int tiempo=0;
    private boolean bandera;
    private int y=1;
    private int ySpeed=1;
    private int up=15;
    private int speed=2;
    private int vidaHeroe=1;
    private boolean inmune = false;
    private SimpleTimer timer;
    
    public Heroe(){
       getImage().scale(40,40);
       
    }
    
    public void act() 
    {
        movimiento();
        disparar();
        caida();
        contacto();
         if(ban){
           musicaFondo = new GreenfootSound("1.mp3");
           musicaFondo.playLoop();
       ban=false;
       }
       inmunidad();
       //salto();
    } 
   
   /* private void movimiento(){
       if(isAtEdge()){
            velocidad*=1;
            getWorld().removeObject(this);
        }else{
            setLocation(getX()+velocidad,getY());
        }
    }*/
   private void contacto(){
        Enemigo enemigo = (Enemigo) getOneIntersectingObject(Enemigo.class);
        if(enemigo!=null && !inmune){
            vidaHeroe--;
             MyWorld mundo = (MyWorld)getWorld();
            mundo.getVidas().add(-1);
            inmune = true;
            timer = new SimpleTimer();
            timer.mark();
        }
        Vida vida = (Vida) getOneIntersectingObject(Vida.class);
        if(vida!=null){
            vidaHeroe++;
        }
        if(vidaHeroe<=0){
            morir();
        }
    }
    
    private void inmunidad() {
        if (timer!= null && timer.millisElapsed()>= 700){
            timer = null;
            inmune = false;
        }
    }
    
     public int getVidas(){
        return vidaHeroe;
    }
    
    private void disparar(){
       if(tiempo<=0){
            if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Piedra(), getX()+30, getY()-15);
            tiempo=10;
            }
       }else{
         tiempo--;  
       }
    }
    private void movimiento(){
        if(Greenfoot.isKeyDown("right")){
            move(5);
        }
    
        if(Greenfoot.isKeyDown("left")){
                move(-5);
        }
        
        if(Greenfoot.isKeyDown("up")){
           salto();
        }
        
    }
    
    public void salto(){
        if(bandera==false){
            y=-up;
            saltar();
        }
    }
    
    public void saltar(){
        bandera=true;
        setLocation(getX()+2,getY()+y);
        y=y+ySpeed;
        if(getY()>=365){
            y=0;
        }
    
    }
    
    public void caida()
    {
        if(contactoPlataforma()){
            y=0;
        }else if(contactoNube()){
          y=0;
        }else{
            saltar();
        }
    }
    
    public boolean contactoPlataforma()
    {
        bandera=false;
       
       Actor plataforma=getOneObjectAtOffset(0,getImage().getHeight()/20,Plataforma.class);
        return plataforma!=null;
    }
    
    public boolean contactoNube()
    {
        bandera=false;
       
       Actor nube=getOneObjectAtOffset(0,getImage().getHeight()/20,Nubes.class);
        return nube!=null;
    }
    
    public void morir(){
        setImage("explosion.png");
        musicaFondo.stop();
        Greenfoot.stop();
        MyWorld mundo = getWorldOfType(MyWorld.class);
        mundo.gameOver();
    }
}
