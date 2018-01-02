import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "PicServlet" ,urlPatterns="/pic")
public class PicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\lanou3g\\Desktop\\JaveSe\\Day29_RequestResponse\\src\\img\\111.jpg");
        byte[] pics= new byte[1024*1024*10];
        int length = fis.read(pics);
        fis.close();
//        while (fis.read())
        response.getOutputStream().write(pics,0,length);
    }
}
