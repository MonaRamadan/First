/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first;

/**
 *
 * @author Mostafa1928
 */
public class First {
    
    
    public static void main(String[] args) {
              Calc Mona =new Calc();
              int [] one = {1,2,3,4} ;
              int [] two = {1,2,3,4,5};
               
              int [] r = Mona.MulArr(one,two);
              if(r!=null)
              {
              for(int i = 0 ; i < r.length;i++)
                  System.out.println(r[i]);
        }
              else System.out.println("R is unll");
    }
       
}
    

