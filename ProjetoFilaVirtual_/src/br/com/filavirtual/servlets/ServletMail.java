package br.com.filavirtual.servlets;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletMail
 */
@WebServlet("/enviarEmailCadastro")
public class ServletMail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletMail() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String username = "fila.virtual.mail@gmail.com";
		final String password = "@filavirtual#";
		final String para = (String) request.getAttribute("email");
		final String nomeUsuario = (String) request.getAttribute("nome");
		final String sobrenomeUsuario = (String) request.getAttribute("sobrenome");
		final String conteudoDoEmail = "Olá "+nomeUsuario+" "+sobrenomeUsuario+"\n seja Bem-Vindo ao Fila Virtual!";
		final String assuntoEmail = "Novo Cadastro";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("fila.virtual.mail@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(para));
			message.setSubject(assuntoEmail);
			message.setText(conteudoDoEmail);
			Transport.send(message);

			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("cadastrado");
		rd.forward(request, response);
		
	}
}
