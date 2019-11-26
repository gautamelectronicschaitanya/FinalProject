package com.controller;

import java.awt.Dialog.ModalExclusionType;
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
import com.service.EmiProcessors;
import com.service.FmsService;

@Controller
public class MainController {

	@Autowired
	FmsService service;

	@Autowired
	FmsRespository repository;

	@Autowired
	EmiProcessors emiprocessor;

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
		public String login(HttpServletRequest request, ModelMap map) {
			String s = "";
			int id = 0;
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Login_Credentials lc = repository.getLoginDetails();
            int uid=lc.getUserprofile().getUserid();
            String uname=lc.getUserprofile().getUsername();
            System.out.println(uname);
			Card_Details card_Details = repository.getCardDetails(uid);
			System.out.println(card_Details.getCardtype());
			boolean flag = service.loginVerify(username, password);
            
			if (flag == true) {
			    map.put("cardD", card_Details);
				map.put("name", uname);
				{
					return "dashboard.jsp";
				}

			} else {
				return "error.jsp";

			}
		}

		@RequestMapping(path="/product_catalog")
		public String productcatalog() {

			return "product_catalog.jsp";
		}

		@RequestMapping(path="/paymentgateway")
		public String paymentgateway() {

			return "paymentgateway.jsp";
		}

		@RequestMapping(path="/orderdetails", method = RequestMethod.POST)
		public String Conformation(@RequestParam("emioption") int emioption, @RequestParam("productid") int productid,
				@RequestParam("userid") int userid, ModelMap map) {
			Emi_Details emi = emiprocessor.emiGenerator(emioption, productid, userid);
			map.put("emi", emi);

			return "orderdetails.jsp";
		}

	}
}
