package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Card_Details;
import com.entity.Emi_Details;
import com.entity.Product_Information;
import com.entity.Product_Purchase_Information;
import com.entity.User_Profile;
import com.repository.FmsRespository;

@Service
public class EmiProcessors {

	
	@Autowired
	FmsRespository fmsrepository;

	int cardno;
	String cardstatus;
	String productname;
	long totalcredit;
	long usedcredit;
	long remainingcredit;
	long productamount;
	long installment;
	long paidamount;
	long balanceamount;
	LocalDate startdate;
	LocalDate enddate;

	public EmiProcessors() {
		cardno = 0;
		cardstatus = "";
		productname = "";
		totalcredit = 0;
		usedcredit = 0;
		remainingcredit = 0;
		productamount = 0;
		installment = 0;
		paidamount = 0;
		balanceamount = 0;
	}

	public Emi_Details emiGenerator(int emioption, int productid, int userid) {

		Card_Details cardDetails = fmsrepository.getCardDetails(productid);
		Product_Information p = fmsrepository.getProductDetail(productid);
		Emi_Details emid = new Emi_Details();
		productamount=p.getAmount();
		startdate = LocalDate.now();
		enddate = startdate.plusMonths(emioption);
		installment = (productamount / emioption);
		paidamount = installment;
		usedcredit = paidamount;
		balanceamount = productamount - paidamount;
		remainingcredit = totalcredit - balanceamount;
		System.out.println("installment " + installment);
		System.out.println("usedcredit " + usedcredit);
		System.out.println("balancecredit " + balanceamount);

		emid.setBalanceamountt(balanceamount);
		emid.setCarddetails(cardDetails);
		emid.setEmioption(""+emioption);
		emid.setEnddate(enddate);
		emid.setPaidamount(paidamount);
		emid.setStartdate(startdate);
		emid.setPaidamount(installment);
		fmsrepository.add(emid);
        
		return emid;
	}

}
