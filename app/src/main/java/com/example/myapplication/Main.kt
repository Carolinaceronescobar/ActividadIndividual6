package com.example.myapplication

fun main() {
    val listas = crearLista()
    mostrarListas(listas)
}

fun crearLista(): List<Superlistas> {
    val listaNombres = mutableListOf<Superlistas>()

    while (true) {
        println("Ingrese el nombre de la lista")
        val nombre = readln() ?: ""

        println("Ingrese la ciudad donde vive")
        val ciudad = readln() ?: ""

        println("Ingrese el apodo")
        val apodo = readln() ?: ""

        println("Ingrese la URL de la fotografía de la lista")
        val foto = readln() ?: ""

        // Se crea una nueva instancia de Superlistas con los datos ingresados
        val nuevaLista = Superlistas(nombre, ciudad, apodo, foto)

        // Se agrega la nueva lista a la lista de nombres
        listaNombres.add(nuevaLista)

        println("¿Desea ingresar otro nombre? (si/no)")
        val continuar = readln() ?: "no"
        if (continuar.lowercase() != "si") {
            break
        }
    }
    return listaNombres
}

fun mostrarListas(listas: List<Superlistas>) {
    if (listas.isEmpty()) {
        println("No existe ningún nombre así en la lista")
    } else {
        println("Lista de Nombres")
        listas.forEach { lista ->
            println(
                """
                Nombre de la lista: ${lista.nombre}
                Ciudad: ${lista.ciudad}
                Apodo: ${lista.apodo}
                Foto: ${lista.foto}
            """.trimIndent()
            )
        }
    }
}

// Definición de la clase Superlistas
data class Superlistas(
    val nombre: String,
    val ciudad: String,
    val apodo: String,
    val foto: String
)
