import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "ServletDictionary",urlPatterns = "/translate")
public class ServletDictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HashMap<String,String> word= new HashMap<>();
        word.put("book","Sach");
        word.put("hello","Chao");
        word.put("love","Yeu");
        word.put("you","Ban");
        word.put("i love you","Toi yeu ban");
        String search = request.getParameter("word");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = word.get(search);
        if (request != null){
            writer.println("Word: " + search + " - ");
            writer.println("Result: " + result);
        }else {
            writer.println("not found");
        }
        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
