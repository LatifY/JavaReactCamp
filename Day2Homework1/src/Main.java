public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        AuthorManager authorManager = new AuthorManager();
        CategoryManager categoryManager = new CategoryManager();

        Author author1 = new Author(1,"Engin Demiroğ", "Yazılım geliştirmeye lisede yazılım bölümünde okurken başladım...");
        Category category1 = new Category(1, "Programlama");

        Course[] courses = {
                new Course(1, 1, 1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)"),
                new Course(2, 1, 1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)"),
                new Course(3, 1, 1, "Programlamaya Giriş için Temel Kurs")
        };

        authorManager.Add(author1);
        categoryManager.Add(category1);

        for(Course c : courses){
            courseManager.Add(c);
        }

    }
}