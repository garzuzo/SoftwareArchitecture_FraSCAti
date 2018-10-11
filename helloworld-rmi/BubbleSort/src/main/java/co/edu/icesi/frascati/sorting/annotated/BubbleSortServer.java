/**
 * OW2 FraSCAti Examples: HelloWorld RMI
 * Copyright (C) 2009 INRIA, University of Lille 1
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Author: Damien Fournier
 *         
 * Contributor(s): Christophe Demarey
 *                 Nicolas Dolet
 *                 Philippe Merle
 *
 */
package co.edu.icesi.frascati.sorting.annotated;

import org.osoa.sca.annotations.Property;
import java.io.*;
import java.util.*;
/**
 * The print service implementation.
 */
public class BubbleSortServer implements PrintService
{
    public BubbleSortServer ()
    {
        System.out.println("BUBBLESORTSERVER created.");
    }

    /**
     * BubbleSort implementation.
     */
    public static String[] sort(String[] cadena)
    {
       long start= System.currentTimeMillis(); 
       int n = cadena.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (cadena[j].compareTo(cadena[j+1]) > 0) 
                { 
                    String temp = cadena[j]; 
                    cadena[j] = cadena[j+1]; 
                    cadena[j+1] = temp; 
                } 
	long end= System.currentTimeMillis(); 
	System.out.println(end-start); 
	return cadena;
    }

}
