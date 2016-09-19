import greenfoot.*;
import java.lang.Class.*;
import java.awt.Color;
import java.awt.Font; 

public class GumballMachine extends Actor
{
    
    Penny act_p;
    Quarter act_q;
    FakeQuarter act_fake_q;
    MouseInfo MI;
    Inspector ins;
    Coin temp_c=null;
    boolean crank=false;
    
    public GumballMachine(/*Penny p,Quarter q,FakeQuarter fq,Inspector i*/)
    {
        //act_p=p;
        //act_q=q;
        //act_fake_q=fq;
        //ins=i;
        MI=Greenfoot.getMouseInfo();
        ins=new Inspector();
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        int mx,my;
        
        Coin worldcoin=(Coin)getOneIntersectingObject(Coin.class);
        System.out.println();
        
        if(worldcoin != null)
        {
            //System.out.println("Coin created");
            if(( worldcoin.getX()>310 && worldcoin.getX()< 470 ) && ( worldcoin.getY()> 240 && worldcoin.getY()<380 ))
            {
                getWorld().removeObject(worldcoin);
                System.out.println("Coin removed from screen");
                System.out.println("Creating the display");
                //getWorld().addObject(new Display("Turn the Crank"),250,250);
                System.out.println("Yahoo Coin is there and crank is there reafy to be turned");
                crank=true;
                System.out.println("Calling Inspector");              
                ins.checkCoin(worldcoin,getWorld());
            }
            if(worldcoin.getClass().toString().equals("class Quarter"))
                getWorld().addObject(new Quarter(), 68, 156);
            else if(worldcoin.getClass().toString().equals("class FakeQuarter"))
                getWorld().addObject( new FakeQuarter(), 66, 248 ) ;
            else
                getWorld().addObject(new Penny(), 57, 71);
        }
        crank=false;
        getWorld().repaint();
    }

}




























