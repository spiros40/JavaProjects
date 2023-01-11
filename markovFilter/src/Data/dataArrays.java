
package Data;

public class dataArrays {
 
    public static double [][] probabilisticTransitions() {
        double[][] probabilisticTransitionsArray = new double[][]{
            /*
            	Επόμενο δωμάτιο
		Σαλόνι	Κουζίνα	Δωμάτιο1 Δωμάτιο2 Μπαλκόνι
 	Σαλόνι	
	Κουζίνα		
	Δωμάτιο1	
	Δωμάτιο2	
	Μπαλκόνι	
            */
            {0.2, 0.6, 0.2, 0,   0  }, 
            {0,   0.1, 0.8, 0.1, 0  }, 
            {0,   0,   0.1, 0.7, 0.2}, 
            {0,   0,   0.1, 0.1, 0.8}, 
            {0,   0,   0.2, 0.7, 0.1}};
        return probabilisticTransitionsArray;
    }
    public static double [][] noiseProbabilities() {
        double[][] noiseProbabilitiesArray = new double[][]{
            /*row 1 = middle room
            row 2 = edge room*/
            {0.25, 0.5, 0.25}, 
            {0.5,  0.5, 0   }};
        return noiseProbabilitiesArray;
    }
}
       

