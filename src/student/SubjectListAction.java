package student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.School;
import bean.Subject;
import bean.Teacher;
import dao.SubjectDAO;
import tool.Action;
import util.Util;

public class SubjectListAction extends Action {
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

    	 // getUserメソッドを呼び出してユーザー情報を取得
        Teacher teacher = Util.getUser(request);
     // TeacherオブジェクトからSchoolオブジェクトを取得
        School school = teacher.getSchool();


        SubjectDAO dao = new SubjectDAO();
        List<Subject> subject = dao.filter(school);

        // HttpSessionオブジェクトを取得し、そこにユーザー情報を設定する
        HttpSession session = request.getSession();
     // Teacherオブジェクトをセッションに保存する
        session.setAttribute("subject", subject);

            return "subject_list.jsp"; // ログイン成功時のリダイレクト先
        }

        // ログイン失敗時の処理
        // 例: エラーメッセージをセットしてログインページにリダイレクト

    }
