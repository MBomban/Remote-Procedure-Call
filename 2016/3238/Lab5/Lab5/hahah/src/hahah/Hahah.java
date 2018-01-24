/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hahah;

/**
 *
 * @author mikey
 */
public class Hahah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
         double[] [] a = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
          StringBuffer string1 = convert(a,3,3);
          
          
          System.out.println("character= " + string1.charAt(5));
    }
    
    
    public static StringBuffer convert(double[][] mat, int row, int col){
        //String stringResult = null;
       StringBuffer stringResult = new StringBuffer();
       
         
        stringResult.append(row);
        stringResult.append("\n");
        stringResult.append(col);
        stringResult.append("\n");
        
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                double temp = mat[i][j];
                stringResult.append(temp);
                stringResult.append("\n");
            }
        }
        return stringResult;
    }
}
