package com.oscarspring.tournament.rest.message.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpForm {
	@NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Size(max = 60)
    @Email
    private String email;
    
    private Set<String> authority;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

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
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getAuthority() {
		return authority;
	}

	public void setAuthority(Set<String> authority) {
		this.authority = authority;
	}
}
