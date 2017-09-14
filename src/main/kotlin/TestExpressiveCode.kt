infix fun KotlinPerson.sayHello(other: KotlinPerson) =
        println("${this.name}: Hello, ${other.name}")

fun main(args: Array<String>) {
    val people = listOf(KotlinPerson(name = "Budi", age = 25),
                        KotlinPerson(name = "Susi", gender = "Wanita", age = 25),
                        KotlinPerson(name = "Tuti", gender = "Wanita", age = 20),
                        KotlinPerson(name = "Ali", gender = "Pria", age = 30),
                        KotlinPerson(name = "Rudi", gender = "Pria", age = 27))

    // destructuring
    for ((name, gender, age) in people) {
        val genderString = if (gender == "Wanita") "Woman" else "Man"
        println("$name is $age years old $genderString")
    }

    val budi = people[0]
    val susi = people[1]

    budi.sayHello(susi)
    susi sayHello budi
}