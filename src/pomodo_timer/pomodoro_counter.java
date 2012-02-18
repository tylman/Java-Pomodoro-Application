/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pomodo_timer;


import java.util.concurrent.TimeUnit;

/**
 *
 * @author Andrew
 */
public class pomodoro_counter {
    
    int pomodoro_count=0;
   
    
    
    //resets pomodor count if need be
    public void reset_pomodoro()
    {
        pomodoro_count=0;
    }
    
    //Takes current time and calculates number of Pomodoro's in the alloted time
     public long pomodoroCount(long currentTime)
     {
        long minutes = TimeUnit.MINUTES.convert(currentTime, TimeUnit.SECONDS);
        long pomodoroCount = minutes/25;
        
        
        return pomodoroCount;
     }
     

 
      
}

