package com.my.control;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.my.dao.CustomerInfoDAO;
import com.my.dao.RoomDAO;
import com.my.vo.CustomerInfo;
import com.my.vo.Room;

@Controller
@SessionAttributes("room")
public class RoomController implements MessageSourceAware{
	private MessageSource ms;
	
	@Autowired
	RoomDAO dao=null;
	
	@Override
	public void setMessageSource(MessageSource ms) {
		this.ms=ms;
	}
	
	@RequestMapping("/roomtest.do")
	public String createRoom(String admin_id, String max_cnt, String payment, String room_gender, String alcohol, String start_spot,
			String end_spot, String start_x, String start_y, String end_x, String end_y, Date start_time,
			Model model){
		String msg = "1";
		
		try { 
			Room room = new Room(admin_id, max_cnt, payment, room_gender, alcohol, start_spot,
								end_spot, start_x, start_y, end_x, end_y, start_time, "A");
			dao.insert(room);			
		} catch (Exception e) {
			msg="0";
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		model.addAttribute("msg", msg);
		String forwardURL = "/result.jsp";		
		return forwardURL;
	}
}
