/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServiceReferenceClassGenerator
 * on: Thu Oct 11 20:11:07 COT 2018
 */

package co.edu.icesi.frascati.sorting.annotated;


public class IDistSortFcSR
extends org.ow2.frascati.tinfi.oasis.ServiceReferenceImpl<co.edu.icesi.frascati.sorting.annotated.IDistSort>
implements co.edu.icesi.frascati.sorting.annotated.IDistSort {

  public IDistSortFcSR(Class<co.edu.icesi.frascati.sorting.annotated.IDistSort> businessInterface,co.edu.icesi.frascati.sorting.annotated.IDistSort service)  {
    super(businessInterface,service);
  }

  public co.edu.icesi.frascati.sorting.annotated.IDistSort getService()  {
    return this;
  }

  public java.lang.String[] sort(final java.lang.String[] arg0)  {
    java.lang.String[] ret = service.sort(arg0);
    return ret;
  }

}
