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


@Controller
@SessionAttributes("point")
public class PointController implements MessageSourceAware{
	private MessageSource ms;
		
	@Override
	public void setMessageSource(MessageSource ms) {
		this.ms=ms;
	}

	
	
	

}
