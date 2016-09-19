import greenfoot.*;  
import java.lang.Class.*;


public class RandomPicker extends Picker
{
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void pickGumball(int temp,World g)
    {
        RedGumball rg=new RedGumball();
        BlueGumball bg=new BlueGumball();
        System.out.println(temp);
        if(temp==1)
        {
            System.out.println("Gumball created");
            System.out.println("Dispencing red Gumball");
            g.addObject(new Display("Turn the Crank"),550,50);
            Greenfoot.delay(150);
            g.addObject(new Display("Hey here is your red gumball"),550,450);
            rg.getImage().scale(60,60);
            g.addObject(rg,380,500);
            
        }
        else
        {
            System.out.println("Dispencing Blue Gumball");
            bg.getImage().scale(60,60);
            g.addObject(new Display("Turn the Crank"),550,50);
            Greenfoot.delay(150);
            g.addObject(new Display("Hey here is your Blue gumball"),550,450);
            g.addObject(bg,380,500);
            
        }
        
    }
}