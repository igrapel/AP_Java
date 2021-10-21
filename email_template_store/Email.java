package com.company;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Email {
    Properties props;
    String host;
    String user;
    final String password;
    String to;
    Session session;

    public Email(String to) {

        host = "smtp.office365.com";
        user = "323917@dadeschools.net";//change accordingly
        password = "*****";//sql server pwd
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

        session = Session.getDefaultInstance(props, auth);
    }

    public void sendMessage(String n, String gender)
    {
        String obj;
        if(gender.equals("b")) { obj = "him"; }
        else { obj = "her"; }

        /**String e_message = "Dear parents, " +
                "\nI am " + n + "'s computer science teacher. " + n + " is not completing " + obj + " work. As a result, " +
                n + " is in danger of failing the class. I hope you can speak with " + n + " and encourage " + obj +
                " to put in the effort to pass the class." +
                "\n\n" + "Sincerely, \n\nMr. Ilan Grapel\nIB and AP Computer Science \nCoral Gables Senior High";
        **/

        String e_message = "I would like this message to remain anonymous - however, Katherine has been bullying me" +
                "and numerous other students.";

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user, "Gabriel Wagner"));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(n + "'s Behvaior");
            message.setText(e_message);

            //send the message
            Transport.send(message);

            System.out.println("message sent successfully...");

        }
        catch (MessagingException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}
