============================================================================
Sorting: BubbleSort y ShellSort

Authors: Sandra Nino y Johnatan Garzon 
============================================================================

HelloWorld RMI:
---------------

Compilation and execution with the FraSCAti script:
---------------------------------------------------
  1) Se debe escoger que algoritmo se desea probar:
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