/**
 * Author: Sandra Nino, Johnatan Garzon 
 *
 */
package co.edu.icesi.frascati.sorting.annotated;

import java.io.*;
//import java.util.*;
/**
 * The print service implementation.
 */
public class BubbleSortServer implements IDistSort
{
    public BubbleSortServer ()
    {
        System.out.println("BUBBLESORTSERVER created.");
    }

    /**
     * BubbleSort implementation.
     */
   public String[] sort(String[] cadena)
    {
       //long start= System.nanoTime(); 
       int n = cadena.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (cadena[j].compareTo(cadena[j+1]) > 0) 
                { 
                    String temp = cadena[j]; 
                    cadena[j] = cadena[j+1]; 
                    cadena[j+1] = temp; 
                } 
	//long end= System.nanoTime(); 
	//System.out.println(end-start); 
	return cadena;
    }

}
