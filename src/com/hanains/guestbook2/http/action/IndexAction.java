package com.hanains.guestbook2.http.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.guestbook.dao.GuestBookDao;
import com.hanains.guestbook.vo.GuestBookVo;
import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;

public class IndexAction implements Action{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.getlist();

		req.setAttribute("list", list);

		//forwarding
		HttpUtil.forwarding(req, resp, "/WEB-INF/views/index.jsp");
	}

}
