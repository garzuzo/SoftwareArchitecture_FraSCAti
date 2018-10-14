============================================================================
Sorting: BubbleSort y ShellSort

Authors: Sandra Nino y Johnatan Garzón 
============================================================================

CLIENT-SERVER-SORT
---------------------------

Compilation and execution with the FraSCAti script:
---------------------------------------------------
  1) Se debe escoger el algoritmo que se desea probar:
      1.1) Si se escoge el algoritmo BubbleSort, debe abrirse la consola y 
           y ubicarse en la carpeta de BubbleSortServer. 
           Luego ejecutar los siguientes comandos para levantar este servidor:
           frascati compile src bubble
           frascati run bubblesort-server -libpath bubble.jar
      1.2) Si se escoge el algoritmo ShellSort, debe abrirse la consola y 
           y ubicarse en la carpeta de ShellSortServer. 
           Luego ejecutar los siguientes comandos para levantar este servidor:
           frascati compile src shell
           frascati run shellsort-server -libpath shell.jar
  2) Ahora se debe levantar el cliente. 
      2.1) Según el servidor a usar se debe cambiar en el .composite del Client (ubicado en
           resources), el serviceName en el reference. Si se escogió BubbleSort se debe 
           escribir: serviceName= "bubblesortService". De lo contrario, si se escogió 
           ShellSort se debe escribir: serviceName= "shellsortService". 
      2.2) Ahora se debe abrir la consola y ubicarse en la carpeta Client, luego ejecutar 
           los siguientes comandos:
           frascati compile src client
           frascati run sorting-client -libpath client.jar -s r -m run

NOTAS:
1. Si ya se ha ejecutado el Client, observará que se han creado 3 txt: "tiempo.txt", "respuesta.txt" y "n.txt" (siendo n el tamaño del arreglo). Entonces, si se desea ejecutar nuevamente el cliente hay que eliminar el "tiempo.txt" y la "respuesta.txt". 
	1.1 Si se desea probar un arreglo con un nuevo tamaño y valores aleatorios nuevos: 
	 - Si alguno de   los archivos .txt contiene el tamaño a probar, también se debe eliminar. 
 	 - Si el tamaño del arreglo a probar es muy grande, se aconseja comentar en la implementación del cliente "ClientImpl" en el metodo run, la parte que escribe el archivo de la respuesta. 
	1.2. Si se desea probar un arreglo ya generado: 
 	 - Se debe comentar en la implementacion del cliente "ClientImpl" en el metodo run, el metodo que se invoca llamado writer(int n). Además se debe asegurar que el n sea acorde a un "n.txt". 
2. En la carpeta Client, hay una carpeta llamada "cadenas" con los arreglos que se generaron para las pruebas del análisis de escalabilidad. 


