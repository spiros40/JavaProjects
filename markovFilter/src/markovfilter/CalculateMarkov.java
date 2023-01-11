
package markovfilter;

import Data.dataArrays;
import UI.MarkovUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import readFile.readTXTFile;


public class CalculateMarkov {
    
    public double [][] Calculate(){   
        //reads the position array
        readTXTFile measurement= new readTXTFile();
        int[][] measures = null ;
        double[][] multiplyArrayResult=null;
        //Gets the file path
        File file = new File(System.getProperty("user.home"), 
                   "/Desktop/programming_projects/school/markovFilter/src/Data/measurements.txt");   
        //If the file exists continue the process otherwise throws an error alert message
             if (file.exists()) {                
                try {
                    //Gets the measurments array from txt file
                     //measures=measurement.readTheFile(file.toString());
                     //Gets possible transitions array
                     //double[][] PTArray = dataArrays.probabilisticTransitions();
                     
                     /*At the beginning gets the measurments array from txt file and 
                     the arrays from data class probabilistic Transitions and noise Probabilities.
                     and next Calls multiple method (multiplyArray) */                     
                     multiplyArrayResult=multiplyArray(readTXTFile.readTheFile(file.toString()), 
                                dataArrays.probabilisticTransitions(),dataArrays.noiseProbabilities());
                }catch (FileNotFoundException ex) {
                    Logger.getLogger(MarkovUI.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"Something went wrong!",
                            "Alert", JOptionPane.WARNING_MESSAGE);
                }
                }else{                 
                 JOptionPane.showMessageDialog(null,"The File Does Not Exist!",
                            "Alert", JOptionPane.WARNING_MESSAGE);
                }
        return multiplyArrayResult;
    }
    
    public double[][] multiplyArray(int[][]a, double[][] b,double[][] c) {
        System.out.println(b[0][1]+"***"+ a[2][1]+"--"+c[0][0]);
        return b;
    }
    
    
    
}

