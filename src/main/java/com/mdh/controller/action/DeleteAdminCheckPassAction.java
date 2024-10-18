package com.mdh.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mdh.dao.ReviewDAO;
import com.mdh.dto.ReviewVO;

public class DeleteAdminCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		String pass = request.getParameter("pass");
		String code = request.getParameter("code");
		request.setAttribute("code", code);
		System.out.println(code);
		
		if (pass.equals("0000")) { // 성공
			url = "/product/deleteCheckSuccess.jsp";
		} else {// 실패
			url = "/product/deleteAdminCheck.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
