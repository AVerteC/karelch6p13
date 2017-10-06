import kareltherobot.*;
import java.awt.Color;

public class pather extends Robot 
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class advfunct
     */
    public pather(int st, int av, Direction d, int b)
   
    {
        // initialise instance variables
        super(st, av, d, b);
    }

   
    public void turnRight() 
    {
    turnLeft();
    turnLeft();
    turnLeft();
    
            
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
        
     }

    public void moveMile()
    {
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
    }
    
    public void unLost()
        {
            
                while(nextToABeeper())
                {
                pickBeeper();
                move();
            }
            turnAround();
            move();
            dumpBeeper();
            leftBeeper();
            rightBeeper();
            if(!nextToABeeper())
            {
            move();
            }
            
        }   
    
   
        
        public void dumpBeeper()
        {
        while(anyBeepersInBeeperBag())
        {
        putBeeper(); 
        }
        }
        
        
        //different pathing
            public void leftBeeper()
            {
            turnRight();
            move();
            if(nextToABeeper())
            {
            while(nextToABeeper())
                {
                pickBeeper();
                move();
            }
            } 
            turnAround();
            move();
            turnRight();
        }    
    
        public void rightBeeper()
        {
            turnLeft();
            move();
            if(nextToABeeper())
                {
                while(nextToABeeper())
                    {
                    pickBeeper();
                    move();
                }
                } 
                turnAround();
                move();
                turnLeft();
        }    
        
                
        
        
        
        
        


    public static void main(String [] args)
    {
        pather ko = new pather(2, 2, East, 0);
        ko.move();
        ko.unLost();
        ko.unLost();
        ko.unLost();
        ko.unLost();
        ko.unLost();
        ko.unLost();
        ko.turnOff();
    }
        
        
    

    static
    {
        World.reset();
        World.readWorld("path.kwld");
        World.setBeeperColor(Color.red);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10); 
        World.setVisible(true);
    }


}