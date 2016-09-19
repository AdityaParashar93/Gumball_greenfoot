import greenfoot.*; 
import java.awt.Color;
import java.util.*;

public class Display extends Actor
{
   GreenfootImage is;
    public Display(String txt)
    {
        is=new GreenfootImage(txt,16,Color.BLACK, Color.WHITE);
        setImage(is);
    }
    
    public void updateDisplay(String txt)
    {
        is=new GreenfootImage(txt,16,Color.BLACK, Color.WHITE);
        setImage(is);
    }
       public void act() 
    {
        // Add your action code here.
    }    
}
