
package readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class readTXTFile{
  
     public static int [][] readTheFile(String TxtUrl) throws FileNotFoundException {
    // create a BufferedReader object to read the file
     String input=TxtUrl;
     ArrayList<Integer> measurements = new ArrayList<>();           
     BufferedReader reader = new BufferedReader(new FileReader(input));        
        String line;  
        int number;       
       
        try {               
            // reads the file line by line
            while ((line = reader.readLine()) != null) {                
                try{
                    //separetes the number from chars
                    String numbersOnly = line.replaceAll("[^0-9]", "");                    
                    char[] digits = numbersOnly.toCharArray();                    
                    for (char digit : digits) {
                        // convert char to int                       
                        number = Character.getNumericValue(digit);
                        measurements.add(number);                    
                    }                       
                }catch(Exception e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,e,"Alert", 
                               JOptionPane.WARNING_MESSAGE);
                  }                
            }
            reader.close();
        } catch (IOException e) {
            // handle the exception
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e,"Alert", 
                       JOptionPane.WARNING_MESSAGE);
            measurements.clear();
            measurements.get(-1);
        }
        /*Converts ArrayList to 2D array*/
        int[][] measurement = new int[measurements.size()/2][2];
        if (!measurements.isEmpty()){            
            int MeasurmentsCount=0;
            while(MeasurmentsCount<measurements.size()){
                for (int[] measurement1 : measurement) {
                    for (int j = 0; j<2; j++) {
                        measurement1[j] = measurements.get(MeasurmentsCount);                        
                        MeasurmentsCount++;
                    }
                }
            }
        }         
    return measurement;
     }
}

