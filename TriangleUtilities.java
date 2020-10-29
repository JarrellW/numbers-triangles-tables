 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String pattern = "";
        for (int i = 1; i <= numberOfStars; i++) {
            pattern += "*";
        }
        return pattern;
    }
    
    public static String getTriangle(int numberOfRows) {
        String resolved = "";
        for (int i = 1; i <= numberOfRows; i++){
            resolved += getRow(i) + "\n";
        }
        return resolved;
    }


    public static String getSmallTriangle() {
        StringBuilder gt = new StringBuilder ();
        for(int i = 0; i < 4; i++) {
            gt.append("*");
            for(int b = 1; b <= i; b++){
            gt.append("*");
            }
            gt.append("\n");
        }
    return gt.toString();
   }
  


    
    
    public static String getLargeTriangle() {
        StringBuilder gl = new StringBuilder ();
        for(int i = 0; i < 9; i++) {
            gl.append("*");
            for(int j = 1; j <= i; j++){
            gl.append("*");
            }
            gl.append("\n");
         }
         return gl.toString();
        }
  }
