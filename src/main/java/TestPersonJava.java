public class TestPersonJava {
    public static void main(String []args) {
        JavaPerson jvPerson = new JavaPerson("Budi", 25);
        KotlinPerson ktPerson = new KotlinPerson("Budi", 25);

        System.out.println("Java Person");
        System.out.println("Name: " + jvPerson.getName());
        System.out.println("Gender: " + jvPerson.getGender());
        System.out.println("Age: " + jvPerson.getAge());
        System.out.println("Java Person: " + jvPerson.toString());

        System.out.println("Kotlin Person");
        System.out.println("Name: " + ktPerson.getName());
        System.out.println("Gender: " + ktPerson.getGender());
        System.out.println("Age: " + ktPerson.getAge());
        System.out.println("Kotlin Person: " + ktPerson.toString());
    }
}
