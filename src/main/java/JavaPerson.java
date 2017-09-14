public class JavaPerson {
    private String name;
    private String gender;
    private int age;

    public JavaPerson(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public JavaPerson(String name, int age) {
        this(name, "Pria", age);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaPerson that = (JavaPerson) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return gender != null ? gender.equals(that.gender) : that.gender == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "JavaPerson{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
