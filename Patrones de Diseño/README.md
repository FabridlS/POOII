Requerimiento 1 (Motor de Renderizado)

¿Qué patron de diseño creacional se eligió?
El patron de diseño creacional elegido fue el Factory Method

¿Por qué este patrón es la solución adecuada para este problema?
Es la solución adecuada porque el problema requiere desacoplar al código cliente (ej. el módulo de Finanzas) de la creación de objetos concretos (como RenderizadorPDF o RenderizadorExcel). El cliente no debe saber cómo se crea un renderizador, solo debe poder pedir uno basado en un tipo (ej. "PDF"). La Factory encapsula esta lógica de selección e instanciación

¿Qué problema(s) evita (ej. acoplamiento, violación del principio Abierto/Cerrado)?
El cliente solo se acopla a la interfaz RenderizadorReporte y a la RenderizadorFactory. Si no usáramos este patrón, el cliente tendría que tener un switch o if-else gigante y hacer new RenderizadorPDF(), new RenderizadorExcel(), etc., acoplándose directamente a todas las clases concretas.
Además de ser "abierto a la extensión" porque para agregar un nuevo formato (ej. ReporteXML), solo necesitamos crear la clase RenderizadorXML y añadir un caso en la Factory. Es "cerrado a la modificación" porque el código cliente que pide los renderizadores no necesita modificarse en absoluto.

Requerimiento 2 (Construcción de Reportes)

¿Qué patrón de diseño creacional eligieron? 
El patrón elegido es Builder.

¿Por qué este patrón es la solución adecuada? 
Porque el objeto Reporte es una "entidad compleja" que tiene una combinación de datos obligatorios (título, cuerpo) y múltiples datos opcionales (encabezado, pieDePagina, fecha, etc.). El patrón Builder nos permite construir este objeto paso a paso de una manera limpia y legible.

¿Qué problemas específicos del "constructor" resuelve? 
Resuelve el "Constructor Telescópico": Evita tener que crear múltiples constructores (Reporte(titulo, cuerpo), Reporte(titulo, cuerpo, autor), Reporte(titulo, cuerpo, autor, fecha), etc.) para cubrir todas las combinaciones de parámetros opcionales.
Evita el Constructor con Parámetros null: Impide que el cliente tenga que usar un único constructor gigante y pasar null para los valores opcionales que no necesita (ej. new Reporte("Título", "Cuerpo", null, "Pie", null, null, null)), lo cual es ilegible y propenso a errores.

Requerimiento 3 (Gestor de Configuración)

¿Qué patrón de diseño creacional eligieron? 
El patrón elegido es Singleton.

¿Por qué este patrón es la solución adecuada para este requerimiento? 
Es la solución idónea porque el requerimiento es la definición exacta del patrón:
Se necesita garantizar que exista "una y solo una instancia" del GestorConfiguracion en toda la aplicación.
Se debe proveer un "único punto de acceso" global a esa instancia.
Esto es fundamental para evitar inconsistencias de datos o ineficiencia.

¿Cómo garantizaron la unicidad de la instancia?
Haciendo el constructor private: Esto impide que cualquier otra clase pueda crear una instancia del GestorConfiguracion usando la palabra clave new.
Proveyendo un método public static getInstance(): Este método es el único punto de acceso. Internamente, este método gestiona una variable estática privada que contiene la única instancia, creándola si no existe (Lazy o Eager) y devolviéndola siempre.

Integrantes del grupo:

- de los Santos Fabrizzio
- Da Rosa Jesica 
- Grabovieski Matias
- Mendez Camila 