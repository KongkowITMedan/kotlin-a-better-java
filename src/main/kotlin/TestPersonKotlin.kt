fun main(args: Array<String>) {
    val jvPerson = JavaPerson("Budi", 25)
    val ktPerson = KotlinPerson(name = "Budi", age = 25)

    println("Java Person")
    println("Name: ${jvPerson.name}")
    println("Gender: ${jvPerson.gender}")
    println("Age: ${jvPerson.age}")
    println("Java Person: $jvPerson")

    println("Kotlin Person")
    println("Name: ${ktPerson.name}")
    println("Gender: ${ktPerson.gender}")
    println("Age: ${ktPerson.age}")
    println("Kotlin Person: $ktPerson")
}
