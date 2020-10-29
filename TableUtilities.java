 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String number = "";
         for(int i = 1; i <= 5; i++) {
             for(int j = 1; j <= 5; j++) {
                number += number.format("%3d |",i *j);
                }
                number += "\n";
        }
        return number;
        
    }

    public static String getLargeMultiplicationTable() {
                String number = "";
         for(int i = 1; i <= 10; i++) {
             for(int j = 1; j <= 10; j++) {
                number += number.format("%3d |",i *j);
                }
                number += "\n";
        }
        return number;
        
    }

    public static String getMultiplicationTable(int tableSize) {
        String number = "";
        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                number += number.format("%3d |",i *j);
                
        }
        
        number += "\n";
        }
        return number;
    }
}
