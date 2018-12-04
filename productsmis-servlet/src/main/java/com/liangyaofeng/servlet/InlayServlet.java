package com.liangyaofeng.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liangyaofeng.dao.InLayDao;
import com.liangyaofeng.entity.Inlay;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/InlayServlet")
public class InlayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        InLayDao inLayDao=new InLayDao();
        List<Inlay> list=inLayDao.selectAllInLay();
        inLayDao.text();

        ObjectMapper om=new ObjectMapper();
        String json_products=om.writeValueAsString(list);
        response.getWriter().print(json_products);
    }
}
