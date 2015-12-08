package com.hanains.guestbook2.http.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.guestbook.dao.GuestBookDao;
import com.hanains.guestbook.vo.GuestBookVo;
import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;

public class DeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		int no = Integer.parseInt(req.getParameter("no"));
		String password = req.getParameter("password");
		
		GuestBookDao dao = new GuestBookDao();
		GuestBookVo vo = new GuestBookVo();
		
		vo.setNo(no);
		vo.setPassword(password);
		
		System.out.println("::::"+vo);
		
		dao.delete(vo);
		
		resp.sendRedirect("/guestBook2/gb?a=index");
	}

}
