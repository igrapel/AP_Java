package com.company;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Email {
    Properties props;
    String host;
    String user;
    final String password;
    String to;

    public Email(String to) {

        host = "smtp.office365.com";
        user = "323917@dadeschools.net";//change accordingly
        password = "Elisha912114!";//change accordingly
        this.to = to;

        //Get the session object
        props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Authenticator auth = new Authenticator()
        {
            @Override
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(user, password);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Test Message from Java");
            message.setText("Hello parents, \n Your child ...");

            //send the message
            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (MessagingException e) {e.printStackTrace();}
    }
}
