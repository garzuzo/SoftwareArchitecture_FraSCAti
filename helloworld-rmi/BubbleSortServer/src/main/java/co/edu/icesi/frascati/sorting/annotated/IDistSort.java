/**
 *
 * Author: Sandra Nino, Johnatan Garzon 
 */
package co.edu.icesi.frascati.sorting.annotated;

import org.osoa.sca.annotations.Service;

@Service
public interface IDistSort{
   public String[] sort(String[] cadena);
}
