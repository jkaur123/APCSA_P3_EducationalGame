import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2 extends Player
{
<<<<<<< HEAD
    
    Label correctanswer = new Label ("Correct answer!\n", 75);
    Label winningmessage = new Label ("You won!\n", 75);
    
    Label wronganswer = new Label ("Wrong answer, \n try again.", 75);
    
    
    
=======
>>>>>>> d7cbdd938f8ba43d2dbfc3e0fb0f8f0d05399bf0
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        Action("jump/fall", " ", "up", " ", 10, 0);
        Action("moveL", " ", "left", "shift", 10, 3);
        Action("moveR", " ", "right", "shift", 10, 3);
        wrong_answer();
       
    }    
    
    private void wrong_answer()
    {
        Actor Ant;
        Actor Wrong;
        Ant = getOneObjectAtOffset(0,0,Ant.class);
        Wrong = getOneObjectAtOffset(0,0,Wrong_ant.class);
        if (Ant != null){
<<<<<<< HEAD
            correctanswer.setFillColor(Color.RED);
            correctanswer.setLineColor(Color.BLACK);
            getWorld().addObject(correctanswer, 300, 200);
            
            winningmessage.setFillColor(Color.RED);
            winningmessage.setLineColor(Color.BLACK);
            getWorld().addObject(winningmessage, 300, 300);
            
            Greenfoot.delay(30);
=======
>>>>>>> d7cbdd938f8ba43d2dbfc3e0fb0f8f0d05399bf0
            
            Greenfoot.stop();
        }
        if(Wrong != null){
<<<<<<< HEAD
            wronganswer.setFillColor(Color.RED);
            wronganswer.setLineColor(Color.BLACK);
            getWorld().addObject(wronganswer, 300, 200);
            
            Greenfoot.delay(30);
=======
>>>>>>> d7cbdd938f8ba43d2dbfc3e0fb0f8f0d05399bf0
            
            Greenfoot.setWorld(new second_level());
        }
    }
}




