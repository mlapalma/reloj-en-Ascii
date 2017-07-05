
package main;

import java.util.ArrayList;
import java.util.List;

public class AsciiFormatterHelper {
    
    public static List<String> formatClockAsAscii(String hours, String minutes, String seconds) {
        List<String> hoursAsAscii = new ArrayList();
        List<String> minutesAsAscii = new ArrayList();
        List<String> secondsAsAscii = new ArrayList();
        List<String> twoDots = new ArrayList();
        
        hoursAsAscii = returnTwoNumbersAsAscii(hours);
        minutesAsAscii = returnTwoNumbersAsAscii(minutes);
        secondsAsAscii = returnTwoNumbersAsAscii(seconds);
        twoDots = returnNumberAsAscii(99);
        
        List<String> clockPanel = joinAsciiDigits(hoursAsAscii, twoDots);
        clockPanel = joinAsciiDigits(clockPanel, minutesAsAscii);
        clockPanel = joinAsciiDigits(clockPanel, twoDots);
        clockPanel = joinAsciiDigits(clockPanel, secondsAsAscii);
        
        return clockPanel;
        
    }
 
    private static List<String> returnTwoNumbersAsAscii(String numbers){
              
        String firstDigit = numbers.substring(0,1);
        String secondDigit = numbers.substring(1,2);
        
        List<String> firstDigitAsAscii = new ArrayList();
        List<String> secondDigitAsAscii = new ArrayList();
        
        firstDigitAsAscii = returnNumberAsAscii(Integer.valueOf(firstDigit));
        secondDigitAsAscii = returnNumberAsAscii(Integer.valueOf(secondDigit));
        
        return joinAsciiDigits(firstDigitAsAscii, secondDigitAsAscii);
        
    }
    
    private static List<String> joinAsciiDigits(List<String> firstDigit, List<String> secondDigit){
        List<String> finalPanel = new ArrayList();
        
        for(int x=0; x<firstDigit.size();x++){
            finalPanel.add(firstDigit.get(x)+" "+secondDigit.get(x));
        }
        
        return finalPanel;
        
    };

    private static List<String> returnNumberAsAscii(int number){
        
        List<String> numberAsAscii = new ArrayList();
        
        switch(number){
            case 0:
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#======#=#==");
                numberAsAscii.add("==#=====#==#==");
                numberAsAscii.add("==#====#===#==");
                numberAsAscii.add("======##======");
                numberAsAscii.add("==#===#====#==");
                numberAsAscii.add("==#==#=====#==");
                numberAsAscii.add("==#=#======#==");
                numberAsAscii.add("===########===");
                break;
            case 1:
                numberAsAscii.add("==============");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("==============");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("==============");
                break;
            case 2:
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("===########===");
                break;
            case 3:
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===########===");
                break;
            case 4:
                numberAsAscii.add("==============");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("==============");
                break;
            case 5:
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===########===");
                break;
            case 6:
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("==#===========");
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("===########===");
                break;
            case 7:
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("==============");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("==============");
                break;
            case 8:
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("===########===");
                break;
            case 9:
                numberAsAscii.add("===########===");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("==#========#==");
                numberAsAscii.add("===########===");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===========#==");
                numberAsAscii.add("===########===");
                break;
            case 99:
                numberAsAscii.add("=====");
                numberAsAscii.add("=====");
                numberAsAscii.add("==#==");
                numberAsAscii.add("=====");
                numberAsAscii.add("=====");
                numberAsAscii.add("=====");
                numberAsAscii.add("==#==");
                numberAsAscii.add("=====");
                numberAsAscii.add("=====");
        }
        
        return numberAsAscii;
    }    
    
    
}
