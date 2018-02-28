import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> blog = new ArrayList<>();
  public void add(BlogPost post) {
    blog.add(post);
  }
  public void delete(int index) {
    blog.remove(index);
  }
  public void update(int index, BlogPost post) {
    blog.get(index).authorName = post.authorName;
    blog.get(index).title = post.title;
    blog.get(index).text = post.text;
    blog.get(index).publicationDate = post.publicationDate;
  }
}
