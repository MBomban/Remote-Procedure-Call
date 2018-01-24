/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.io.Serializable;

/**
 *
 * @author mikey
 */

public class Matrix implements Serializable{

    public Object matrix = null;
    
    public Matrix (Object matrix){
        this.matrix=matrix;
    }

    public Matrix() {
        
       this.matrix=null;
    }
    
    public Object getMatrix(){
        return matrix;
    }
    
}