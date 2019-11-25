import java.time.LocalDate;

import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Emi_Details;
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
		//emi.setLatefee(500);
	//	emi.setInstallment(10000);
		emi.setEnddate(enddate);
		emi.setEmioption("THREE MONTH");
        emi.setUserprofile(ud);
        fms.add(ud);
        
        
		
	}

	

}