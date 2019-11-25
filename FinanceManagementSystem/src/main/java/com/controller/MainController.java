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

	@Controller
	public class RegisterController {

		@RequestMapping(path = "registeration.lti", method = RequestMethod.POST)
		public String register(Registeration reg, HttpSession session, ModelMap model) {
			service.register(reg);
			return "login.jsp";
		}
		
		@RequestMapping("/login")
		public String login()
		{
			return "login.jsp";
		}
		
		@RequestMapping(path = "/dashboard", method = RequestMethod.POST)
		public String register(HttpServletRequest request) {
			
			
			return "dashboard.jsp";
			
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
