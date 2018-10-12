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
    
    int n=100;
    writer(n);
    File file = new File("./"+n+".txt");
    if(file.exists()) {
    	try {
    		FileReader fr =new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String[] arr= br.readLine().split(" ");
            
            long start= System.nanoTime(); 
            String[] ret= s.sort(arr);
            long end= System.nanoTime(); 
            long totalTime=end-start;
        	System.out.println(totalTime); 
        	
            fr.close();
            br.close();
            
            //se escribe en el archivo la respuesta
            FileWriter fw = new FileWriter(new File("./Respuesta.txt"));
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
            FileWriter fw2 = new FileWriter(new File("./Tiempo.txt"));
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter wr2 = new PrintWriter(bw2);  
           
            wr2.write(totalTime + "");
          
            wr2.close();
            bw2.close();
            
           
    	}catch(Exception e) {
    		System.out.println("No se completo el procedimiento.");
    	}
    	
    }

    
  }
  
  public void writer(int n){

	  BufferedWriter out;
	try {
		out = new BufferedWriter(new FileWriter("./"+n+".txt"));

		  for(int i=0;i<n;i++){
		  //rango 1-10
		  int r1=(int) (Math.random()*30)+1;

		  String cadAct="";
		  for(;r1>=0;r1--){
		  //rango de letras
		  char cAct=(char) ((int)(Math.random()*(122-97))+97);
		  cadAct+=cAct+"";

		  }

		  if(i+1!=n)
		  out.write(cadAct+" ");
		  else
		  out.write(cadAct);
		  }
		  out.close();
		 
	  
	} catch (IOException e) {
		System.out.println("No se crearon las palabras");
	}
  }
}
