public class Professors {
    private String name;
    private String surname;
    private String courseId;
    private int password;

    public Professors(String name, String surname, String courseId, int password) {
        this.name = name;
        this.surname = surname;
        this.courseId = courseId;
        this.password = password;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getPassword() {
        return password;
    }
}
