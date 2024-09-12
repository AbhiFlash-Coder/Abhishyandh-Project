package com.example.Abs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class ContactForm {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 @NotBlank(message = "Name is required")
	 @Pattern(regexp = "^[a-zA-Z ]+$", message = "Name must contain only letters")

	    private String name;
	 @NotBlank(message = "Email is required")
	    @Email(message = "Email should be valid")

	    private String email;
	 @NotBlank(message = "Phone number is required")
	    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")

	    private String phone;
	 @NotBlank(message = "Subject is required")

	    private String subject;
	    private String source;
	    @NotBlank(message = "Message is required")

	    private String message;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	    
}
