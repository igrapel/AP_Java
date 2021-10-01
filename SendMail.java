import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {
    public static void main(String[] args) {

        String host="smtp.office365.com";
        final String user="323917@dadeschools.net";//change accordingly
        final String password="****";//change accordingly

        String to="0158168@students.dadeschools.net";//change accordingly

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user,password);
                    }
                });

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
