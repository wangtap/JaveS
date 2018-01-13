import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "queryServlet",urlPatterns = "/query")
public class queryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("pc");
        if (parameter==null){
            parameter="1";
        }
        int pc = Integer.parseInt(parameter);
        QueryRunner queryRunner=new QueryRunner();
                PageBean pageBean=new PageBean();
                int begin=(pc-1)*pageBean.getPageSize();
        int end =pc*pageBean.getPageSize();
//        String sql="select * from query";
//        Connection connection = JDBCUtil.getConnection();
//        List<Book> allbooks = null;
//        try {
//            allbooks = queryRunner.query(connection, sql, new BeanListHandler<Book>(Book.class));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        pageBean.setPageCode(pc);
//        pageBean.setTotalData(160);

//        List<Book> bookList=allbooks.subList(begin,end);
//        pageBean.setBooks(bookList);
//        request.setAttribute("pageBean", pageBean);
//        request.getRequestDispatcher("/index.jsp").forward(request,response);









        String name = request.getParameter("name");
        String author = request.getParameter("author");
        String price = request.getParameter("price");
        String category = request.getParameter("category");

        String[] ps = {"name","author","price","category"};
        String[] pv = {name,author,price,category};

        StringBuilder params = new StringBuilder();

        for (int i = 0; i <ps.length; i++) {

                params.append("&"+ps[i]+"="+pv[i]);


        }

//        for (int i = 0; i < pv.length; i++) {
//            if(pv[i] != null){
//                params ="&"+ps[i]+"="+pv[i];
//            }
//        }

        List<String> pl = new ArrayList<>();

        StringBuilder books = new StringBuilder();
        StringBuilder total = new StringBuilder();
        StringBuffer sb=new StringBuffer();
        if(name != null || author != null || price!=null || category!= null){
            sb.append(" where ");
           boolean shouldAnd = false;



            for (int i = 0; i < ps.length; i++) {
                if(!pv[i] .equals("")){
                    if(shouldAnd){
                        sb.append(" and ");

                    }
                    sb.append(ps[i]+"='"+pv[i]+"'");

                    shouldAnd = true;
                    pl.add(ps[i]);
                }
            }
        }
        total.append("select  count(*)   from query");
        total.append(sb);

        sb.append(" limit "+begin+",10");
        books.append("select  *   from query");
        books.append(sb);




        pageBean.setParams(params.toString());
        Connection connection = JDBCUtil.getConnection();
        Connection connection1 = JDBCUtil.getConnection();

        List<Book> allbooks = null;
        Object query=null;
        try {
            allbooks = queryRunner.query(connection, books.toString(), new BeanListHandler<Book>(Book.class));
             query = queryRunner.query(connection1, total.toString(), new ScalarHandler());
                connection.close();
                connection1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        pageBean.setBooks(allbooks);
        pageBean.setTotalData((int)(long)query);

        pageBean.setPageCode(pc);
        request.setAttribute("pageBean", pageBean);

        request.getRequestDispatcher(
                "index.jsp"
        ).forward(request, response);



    }
}
