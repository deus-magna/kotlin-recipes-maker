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
        "2" -> showMoreRecipes()
        "3" -> println("Programa terminado")
        else -> println("Opción no valida")
    }
}

fun makeRecipe(){
    println("Hacer receta")
}

fun showMoreRecipes(){
    println("Ver más recetas")
}
