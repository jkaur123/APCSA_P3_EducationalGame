import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int JPower = 10;
    public int VSpeed = 0;
    public int Drag = VSpeed - 2;
    public int keyPressed = 0;
    public int bounce = 0;
    public int eighthWidth = getImage().getWidth()/8;
    public int quarterWidth = getImage().getWidth()/4;
    public int halfWidth = getImage().getWidth()/2;
    //set JPower
    public void JPower(int Power)
    {
        JPower = Power;
    }
    //checks if chacracter is on the ground
    public boolean touchingWallL()
    {
        Actor actor = getOneObjectAtOffset(0-quarterWidth, 0, Wall.class);
        return actor != null;
    }
    
    public boolean touchingWallR()
    {
        Actor actor = getOneObjectAtOffset(quarterWidth, 0, Wall.class);
        return actor != null;
    }
    
    public boolean onWall()
    {
        Actor actor = getOneObjectAtOffset(0, halfWidth, Wall.class);
        return actor != null;
    }
    
    public boolean belowWall()
    {
        Actor actor = getOneObjectAtOffset(0, 0-halfWidth, Wall.class);
        return actor != null;
    }
    
    public boolean onGround()
    {
        Actor actor = getOneObjectAtOffset(0, halfWidth, Ground.class);
        return actor != null;
    }
    
    public boolean inGround()
    {
        Actor actor = getOneObjectAtOffset(0, eighthWidth, Ground.class);
        return actor != null;
    }
    
    /**Listed actions so far are:jump/fall, moveL, moveR, boxPhysics
     */
    public void Action(String Action, String Char, String Key, String Key2, int AnimationFrames, int Speed)
    {
        if(Action == "jump/fall")
        {
            if(Greenfoot.isKeyDown(Key))
            {
                keyPressed = 1;
            }
            if( JPower > 0 && keyPressed == 1 && !belowWall())
            {
                setLocation(getX(), getY()-JPower);
                JPower--;
            }else if (onGround() || onWall()){
                JPower = 10;
                VSpeed = 0;
                keyPressed = 0;
            }else{
                setLocation(getX(), getY()-VSpeed);
                VSpeed--;
            }
            if(inGround())
            {
                Actor ground = getOneObjectAtOffset(0, eighthWidth, Ground.class);
                setLocation(getX(), getY()-ground.getImage().getHeight());
            }
            if(belowWall())
            {
                JPower = 0;
            }
        }
        if(Action == "moveL")
        {
            if(Greenfoot.isKeyDown(Key) && Greenfoot.isKeyDown(Key2) && !touchingWallL())
            {
                setLocation(getX()-Speed*2, getY());
            }else if(Greenfoot.isKeyDown(Key) && !touchingWallL())
            {
                setLocation(getX()-Speed, getY());
            }
            if(inGround())
            {
                Actor ground = getOneObjectAtOffset(0, eighthWidth, Ground.class);
                setLocation(getX(), getY()-ground.getImage().getHeight());
            }
        }
        if(Action == "moveR")
        {
            if(Greenfoot.isKeyDown(Key) && Greenfoot.isKeyDown(Key2) && !touchingWallR())
            {
                setLocation(getX()+Speed*2, getY());
            }else if(Greenfoot.isKeyDown(Key) && !touchingWallR())
            {
                setLocation(getX()+Speed, getY());
            }
            if(inGround())
            {
                Actor ground = getOneObjectAtOffset(0, eighthWidth, Ground.class);
                setLocation(getX(), getY()-ground.getImage().getHeight());
            }
        }
    }
}
