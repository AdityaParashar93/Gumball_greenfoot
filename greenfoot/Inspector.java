import greenfoot.*; 

public class Inspector extends Alien
{
    int temp=0;
    Display d=new Display("");
    public void act() 
    {
    }   
    
    public void checkCoin(Coin c, World g)
    {
        temp=Greenfoot.getRandomNumber(4);
        System.out.println("\n\n"+c.getClass().toString()+"\n\n\n");
        if(c.getClass().toString().equals("class Quarter"))
        {
            System.out.println("Quarter is identified");
            if (temp<=2)
            {
                System.out.println("Calling random picker");
                RandomPicker rp=new RandomPicker();
                rp.pickGumball(temp,g);
            }
            else
            {
                System.out.println("Calling green picker");
                GreenPicker gp=new GreenPicker();
                gp.green(g);
            }
        }
        else if(c.getClass().toString().equals("class Penny"))
        {
            System.out.println("Penny is identiefied");
            System.out.println("OOPS its a penny...cant dispence gumball");
            g.addObject(new Display("OOPS its a penny...cant dispence gumball"),650,250);
        }
        else 
        {
            System.out.println("FakeQuarter is identified");
            System.out.println("OOPS its a fake quarter...cant dispence gumball");
            g.addObject(new Display("Hey its a fake quarter...cant dispence gumball"),650,250);
        }
    }
}