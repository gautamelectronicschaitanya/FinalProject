package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Card_Details;
import com.entity.Emi_Details;
import com.entity.Login_Credentials;
import com.entity.Registeration;
import com.entity.User_Profile;
import com.repository.FmsRespository;
import com.service.FmsService;

@Controller
public class MainController {

	@Autowired
	FmsService service;

	@Autowired
	FmsRespository repository;

	@Controller
	public class RegisterController {

		@RequestMapping(path = "registeration.lti", method = RequestMethod.POST)
		public String register(Registeration reg, HttpSession session, ModelMap model) {
			service.register(reg);
			return "login.jsp";
		}

		@RequestMapping("/login")
		public String PreLogin() {
			return "login.jsp";
		}

		@RequestMapping(path = "/dashboard", method = RequestMethod.POST)
		public String login(HttpServletRequest request, Model map) {
			String s = "";
			int id = 0;
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String name="";
			List<Login_Credentials> lc = repository.getLoginDetails();
			for (Login_Credentials l : lc) {
				s = l.getUsername();
				id=l.getUserprofile().getUserid();
			}
			System.out.println(id);
			List<Card_Details> cardDetails = repository.getCardDetails(id);
			for(Card_Details ds: cardDetails)
			{
				System.out.println(ds.getTotalcredit());
				name=ds.getUserprofile().getUsername();
			}
			boolean flag = service.loginVerify();
			if (flag == true) {
				map.addAttribute("credential", s);
				map.addAttribute("card", cardDetails);
				map.addAttribute("name",name);
				return "dashboard.jsp";
			} else
			{
				return "error.jsp";

		}
		}

		@RequestMapping("/product_catalog")
		public String productcatalog() {

			return "product_catalog.jsp";
		}

		@RequestMapping("/paymentgateway")
		public String paymentgateway() {
			return "paymentgateway.jsp";
		}

		@RequestMapping("/conformation")
		public String Conformation() {
			return "conformation.jsp";
		}

		@RequestMapping("/orderdetails")
		public String orderdetails() {
			return "order_details.jsp";
		}

	}
}
