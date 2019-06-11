package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class C01
 */
@WebServlet("/C01")
public class C01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adress = null;

		String action = request.getParameter("action");
		if(action.equals(action == null)){
			adress = "/login.html";

		}else if(action.equals("all")){
			adress = "/newregister.html";

		}else if(action.equals("part")){
			adress = "/newregister.html";

		}else if(action.equals("detail")){
			adress = "/newregister.html";

		}else if(action.equals("done")){

			HttpSession session = request.getSession();
			RegisterDetaUnit RDU = (RegisterDetaUnit)session.getAttribute("RDU");
			String id = RDU.getid();

			RegisterLogic.execute(id,RDU);

			adress = "registercomplete.html";
		}

		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispa = request.getRequestDispatcher(adress);
		dispa.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String adress = null;



		if(action.equals("login")){

			String id = request.getParameter("id");
			//String pass = request.getParameter("pass");

			String id2 = RegisterLogic.getid(id);
			//String pass2 = RegisterLogic.getpass(pass);

			/*if(id.equals(id2) && pass.equals(pass2)){
			adress = "/menue.html";
			}else{
			System.out.println("入力したデータが一致しません。ログイン画面に戻ります。");
			adress ="/login.html";
			}*/
			if(id.equals(id2)){
				adress = "/menue.html";
				}else{
				System.out.println("入力したデータが一致しません。ログイン画面に戻ります。");
				adress ="/login.html";
				}

		}else if(action.equals("newregister")){

			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			String name = request.getParameter("name");
			String huri = request.getParameter("huri");
			String old = request.getParameter("old");
			String gender = request.getParameter("gender");

			RegisterDetaUnit unit = new RegisterDetaUnit(id,pass,name,huri,old,gender);

			HttpSession session = request.getSession();
			session.setAttribute("RDU", unit);

			adress = "/registerconform.jsp";


		}
		RequestDispatcher dispa = request.getRequestDispatcher(adress);//フォワードを実行１（再確認画面へ）
		dispa.forward(request,response);//フォワードを実行２




	}

}
