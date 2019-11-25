package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Card_Details;
import com.entity.Emi_Details;
import com.entity.Login_Credentials;
import com.entity.Product_Information;
import com.entity.Product_Purchase_Information;
import com.entity.Registeration;
import com.entity.User_Profile;
import com.repository.FmsRespository;

@Service
public class FmsService {

	@Autowired
	FmsRespository fmsrepository;

	public void register(Registeration registeration) {
		Registeration reg = (Registeration) fmsrepository.insertUser(registeration);
		registeration.setuID(reg.getuID());

	}

	public List<User_Profile> transactionDetails(int id) {
		List<User_Profile> userprofile = (List<User_Profile>) fmsrepository.fetchById(User_Profile.class, 101);

		return userprofile;
	}

	public boolean loginVerify() {
		boolean flag = false;
		List<Login_Credentials> loginCredentails = fmsrepository.getLoginDetails();
		for (Login_Credentials lc : loginCredentails)
			if (lc.getUsername().equals("gautam") && lc.getPassword().equals("qwerty")) {
				flag = true;
			} else {
				flag = false;
			}
		return flag;

	}
	
	public Card_Details dashboard(int cardid)
	{
		return null;
	     
	}

}
