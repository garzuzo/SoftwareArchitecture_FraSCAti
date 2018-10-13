/**
 * Author: Author: Sandra Nino, Johnatan Garzon  
 *
 */
package co.edu.icesi.frascati.sorting.annotated;

import org.osoa.sca.annotations.Property;

/**
 * The shell sort implementation.
 */
public class ShellSortServer
  implements IDistSort
{
   

   

    public ShellSortServer(){
        System.out.println("Shellsort Server created.");
    }
    

public String[] sort(String[] arr){

long start=System.currentTimeMillis();
 int n = arr.length; 
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
           
            for (int i = gap; i < n; i += 1) 
            { 
                
                String temp = arr[i]; 
  
              
                int j; 
                for (j = i; j >= gap && arr[j - gap].compareTo(temp)>0; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
               
                arr[j] = temp; 
            } 
        } 
       long end=System.currentTimeMillis();
System.out.println(end-start);

return arr;
}
}
