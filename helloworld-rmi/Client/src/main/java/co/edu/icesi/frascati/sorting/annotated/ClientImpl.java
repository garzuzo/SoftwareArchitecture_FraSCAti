/**
 *  Author: Sandra Nino, Johnatan Garzon    
 *
 */
package co.edu.icesi.frascati.sorting.annotated;

import java.io.*;

import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Reference;

public class ClientImpl
  implements Runnable
{
  //--------------------------------------------------------------------------
  // SCA Reference
  // --------------------------------------------------------------------------
  @Reference(name="sort")   
  private IDistSort s;


  public final void setDistSort(IDistSort service)
  {
    this.s = service;
  }

  //--------------------------------------------------------------------------
  // Default constructor
  // --------------------------------------------------------------------------

  public ClientImpl()
  {
    System.out.println("CLIENT created");
  }

  @Init
  public final void init()
  {
    System.out.println("CLIENT initialized");
  }

  //--------------------------------------------------------------------------
  // Implementation of the Runnable interface
  // --------------------------------------------------------------------------

  public final void run() 
  {
    System.out.println("Call the service...");
    //se lee el archivo y se pasa el string
    File file = new File("C:/Users/sami_/Desktop/SAMI/SEPTIMO SEMESTRE/ArquitecturaSoftware/SoftwareArchitecture_FraSCAti/helloworld-rmi/StringsFile.txt");
    if(file.exists()) {
    	try {
    		FileReader fr =new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String[] arr= br.readLine().split(" ");
            
            long start= System.nanoTime(); 
            String[] ret= s.sort(arr);
            //String[] ret= {"hola"};
            long end= System.nanoTime(); 
        	System.out.println(end-start); 
        	
            fr.close();
            br.close();
            
            //se escribe en el archivo la respuesta
            FileWriter fw = new FileWriter(new File("C:/Users/sami_/Desktop/SAMI/SEPTIMO SEMESTRE/ArquitecturaSoftware/SoftwareArchitecture_FraSCAti/helloworld-rmi/Respuesta.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter wr = new PrintWriter(bw);  
            
            String m="";
            for(int i=0; i< ret.length; i++) {
            	m += ret[i] + " ";
            }
            wr.write(m);
          
            wr.close();
            bw.close();

            //se escribe en otro archivo el tiempo 
            FileWriter fw2 = new FileWriter(new File("C:/Users/sami_/Desktop/SAMI/SEPTIMO SEMESTRE/ArquitecturaSoftware/SoftwareArchitecture_FraSCAti/helloworld-rmi/Tiempo.txt"));
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter wr2 = new PrintWriter(bw2);  
           
            wr2.write(end-start + "");
          
            wr2.close();
            bw2.close();
            
           
    	}catch(Exception e) {
    		System.out.println("No se completó el procedimiento.");
    	}
    	
    }
   // String[] arr={"z","ab","c","d"};
    
  }
}
