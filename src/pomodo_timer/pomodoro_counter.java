/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pomodo_timer;

/**
 *
 * @author Andrew
 */
public class pomodoro_counter {
    
    int pomodoro_count=0;
    
    public void increase_pomodoro() 
    {
        
        pomodoro_count+=1;
    }
    
    public void reset_pomodoro()
    {
        pomodoro_count=0;
    }
    
    public int get_pomodoro()
    {
        return pomodoro_count;
    }
    
    private void check_for_pomodoro(long currentTime)
   {
       
       
   }
    
      
}

