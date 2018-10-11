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
   // @Property
    //private String header = "->";

   

    public Server(){
        System.out.println("SERVER created.");
    }
    

String[] sort(String[] arr){

long start=System.currentTimeMillis();
 int n = arr.length; 
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
           
            for (int i = gap; i < n; i += 1) 
            { 
                
                int temp = arr[i]; 
  
              
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
               
                arr[j] = temp; 
            } 
        } 
       long end=System.currentTimeMillis();
System.out.println(start-end);

return arr;
}
