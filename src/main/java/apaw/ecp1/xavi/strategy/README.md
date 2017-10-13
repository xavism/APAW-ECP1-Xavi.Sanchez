# Patrón Strategy

El patrón Strategy es un patrón de diseño usado como patrón de comportamiento. Con este patrón se pueden decidir diferentes comportamientos para resolver una misma tarea.
Con este patrón el objeto cliente puede elegir el comportamiento que mas le convenga e intercambiarlo dinámicamente según sus necesidades.

## Explicación del Ejemplo
En este caso seguiré usando la entidad dada en la retroalimentación, se buscan dos comportamientos:
* Obtener el Nombre de un cliente y su dirección separada por un espacio
* Obtener el Nombre de un cliente y su dirección separada por un guión bajo

### Clases usadas
* Context --> Crea el contexto donde estará el método a ejecutar, en nuestro caso: writeNameAndAddress() 
* WriteStrategy --> Interfaz que declara la función interna
* Space --> Implementación del método de la interfaz usando el espacio
* LowDash --> Implementación del método de la interfaz usando el guión bajo

Para cambiar de estrategia, solo se debe hacer un setStrategy del contexto, pasando una nueva estrategia que debe ser una implementación de WriteStrategy. 
