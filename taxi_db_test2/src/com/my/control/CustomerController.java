package com.my.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.my.dao.CustomerInfoDAO;
import com.my.vo.CustomerInfo;

@Controller
@SessionAttributes("customer")
public class CustomerController implements MessageSourceAware{
	private MessageSource ms;
	
	@Autowired
	CustomerInfoDAO dao=null;
	
	@Override
	public void setMessageSource(MessageSource ms) {
		this.ms=ms;
	}
	
	//로그인
	@RequestMapping("/login.do")
	public String login(String info_id, Model model){
		String msg="1";
		CustomerInfo c = null;
		try{
			c = dao.selectById(info_id);
			// 해당 카카오ID의 회원정보가 있는 경우
			if(c != null){
				msg = c.toString(); //조회된 회원정보 전송
				System.out.println(c.toString());
			}else{
				msg = "0";
			}	
		}catch (Exception e) {
			msg="0";
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		model.addAttribute("msg", msg);
		String forwardURL = "/result.jsp";		
		return forwardURL;
	}
	
	//회원가입
	@RequestMapping("/customertest.do")
	public String signup(String info_id,
			String phone_no,
			String info_name,
			String nickname,
			String info_gender,
			Model model){
		String msg = "1";
		try { 
			dao.insert(new CustomerInfo(info_id, phone_no, info_name, nickname, info_gender, 0, 0, 0));
		} catch (Exception e) {
			msg="0";
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		model.addAttribute("msg", msg);
		String forwardURL = "/result.jsp";		
		return forwardURL;
	}

	//탑승기록
	
	//차단목록
	
	
	
	
}
