package servletEx;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletTodoPractice", value = "/ServletTodoPractice")
public class ServletTodoPractice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(); // 해당 페이지에서 get 요청이 들어왔을 때 getSession 요청을 취함

        if(session.isNew()){ // 기존에 JSESSIONID 가 없었던 새로운 사용자
            System.out.println("JSESSIONID 쿠키가 새로 만들어진 사용자");
            response.sendRedirect("/login");
        }

        // JSESSIONID 는 있지만 해당 세션 컨텍스트에 loginInfo라는 이름으로 저장된 객체가 없는 경우
        if(session.getAttribute("loginInfo") == null){
            System.out.println("로그인한 정보가 없는 사용자");
            response.sendRedirect("/login");
        }


        // 정상적인 경우라면 입력 화면으로
        request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
