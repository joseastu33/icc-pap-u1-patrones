## Ingeniería en Ciencias de la Computación 
### Materia:  Programación Aplicada
### Estudiante: José Andrés Astudillo Pacheco
### PC. 1.4: Patrones Creacionales II

**¿Cuales fueron los dos patrones seleccionados?**

Los patrones implementados fueron Singleton y Factory Method. Aunque en un primer acercamiento con el ejercicio se tuvo la idea de un patrón Singleton y Prototype, se llegó a la conclusión de que, si bien Prototype podría ser útil para crear nuevos pedidos a partir de un pedido existente que tenga ya datos configurados o a partir de un pedido abstracto, el requisito principal del problema es crear dos objetos con comportamientos de procesamiento distintos.

Esto permite implementar el Factory Method para delegar la creación a creadores concretos y seleccionar el tipo de pedido necesario segun el caso. Prototype hubiese sido útil al tener la intención de duplicar pedidos existentes (por ejemplo para generar un nuevo pedido basado en uno anterior) conservando ciertos datos y modificando otros. Esta es una alternativa de diseño que ha sido descartada.

**¿Por qué el patrón Singleton?**

En la explicación del problema se menciona explícitamente que los pedidos (tanto presenciales como en línea) usen una configuración común del impuesto aplicado. Ambas modalidades necesitan el dato compartido (el impuesto) y lo calculan consultando a Configuracion.java. Dicha configuración permite que ambas modalidades accedan al mismo objeto de configuración en lugar de tener configuraciones independientes

**¿Por qué responden a los requisitos planteados**
Debido a que cada patrón resuelve una necesidad concreta del problema. No es suficiente con uno solo en este caso.
Singleton responde a compartir una configuración común, en este caso se mantiene una unica instancia que proporciona el porcentaje de impuesto usado por ambos pedidos. Mientras que el Factory Method responde al requisito de crear dos modalidades de un pedido cada uno con comportamiento diferente

**Ejecución en consola**