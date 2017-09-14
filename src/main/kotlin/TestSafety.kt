fun prettyPrint(person: KotlinPerson?) {
    person?.let {
        println("Name: ${it.name}")
        println("Gender: ${it.gender}")
        println("Age: ${it.age}")
    } ?: println("No person found!")
}

fun main(args: Array<String>) {
    val budi = KotlinPerson("Budi", "Pria", 25)

    // cannot change name, because it is declared as val
    // budi.name = "Rudi"
    // can change age, because it is declared as var
    budi.age = 27

    prettyPrint(budi)
    prettyPrint(null)
}