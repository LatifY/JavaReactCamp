import java.util.ArrayList;
import java.util.List;

public class CategoryManager{
    List<Category> categories = new ArrayList<>();

    public void Add(Category category){
        categories.add(category);
        System.out.println("Category added: "+ category.name);
    }

    public void Delete(int index){
        System.out.println("Category removed: "+ categories.get(index).name);
        categories.remove(index);
    }
}