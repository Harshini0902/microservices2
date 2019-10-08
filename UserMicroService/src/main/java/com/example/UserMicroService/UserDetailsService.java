package com.example.UserMicroService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository udr;
	
	public List<UserDetails> getUserDetails(){
		List<UserDetails> ls=new ArrayList<>();
		udr.findAll().forEach(ls::add);
		return ls;
	}
	public void setUserDetails(UserDetails userDetails) {
		udr.save(userDetails);
	}

}
