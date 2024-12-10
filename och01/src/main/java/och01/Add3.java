package och01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
@WebServlet("/Add3")
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // 인코딩 방식 설정 
		request.setCharacterEncoding("UTF-8");
        System.out.println("doGet start...");
        // num의 누적분을 return 할것. 
        int num = Integer.parseInt(request.getParameter("num"));
        String han = request.getParameter("han");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        } 
        response.setContentType("text/html;charset=UTF-8");
        
        // 리스폰 객체로 화면에 출력 
        PrintWriter out = response.getWriter();
        
        out.printf("<html><body>");
        out.printf("<h1>han test : %s</h1>", han);
        out.printf("<h1>1부터 %d까지 합계 </h1> GET", num);
        out.println(sum);
        out.println("</body></html>");
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       // 인코딩 방식 설정 
			request.setCharacterEncoding("UTF-8");
	        System.out.println("doPost start...");
	        // num의 누적분을 return 할것. 
	        int num = Integer.parseInt(request.getParameter("num"));
	        String han = request.getParameter("han");
	        int sum = 0;
	        for (int i = 1; i <= num; i++) {
	            sum += i;
	        } 
	        response.setContentType("text/html;charset=UTF-8");
	        
	        // 리스폰 객체로 화면에 출력 
	        PrintWriter out = response.getWriter();
	        
	        out.printf("<html><body>");
	        out.printf("<h1>han test : %s</h1>", han);
	        out.printf("<h1>1부터 %d까지 합계 POST</h1>", num);
	        out.println(sum);
	        out.println("</body></html>");
	    }
		
	}


