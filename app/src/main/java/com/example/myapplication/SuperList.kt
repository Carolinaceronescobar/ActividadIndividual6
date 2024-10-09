package com.example.myapplication

data class Superhero(
    val superlist: String,
    val publisher: String,
    val realName: String,
    var photo: String
) {
    init {
        require(superlist.isNotEmpty()) { "Error: El nombre de la lista no puede estar vacío." }
        require(publisher.isNotEmpty()) { "Error: El editor no puede estar vacío." }
        require(realName.isNotEmpty()) { "Error: El nombre real no puede estar vacío." }
        require(photo.isNotEmpty()) { "Error: La foto no puede estar vacía." }
    }
}

fun agregarSuperlista() {
    val listaSuper = mutableListOf<Superhero>()

    try {
        listaSuper.add(Super("Israel", "Quilpue", "Isma", "isra.jpg"))
        listaSuper.add(Super("Carlos", "Viña del Mar", "Carlitos", "carl.jpg"))
        listaSuper.add(Super("Amanda", "Villa Alemana", "Amandis", "superwoman.jpg"))
        listaSuper.add(Super("Gabriela", "Quillota", "Gaby Gaby", "gaby.jpg"))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    for (superlist in listaSuper) {
        println("Super: ${superlist.superlist}, Publicado por: ${superlist.publisher}, Nombre real: ${superlist.realName}, Foto: ${superlist.photo}")
    }
}

fun Super(s: String, s1: String, s2: String, s3: String): Superhero {

    return TODO("Provide the return value")
}


fun main() {
    agregarSuperlista()
}