package nassau;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ObjetoRequest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAgent = request.getHeader("user-agent");
		Enumeration<String> cabecalhos = 
				request.getHeaderNames();
		PrintWriter out = response.getWriter();
		String title = "Exibindo os cabecalhos da requisicao";
		//response.setContentType("text/html");
		out.println(iniciaHTML(title)+"<BODY BGCOLOR=\"#FDF5E6\">\n" +
				"<H1 ALIGN=CENTER>" + title + "</H1>\n" +
				"<B>Request Method: </B>" +
				request.getMethod() + "<BR>\n" +
				"<B>Request URI: </B>" +
				request.getRequestURI() + "<BR>\n" +
				"<B>Request Protocol: </B>" +
				request.getProtocol() + "<BR><BR>\n" +
				"<TABLE BORDER=1 ALIGN=CENTER>\n" +
				"<TR BGCOLOR=\"#FFAD00\">\n" +
				"<TH>Header Name<TH>Header Value");
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
		String headerName = headerNames.nextElement();
		out.println("<TR><TD>" + headerName);
		out.println(" <TD>" + request.getHeader(headerName));
		}
		out.println("</TABLE>\n</BODY></HTML>");

	}
	
	private String iniciaHTML(String titulo)
	{
		StringBuilder sb = new StringBuilder("<html><head><title>");
		sb.append(titulo);
		sb.append("</title>");
		sb.append("</head>");
		return sb.toString();
	}
}
