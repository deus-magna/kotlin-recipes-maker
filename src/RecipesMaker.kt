fun main(args: Array<String> ) {

    do {
        println(buildMenu())
        val selectedOption:String = readLine() ?: "0"
        buildSelectedOptionMenu(selectedOption)

    } while (selectedOption.equals("3").not())
}

fun buildMenu():String {
    return ".:: Bienvenido a Recipe Maker ::.\n\n" +
    """Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""".trimIndent()
}

fun buildSelectedOptionMenu(selectedOption:String){
    when(selectedOption){
        "1" -> makeRecipe()
        "2" -> viewRecipe()
        "3" -> println("Programa terminado")
        else -> println("Opción no valida")
    }
}

fun makeRecipe(){
    val menu = """Hacer receta
    Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites""".trimIndent()
    println(menu)

    val selectedOption:String = readLine() ?: "0"
    println("Opción seleccionada $selectedOption")
}

fun viewRecipe(){
    println("Ver mis recetas")
}
