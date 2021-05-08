import java.util.ArrayList;
import java.util.List;

public class AuthorManager{
    List<Author> authors = new ArrayList<>();

    public void Add(Author author){
        authors.add(author);
        System.out.println("Author added: "+ author.name);
    }

    public void Delete(int index){
        System.out.println("Author removed: "+ authors.get(index).name);
        authors.remove(index);
    }
}