package demo;

import java.io.IOException;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.TemplateOutput;
import gg.jte.output.StringOutput;


@WebServlet("/hello-jte")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TemplateEngine templateEngine;
	
    public HelloServlet() {
        super();
        templateEngine = TemplateEngine.createPrecompiled(Path.of("jte-classes"), ContentType.Html);
        //templateEngine = TemplateEngine.createPrecompiled(ContentType.Html);;
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TemplateOutput output = new StringOutput();
		String name = "John Doe";
		templateEngine.render("index.jte", name, output);
		System.out.println(output);
		
		response.setContentType("text/html");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
