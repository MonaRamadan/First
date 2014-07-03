/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first;


public class Calc {
    
    public int Sum(int x,int y){
           return x+y ;
    } 
     public int Min(int x,int y){
           return x-y ;
    } 
      public int Mul(int x,int y){
           return x*y ;
    } 
       public int Div(int x,int y){
           if(y==0)
           return 0;
           else
           return x/y  ;
    } 
    public void Dec(int value){
        while(value>=1)
        {   
           System.out.println(value);
           value--;
        }
        
    }
    
    public int []  MulArr (int[]a , int[]b)
    { 
        if(a.length != b.length)
            return null;
        int [] result =new int[a.length];   
        for(int i = 0 ; i<a.length;i++)
            result[i]= a[i] * b[i];
        return result;
    }
    
}
