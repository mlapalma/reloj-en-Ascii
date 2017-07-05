
package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainConsoleDisplay {
    
    
    
    public static void main(String[] args){
        List<String> clock = new ArrayList();
        
        Date now = new Date();
        
        SimpleDateFormat hours = new SimpleDateFormat("HH");
        SimpleDateFormat minutes = new SimpleDateFormat("mm");
        SimpleDateFormat seconds = new SimpleDateFormat("ss");
        
        clock = AsciiFormatterHelper.formatClockAsAscii(hours.format(now), minutes.format(now), seconds.format(now));
        
        for(String line : clock){
            System.out.println(line);
        }    
        
    }
    
}
