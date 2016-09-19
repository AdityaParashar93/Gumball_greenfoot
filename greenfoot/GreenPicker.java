import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GreenPicker extends Picker
{   
    public void green(World g)
    {
        GreenGumball gg=new GreenGumball();
        System.out.println("Gumball created");
        System.out.println("Dispencing red Gumball");
        g.addObject(new Display("Turn the Crank"),550,50);
        Greenfoot.delay(150);
        g.addObject(new Display("Hey here is your green gumball"),550,450);
        gg.getImage().scale(60,60);
        g.addObject(gg,380,500);
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
