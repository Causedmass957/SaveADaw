package com.example.models;

import java.util.Date;
import java.util.List;


public class Mail {
	/*Here is an example of how to use the mail model in a controller. This is an actual implementation for a previous app and should act as an example of 
	 * how to use email to email a user their password
	 * 	@PostMapping(value="/forgot/password/{email}")
	public ResponseEntity<String> checkPassword(@PathVariable(name="email") String email)
		Optional<User> corUser = Optional.ofNullable(uServ.getUserByEmail(email));
		
			Mail mail = new Mail();
	        mail.setMailFrom("exercisetrackingsystem@gmail.com");
	        mail.setMailTo(email);
	        mail.setMailSubject("Exercise Tracking App lost password");
	        mail.setMailContent("Sorry " + corUser.get().getFirst_name() + " " + corUser.get().getLast_name() +" to hear you forgot your password.\n \n Your current password is: " + corUser.get().getPass() +
	        		". \n \n To proceed to the login page, please use this link: http://localhost:4200/login");	 
	        this.uServ.sendEmail(mail);	        
			return ResponseEntity.status(201).body("Success");
		
	*/
	private String mailFrom;
	 
    private String mailTo;
 
    private String mailCc;
 
    private String mailBcc;
 
    private String mailSubject;
 
    private String mailContent;
 
    private String contentType;
 
    private List<Object> attachments;
 
    public Mail() {
        contentType = "text/plain";
    }
 
    public String getContentType() {
        return contentType;
    }
 
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
 
    public String getMailBcc() {
        return mailBcc;
    }
 
    public void setMailBcc(String mailBcc) {
        this.mailBcc = mailBcc;
    }
 
    public String getMailCc() {
        return mailCc;
    }
 
    public void setMailCc(String mailCc) {
        this.mailCc = mailCc;
    }
 
    public String getMailFrom() {
        return mailFrom;
    }
 
    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }
 
    public String getMailSubject() {
        return mailSubject;
    }
 
    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }
 
    public String getMailTo() {
        return mailTo;
    }
 
    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }
 
    public Date getMailSendDate() {
        return new Date();
    }
 
    public String getMailContent() {
        return mailContent;
    }
 
    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }
 
    public List<Object> getAttachments() {
        return attachments;
    }
 
    public void setAttachments(List < Object > attachments) {
        this.attachments = attachments;
    }
 
}

