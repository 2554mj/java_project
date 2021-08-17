package webpage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page01 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		super.service(req, resp);
		//즉, JSP에서 사용되는 모든 변수는 지역변수라 초기화 해줘야함
		//jsp에서 돌아가는 오리지널 자바 코드 HttpServlet=>Http에서 돌아가는 Servlet(Servr+let : 서버에서 돌아가는 작은 프로그램)
		//jsp가 서버에서 돌아갈 때, 자바프로그램으로 자동 코드 변경(컨버팅)되어 실행되는데, 이렇게 자동생성되는 자바코드를 서블릿이라고한다.
		//jsp-->Servlet : Tomcat내의 JSP엔진(서블릿 엔진)
		//jsp내에 작성한 모든 자바코드는 service()메서드 안으로 들어가서 자동 생성된다.
		//그래서 jsp내에 선언된 변수는 모두 지역변수이다. 초기화를 반드시 해주어야 한다!!! <% %>스크립트릿 안에서 사용되는 변수는 모두 지역변수
		//jsp안에서 전역변수를 사용하고 싶은 경우 = > <%! %>전역변수 선언시 사용!!
	}

}
