package servletEx;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletGet", value = "/ServletGet")
public class ServletGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET : doGet method");

        PrintWriter printWriter = response.getWriter(); // req, res 이미 생성된 시점에 스트림으로 클라이언트의 정보가 있다
        StringBuffer html = new StringBuffer();
        html.append("<html>");
        html.append("<head>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>hi</h1>");
        html.append(
                "<img></img>"
        );
        html.append("</body>");
        html.append("</html>");

        printWriter.print(html.toString());
    }


}
