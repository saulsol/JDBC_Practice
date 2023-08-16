package servletEx;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLogPractice", value = "/ServletLogPractice")
public class ServletLogPractice extends HttpServlet {

    // 로그아웃 처리 -> 스프링에서는 로그인, 로그아웃 둘 다 Post 요청이다
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("id") != null){
            session.invalidate();
            out.print("로그아웃 작업 완료하였습니다.");
        }else{
            out.print("현재 로그인 상태가 아닙니다.");
        }

        out.close();

    }

    // 로그인 처리
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String pwd = request.getParameter("pass");

        if(id.isEmpty() || pwd.isEmpty()){
            out.print("ID 또는 비밀번호를 입력해주세요");
            return;
        }

        HttpSession session = request.getSession();
        if(session.isNew() || session.getAttribute("id") == null){
            session.setAttribute("id", id);
            out.print("로그인을 완료했습니다.");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/practice/jsp/list.jsp");
            requestDispatcher.forward(request, response);

        }else{
            out.print("현재 로그인 상태입니다.");
        }


    }
}
