public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3", "engindemirog@gmail.com", "123", "Yazılım geliştirmeye lisede 'yazılım' bölümünde okurken başladım.");
        Student student = new Student(1, "Latif", "Yılmaz", "https://s.gravatar.com/avatar/97eb35acf846157969d3428ec9db28aa?d=mm", "blahblah@gmail.com", "123", "Türkiye", "İstanbul");

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        studentManager.Add(student);
        instructorManager.Add(instructor);

    }
}
