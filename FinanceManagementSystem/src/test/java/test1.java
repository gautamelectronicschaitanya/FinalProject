import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Card_Details;
import com.entity.Emi_Details;
import com.entity.Login_Credentials;
import com.entity.Product_Information;
import com.entity.Product_Purchase_Information;
import com.entity.User_Profile;
import com.repository.FmsRespository;

public class test1 {
	@Test
	public void save() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		User_Profile ud = new User_Profile();
		Emi_Details emi = new Emi_Details();
		LocalDate startdate = LocalDate.of(2017, 11, 6);
		LocalDate enddate = LocalDate.of(2018, 01, 6);
		ud.setUserid(103);
		ud.setUsername("gautam");
		ud.setPhoneno(2451255);
		ud.setIfsccode("1254");
		ud.setEmail("ca@da.com");
		ud.setCardtype("gold");
		ud.setBankname("SBI");
		ud.setAddress("mumbai");
		ud.setAccountno(1213);
		emi.setTransid(101);
		emi.setStartdate(startdate);
		emi.setPaidamount(10000);
		emi.setBalanceamountt(20000);
		// emi.setLatefee(500);
		// emi.setInstallment(10000);
		emi.setEnddate(enddate);
		emi.setEmioption("THREE MONTH");
		emi.setUserprofile(ud);
		fms.add(ud);

	}

	@Test
	public void fetch() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		User_Profile user = (User_Profile) fms.fetchById(User_Profile.class, 101);
		System.out.println(user.getUsername());

	}

	@Test
	public void fetch2() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		List<User_Profile> p = fms.getUserDetails(101);
		System.out.println(p);

	}

	@Test
	public void fetch3() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		List<Login_Credentials> ll = fms.getLoginDetails();
		for (Login_Credentials k : ll) {
			if (k.getUsername().equals("gautam")) {
				System.out.println("true");
			}
		}

	}

	@Test
	public void pushproduct() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		Product_Information info = new Product_Information();
		Product_Purchase_Information ppinfo = new Product_Purchase_Information();
		Card_Details cardDetails = new Card_Details();
		LocalDate issue = LocalDate.of(2017, 11, 6);
		LocalDate valid = LocalDate.of(2017, 11, 6);
		info.setPid(01);
		info.setProductname("Laptop");
		info.setProductinfo("Dell laptop 3542");
		info.setAmount(30000);
		info.setImage("laptop.jpg");
		ppinfo.setAmount(30000);
		ppinfo.setBalanceamount(50000);
		ppinfo.setPaidamount(10000);
		ppinfo.setProduct_name("dell laptop");
		ppinfo.setProductpid(01);
		ppinfo.setProductinformation(info);
		cardDetails.setCardno(111);
		cardDetails.setCardstatus("Active");
		cardDetails.setCardtype("GOLD");
		cardDetails.setIssuedate(issue);
		cardDetails.setTotalcredit(60000);
		cardDetails.setUsedcredit(10000);
		cardDetails.setValiddate(valid);

		fms.add(info);
		fms.add(ppinfo);
	}

	@Test
	public void DashBoard() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		Card_Details dd = (Card_Details) fms.fetchById(Card_Details.class, 242);
		int s = dd.getUserprofile().getUserid();
		System.out.println(dd.getCardno());
		System.out.println(dd.getValiddate());
		System.out.println(dd.getCardtype());
		System.out.println(s);

	}

	public void DashBoard2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		User_Profile dd = (User_Profile) fms.fetchById(User_Profile.class, 101);
		System.out.println(dd.getUserid());
	}
	@Test
	public void Card() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
	    Card_Details cd = new Card_Details();
	    User_Profile up = new User_Profile();
	    LocalDate issue = LocalDate.of(2017, 11, 6);
		LocalDate valid = LocalDate.of(2017, 11, 6);
	    cd.setCardno(21);
	    cd.setCardlimit(100000);
	    cd.setCardstatus("ACTIVE");
	    cd.setCardtype("GOLD");
	    cd.setIssuedate(issue);
	    cd.setUserprofile(up);
	    up.setCardDetails(cd);
	    up.setUserid(107);
	    up.setUsername("roma");
	    fms.add(up);
	    
	}
	
	@Test
	public void CardDetails()
	{

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		FmsRespository fms = ctx.getBean(FmsRespository.class);
		List<Card_Details> p = fms.getCardDetails(107);
		for(Card_Details ds:p)
		{
		System.out.println(ds.getUserprofile().getUserid());
		System.out.println(ds.getCardstatus());
	}
	}
		
	}
	
