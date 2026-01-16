# Graph Algorithms: BFS & DFS Explorer


Este proyecto es una herramienta interactiva de consola desarrollada en Java para la gestión y exploración de grafos. Permite cargar estructuras de datos desde archivos externos y visualizar el funcionamiento de los algoritmos de búsqueda en amplitud (BFS) y profundidad (DFS).

## Funcionalidades Principales
* Carga Flexible de Datos: Soporta grafos dirigidos y no dirigidos.

* Explorador de Archivos: Escanea automáticamente la carpeta src/ed/u3/txt/ en busca de archivos .txt.

* Algoritmos de Recorrido:

  * BFS (Breadth-First Search): Ideal para encontrar la ruta más corta en grafos sin pesos.

  * DFS (Depth-First Search): Útil para detección de ciclos y topología.

* Interfaz Robusta: Sistema de validación que evita errores si el usuario ingresa texto en lugar de números.

* Estética en Consola: Uso de colores ANSI para diferenciar alertas, éxitos y menús.

## Estrutura del Proyecto
* src/ed/u3/

*  Algoritmos/
    * BFS.java      
    * DFS.java       
* txt/               
* Main.java         
* Grafo.java        
* CargarGrafo.java   
* Utils.java    

## Requisitos e Instalación

1. Java JDK 17 o superior.

2. Clonar el repositorio:

3. Coloca tus archivos de grafos en src/ed/u3/txt/.

## Guía de Uso

1. Preparar el Dataset
El programa lee archivos .txt. Asegúrate de que tu archivo represente el grafo correctamente (ej. matriz de adyacencia).

2. Ejecutar el Programa
Al iniciar, verás un menú como este:

    * DataSet No Dirigido: Carga rápida del ejemplo predeterminado.

    * DataSet Dirigido: Carga rápida del ejemplo dirigido.

    * Buscar datasets: Escanea la carpeta para que elijas cualquier archivo .txt.

3. Ejecutar Recorridos
Una vez cargado el grafo, ingresa el nodo de origen. El sistema mostrará:

* El orden de visita usando BFS.

* El orden de visita usando DFS.
