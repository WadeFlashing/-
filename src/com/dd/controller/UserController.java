package com.dd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dd.po.User;
import com.dd.service.UserService;

@Controller
public class UserController {

	//����ע��
	@Autowired
	private UserService userService;
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String usercode,String password,Model model,HttpSession httpSession){
		
		User user = userService.findUser(usercode, password);
		if(user!=null){
			httpSession.setAttribute("USER_SESSION", user);
			return "redirect:customer/list";
		}
		model.addAttribute("msg", "�˺Ż�����������������룡");
		return "login";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(String usercode,String password,String username,String userstate,
			Model model){
		
		int user = userService.addUser(usercode, password, username, userstate);
		if(user!=0){
		model.addAttribute("msg","ע��ɹ������¼��");
		return "login";
		}
		model.addAttribute("msg","ע��ʧ�ܣ�������ע�ᣡ");
		return "login";
	}
	
	/*ģ������������ת���ͻ�����ҳ��ķ���*/
	@RequestMapping(value="/toCustomer")
	public String toCustomer(){
		return "redirect:customer/list";
	}
	
	/*�˳���¼*/
	@RequestMapping(value="loginout")
	public String Loginout(HttpSession session){
		
		session.invalidate();
		return "redirect:login";
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin(){
		return "login";
	}
}
