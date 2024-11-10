public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;

    // Constructor, getters, and setters
    public Student(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Other methods, like displayInfo()
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}
