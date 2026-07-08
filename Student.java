public class Student {

    private int id;
    private String rollNo;
    private String name;
    private int age;
    private String gender;
    private String course;
    private String phone;
    private String email;
    private String address;

    public Student(String rollNo, String name, int age, String gender,
                   String course, String phone, String email, String address) {

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
