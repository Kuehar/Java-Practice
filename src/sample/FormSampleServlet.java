package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSampleServlet
 */
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータの文字コードを指定
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");

		String errorLog = "";
		if(name == null || name.length() == 0) {
			errorLog += "名前が入力されていません。<br>";
		}
		if(gender == null || gender.length() == 0) {
			errorLog += "性別が入力されていません。<br>";
		}else{
			if(gender.equals("0")) {gender = "男性";}
			else if(gender.equals("1")){gender = "女性";}
			}

		//表示するメッセージを設定

		String msg = name +"さん(" + gender + ")を登録しました";
		if(errorLog.length() != 0) {
			msg = errorLog;
		}
	}
}
