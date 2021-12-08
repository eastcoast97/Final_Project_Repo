/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.util.Properties;

/**
 *
 * @author sarveshzeke
 */
public class Utility {
    
    public static final String ALPHA_NUMERIC_STRING = "@ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
public static String generatePassword()
   {
       int count = 8;
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) 
    {
         int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
         builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
   }

public static void SendEmail(String username,String password,String toMail) {    
//                final String sender = "charan.aedprojectmailtest@gmail.com";
//	        
//
//	        Properties prop = new Properties();
//	        prop.put("mail.smtp.host", "smtp.gmail.com");
//	        prop.put("mail.smtp.port", "587");
//	        prop.put("mail.smtp.auth", "true");
//                prop.put("mail.smtp.ssl.trust","smtp.gmail.com");
//	        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//	        final String senderPwd = "Cha@16101997";
//	        Session session = Session.getInstance(prop,
//	                new javax.mail.Authenticator() {
//	                    protected PasswordAuthentication getPasswordAuthentication() {
//	                        return new PasswordAuthentication(sender, senderPwd);
//	                    }
//	                });
//
//	        try {
//
//	            Message message = new MimeMessage(session);
//	            message.setFrom(new InternetAddress(sender));
//	            message.setRecipients(
//	                    Message.RecipientType.TO,
//	                    InternetAddress.parse(toMail)
//	            );
//	            message.setSubject("Sports Management Registration");
//	            message.setText("Dear " + username+" ,"
//	                    + "\n\n " +" Access granted! \n" +" Please find your account details "+"\n Username:"
//                           + username + "\nPasscode:"+password);
//
//	            Transport.send(message);
//
//
//	        } catch (MessagingException e) {
//	            e.printStackTrace();
//	        }
    
}
}
