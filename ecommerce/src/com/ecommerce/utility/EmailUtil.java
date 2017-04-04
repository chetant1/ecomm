package com.ecommerce.utility;

import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {

	public static boolean sendMail(String toMailId, String text) throws MessagingException {
		Map<String, String> config = ConfigUtil.getConfigurations();
		boolean flag = false;
		String smtpHost = config.get("mail.smtp.host");
		String smtpPort = config.get("mail.smtp.port");
		final String fromMailId = config.get("mail.from.id");
		final String fromPassword = config.get("mail.from.password");
		String mailSubject = config.get("mail.subject.text");
		
		
		if(null != config){
		
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpHost);
			props.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", smtpPort);
	 
			Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(fromMailId,fromPassword);
					}
				});
	 
			try {
	 
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(fromMailId));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(toMailId));
				message.setSubject(mailSubject);
				message.setContent(text,"text/html");
				Transport.send(message);
				flag = true;
				
			} catch (MessagingException e) {
				throw e;
			}
		}
			return flag;
	}
	
	public static void main(String[] args) throws MessagingException {
		sendMail("tech5s2012@gmail.com","kk");
	}
}
	

