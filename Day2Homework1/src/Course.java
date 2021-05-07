public class Course{
    public int id;
    public int authorId;
    public int categoryId;
    public String title;

    Course(int id, int authorId, int categoryId, String title){
        this();
        this.id = id;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.title = title;
    }

    Course(){}
}