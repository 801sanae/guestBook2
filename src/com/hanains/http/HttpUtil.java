package com.hanains.http;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {
	public static void forwarding(HttpServletRequest req, HttpServletResponse resp, String path)throws ServletException, IOException{
		RequestDispatcher rd = req.getRequestDispatcher(path);//param --> path
		rd.forward(req, resp);// 
	}
	
	public static void redircet(HttpServletResponse res, String url)throws ServletException, IOException{
		res.sendRedirect(url);
	}
}
