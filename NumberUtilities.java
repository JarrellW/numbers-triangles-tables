


public class NumberUtilities {

    public static String getRange(int stop) {
        String outcome1 = "";
        for (int i = 0; i < stop; i++){ 
            outcome1 += i;
         
        }
        
        return outcome1;
    }

    public static String getRange(int start, int stop) {
         String outcome2 = "";
        for(int i = start; i < stop; i++) {
            outcome2 += i;
        
        }
        
        return outcome2;
    }
                                        

    public static String getRange(int start, int stop, int step) {
        String outcome3 = "";
        for (int i = start; i < stop; i+=step) {
            outcome3 += i;
        }
        
        return outcome3;
    }

    public static String getEvenNumbers(int start, int stop) {
           if(start % 2 == 1) {
            start++;
        }        
        return getRange(start, stop, 2);

    }


    public static String getOddNumbers(int start, int stop) {
                if(start % 2 == 0) {
            start++;
        }        
        return getRange(start, stop, 2);

    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome4 = "";
        for(int i = start; i < stop + 1; i++) {
            int intresult = (int) Math.pow(i,exponent);
            outcome4 += intresult;
    }
    return outcome4;
  }
}
