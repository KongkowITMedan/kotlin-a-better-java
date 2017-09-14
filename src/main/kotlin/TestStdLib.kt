fun List<KotlinPerson>.averageAge(): Double = this.map { it.age }.average()

fun main(args: Array<String>) {
    val people = listOf(KotlinPerson(name = "Budi", age = 25),
            KotlinPerson(name = "Susi", gender = "Wanita", age = 25),
            KotlinPerson(name = "Tuti", gender = "Wanita", age = 20),
            KotlinPerson(name = "Ali", gender = "Pria", age = 30),
            KotlinPerson(name = "Rudi", gender = "Pria", age = 27))

    // print all person name and age
    people.forEach { println("Name: ${it.name}, age: ${it.age} years old") }
    // all people sorted by age (ascending)
    people.sortedBy { it.age }
    // all Pria
    people.filter { it.gender == "Pria" }
    // first wanita
    people.first { it.gender == "Wanita"}
    // oldest wanita
    people.filter {it.gender == "Wanita" }.maxBy { it.age }
    // group people by age
    people.groupBy { it.age }.maxBy { it.value.count() }
    // age 10 years from now
    people.map { it.copy(age = it.age + 10) }
    // partition people with age below and equal or above 25
    people.partition { it.age <= 25}
    // each gender count
    people.groupingBy { it.gender }.eachCount()
    // all people where age below average age
    people.filter { val averageAge = people.averageAge(); it.age <= averageAge }
}