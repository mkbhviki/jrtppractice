package com.tcs.sbi;

import in.ashokit.security.PwdSecurityService;

public class UserReg {
	
	public static void main(String[] args) {
		PwdSecurityService pwdSecurityService = new PwdSecurityService();
	
		String encode = pwdSecurityService.encode("Mritunjay");
	System.out.println(encode);
	
	}

}
