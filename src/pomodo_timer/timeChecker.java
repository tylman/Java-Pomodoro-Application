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
public class timeChecker {
    String printString;
    
    public String formatTime(long resumeSeconds)
    {
        long minutes = TimeUnit.MINUTES.convert(resumeSeconds, TimeUnit.SECONDS);
        long seconds = resumeSeconds % 60;
        
        if (seconds < 10)
        {
            printString = Long.toString(minutes) +":0" + Long.toString(seconds);
        }
        
        else 
        {
            printString = Long.toString(minutes) +":" + Long.toString(seconds);
        }
        
        return printString;
    }
    
}
