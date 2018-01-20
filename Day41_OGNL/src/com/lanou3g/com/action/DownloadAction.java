package com.lanou3g.com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.InputStream;

public class DownloadAction extends ActionSupport {
    private InputStream stream;
    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }


    public String down(){
        filename="dog.jpg";
        ////获得在web下的图片

        //getServletContext().
        stream = ServletActionContext.getServletContext().getResourceAsStream("img/123.jpg");
        System.out.println(stream);
        return SUCCESS;



    }
}
