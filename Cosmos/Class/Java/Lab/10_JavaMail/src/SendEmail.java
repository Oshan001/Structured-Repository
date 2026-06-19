import java.util.Properties;
import jakarta.mail.*;               // Core classes for sending email
import jakarta.mail.internet.*;     // Classes for email content like address, message, etc.

public class SendEmail {
    public static void main(String[] args) throws Exception {

        // Sender's email and password (App Password must be used for Gmail)
        final String senderEmail = "your_email@gmail.com";           // Replace with your Gmail
        final String senderPassword = "your_app_password";           // Use app-specific password (NOT your login password)

        // Receiver's email
        String recipientEmail = "receiver_email@example.com";        // Replace with actual recipient

        // 🛠️ Step 1: Set up SMTP server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");                         // Enables SMTP authentication
        props.put("mail.smtp.starttls.enable", "true");              // Enables STARTTLS for secure connection
        props.put("mail.smtp.host", "smtp.gmail.com");               // SMTP server (Gmail in this case)
        props.put("mail.smtp.port", "587");                          // Gmail uses port 587 for TLS

        /*
         Note: A Session is like a configuration + authentication bundle
         - It holds all properties and authenticates the sender
         - It is used to create and send the message
        */
        Session session = Session.getInstance(props, new Authenticator() {
            // Authenticator provides the credentials to the mail server
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        // ✉Step 2: Compose the actual email message
        Message msg = new MimeMessage(session);                      // MimeMessage = email with header + body
        msg.setFrom(new InternetAddress(senderEmail));               // Set sender address
        msg.setRecipients(Message.RecipientType.TO,                  // Set recipient(s)
                InternetAddress.parse(recipientEmail)); // For only one Recipient we can use **msg.setRecipient(Message.RecipientType.TO, new InternetAddress(email));**
        msg.setSubject("Hello from Java!");                          // Email subject
        msg.setText("Hi there,\n\nThis email was sent using JavaMail API."); // Email body (plain text)

        // Step 3: Send the email using Transport
        Transport.send(msg);

        // ✅ Confirmation message
        System.out.println("✅ Email sent successfully!");
    }
}

/*
Why use Jakarta Mail (JavaMail)?
- Allows Java apps to send emails via SMTP.
- Can also receive via POP3/IMAP (not used here).
- Commonly used in signup systems, OTPs, contact forms, etc.

Why App Password?
- Gmail blocks "less secure apps" from using real passwords.
- You need to turn on 2-step verification in your Google account.
- Then, generate an "App Password" just for your Java app.

Why Authenticator?
- It's how Java gives your email and password to Gmail securely.
- You must override getPasswordAuthentication().

Why Session?
- Session combines server properties + authentication.
- Required to build and send emails.

Why MimeMessage?
- MIME = Multipurpose Internet Mail Extensions.
- MimeMessage supports subject, sender, recipient, and content.
- Can be extended for attachments or HTML emails.

Limitations:
- Can fail if:
    - Wrong port (587 is for TLS, 465 is for SSL)
    - SMTP blocked by firewall
    - Wrong password or app password not used
    - Network issues

For Advanced:
- Use `setContent()` instead of `setText()` for HTML content.
- Use `Multipart` and `MimeBodyPart` for attachments.

*/