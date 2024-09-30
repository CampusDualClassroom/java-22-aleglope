package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Exercise22} proporciona métodos para crear, manipular y mostrar
 * una lista de elementos de tipo {@code String}.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y poblar una lista con elementos específicos.</li>
 *     <li>Añadir un nuevo elemento a la lista.</li>
 *     <li>Recorrer la lista y mostrar cada elemento junto con su índice.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class Exercise22 {

    /**
     * Crea y retorna una lista de tipo {@code ArrayList} poblada con los elementos especificados.
     * <p>
     * Los elementos añadidos son:
     * <ul>
     *     <li>"GKFFD"</li>
     *     <li>"TNANA"</li>
     *     <li>"MPMSL"</li>
     *     <li>"PSWME"</li>
     *     <li>"LZMLF"</li>
     *     <li>"JYEBV"</li>
     *     <li>"YELNT"</li>
     *     <li>"JSNKR"</li>
     *     <li>"JFESF"</li>
     *     <li>"TMJLL"</li>
     * </ul>
     * </p>
     *
     * @return Una lista {@code ArrayList} poblada con los elementos especificados.
     */
    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    /**
     * Añade un nuevo elemento a la lista especificada.
     * <p>
     * Este método intenta añadir el elemento proporcionado a la lista y retorna el resultado de la operación.
     * </p>
     *
     * @param customList La lista a la que se desea añadir el elemento.
     * @param element    El elemento que se desea añadir a la lista.
     * @return {@code true} si el elemento fue añadido exitosamente; {@code false} en caso contrario.
     */
    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    /**
     * Recorre la lista especificada y muestra por pantalla el valor de cada elemento junto con su índice.
     * <p>
     * Utiliza un bucle {@code for} con índice para recorrer la lista.
     * </p>
     *
     * @param customList La lista cuyos elementos se desean mostrar junto con sus índices.
     */
    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Índice " + i + ": " + customList.get(i));
        }
    }

    /**
     * Punto de entrada del programa que demuestra la creación, manipulación y visualización
     * de una lista de elementos de tipo {@code String}.
     * <p>
     * El flujo del programa es el siguiente:
     * <ol>
     *     <li>Crear y poblar una lista con los elementos especificados.</li>
     *     <li>Añadir el elemento "AAAAA" a la lista.</li>
     *     <li>Recorrer y mostrar cada elemento de la lista junto con su índice.</li>
     * </ol>
     * </p>
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear y poblar la lista
        List<String> arrayList = createArrayList();
        System.out.println("Lista original:");
        printElementsAndIndex(arrayList);
        System.out.println("===================");

        // Añadir "AAAAA" a la lista
        boolean added = addElementToList(arrayList, "AAAAA");
        System.out.println("Añadiendo 'AAAAA' a la lista: " + (added ? "Éxito" : "Falló"));
        System.out.println("===================");

        // Mostrar la lista después de añadir el nuevo elemento
        System.out.println("Lista después de añadir 'AAAAA':");
        printElementsAndIndex(arrayList);
    }
}
