/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumpairrs;

/**
 *
 * @author hp
 */
public class Sumpairrs {

    /**
     * @param args the command line arguments
     */
    public static int sum(int a[]){
        int i,j;
        int sum=2;
       /* for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }*/
        for(i=0;i<a.length;i++){
           // int first= a[i];
            for(j=i+1;j<a.length;j++){
               // int second= a[j];
               
              if(sum==(a[i]+a[j])){
                System.out.println(a[i]+" "+a[j]);  
              }  
              
            
            }
        }
  return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        sum(a);
    }
    
}
