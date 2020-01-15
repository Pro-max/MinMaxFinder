/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minnmaxfinder;

/**
 *
 * @author Student
 */
public class MinNMaxFinder {
    
    public static int getMax(int  []a)
    {
        int max = a[0];
        for (int  i = 0;i<a.length ; i++)
        {
            if (a[i] > max)
                max = a[i];
            
        
        }
        return max;
    
    
    }
    
 
    
    public static int getMin(int  []a)
    {
        int min = a[0];
        for (int i = 0 ;i<a.length ; i++)
        {
            if (a[i] < min)
                min = a[i];
            
        
        }
        return min;
    
    
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        int [] marks = new int[] {68,97,45,79,24,85,95};
        
        
        System.out.println("max vale is :" + getMax(marks));
        System.out.println("min vale is :" + getMin(marks));
        
    }
    
}
