/**
 *  Author: Sandra Nino, Johnatan Garzon    
 *
 */
package co.edu.icesi.frascati.sorting.annotated;

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
String[] arr={"z","ab","c","d"};
   String[] ret= s.sort(arr);
  }
}
