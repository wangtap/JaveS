package bean;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "PicServlet" ,urlPatterns = "/pic")
public class PicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Fire,FileReader,FireInputStream
        //都是找本机文件：绝对路径

        //想要找到本项目的文件：相对路径(相对于web文件夹)
        //需要使用ServletContext#getResourceAsStream
        InputStream picStream = getServletContext().getResourceAsStream("img/timg.jpg");
        byte[] bytes = IOUtils.toByteArray(picStream);
        response.getOutputStream().write(bytes);

        //类对象.getClassLoader();
        //会获得一个ClassLoader对象
        //称为：类加载器
        ///可以帮助我们加载一些文件
        //路径：相对src
    }
}
