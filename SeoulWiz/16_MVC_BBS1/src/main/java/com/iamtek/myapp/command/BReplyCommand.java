package com.iamtek.myapp.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.iamtek.myapp.dao.BDao;

//
public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId =  request.getParameter("bId");
		String bName =  request.getParameter("bName");
		String bTitle =  request.getParameter("bTitle");
		String bContent =  request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.reply(bId, bName, bTitle, bContent);
	
	}

}
