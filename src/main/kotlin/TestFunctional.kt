fun displayPeople(people: List<KotlinPerson>,
                  label: String = "",
                  filter: (KotlinPerson) -> Boolean) {
    println(if (label == "") "Kotlin Person" else label)
    for (person in people) {
        if (filter(person)) {
            println(person)
        }
    }
}

fun main(args: Array<String>) {
    val people = listOf(KotlinPerson(name = "Budi", age = 25),
            KotlinPerson(name = "Susi", gender = "Wanita", age = 25),
            KotlinPerson(name = "Tuti", gender = "Wanita", age = 20),
            KotlinPerson(name = "Ali", gender = "Pria", age = 30),
            KotlinPerson(name = "Rudi", gender = "Pria", age = 27))

    displayPeople(people, "All Pria", {p -> p.gender == "Pria"})

    displayPeople(people, "Equal or above 25 years old") {
        it -> it.age >= 25
    }

    displayPeople(people, "All Wanita above 20 years old") {
        it.gender == "Wanita" && it.age > 20
    }
}