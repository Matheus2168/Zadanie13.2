import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TextResult")
public class TextResult extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");

        pw.println(text);
        pw.println("<h1> Ilosc znakow w tekscie: "+text.length()+"</h1>");
        pw.println("<h1> Ilosc znakow bez spacji: "+TextCalc.lenghtWithoutSpaces(text)+" </h1>");
        pw.println("<h1> Ilosc slow: "+TextCalc.wordsNumber(text)+" </h1>");
        pw.println("<h1> Palindrom: "+TextCalc.isPalindormic(text)+" </h1>");

        pw.println("</body>");
        pw.println("</html>");

    }


}
