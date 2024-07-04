package com.model;

public class User1 {
		String Username;
		String MailId;
		String Password;
		String Contact;
		String Address;
		
		public User1(String Username, String MailId,  String Password,String Contact, String Address) {
			// TODO Auto-generated constructor stub
			super();
			this.Username=Username;
			this.MailId=MailId;
			this.Password=Password;
			this.Contact=Contact;
			this.Address=Address;
			
			
		}
		public String getUsername() {
			return Username;
		}
		
		public String getMailId() {
			return MailId;
		}
		
		public String getPassword() {
			return Password;
		}
		
		public String getContact() {
			return Contact;
		}
		
		public String getAddress() {
			return Address;
		}
		
	}
		
		
