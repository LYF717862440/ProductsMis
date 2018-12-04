package com.liangyaofeng.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liangyaofeng.dao.ProductsDao;
import com.liangyaofeng.entity.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ProductsServlet")
public class ProductsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String action=request.getParameter("action");

        if (action.equals("ListAll")){
            ProductsDao productsDao=new ProductsDao();
            String cid=request.getParameter("cid");
            int cid1=0;
            String bid=request.getParameter("bid");
            int bid1=0;
            String iid=request.getParameter("iid");
            int iid1=0;
            String mid=request.getParameter("mid");
            int mid1=0;
            String tid=request.getParameter("tid");
            int tid1=0;
            String hid=request.getParameter("hid");
            int hid1=0;
            if (cid!=null && cid!=""){
                cid1=Integer.parseInt(cid);
            }
            if (bid!=null && bid!=""){
                bid1=Integer.parseInt(bid);
            }
            if (iid!=null && iid!=""){
                iid1=Integer.parseInt(iid);
            }
            if (mid!=null && mid!=""){
                mid1=Integer.parseInt(mid);
            }
            if (tid!=null && tid!=""){
                tid1=Integer.parseInt(tid);
            }
            if (hid!=null && hid!=""){
                hid1=Integer.parseInt(hid);
            }
            Products products=new Products();
            products.setCid(cid1);
            products.setBid(bid1);
            products.setIid(iid1);
            products.setMid(mid1);
            products.setTid(tid1);
            products.setHid(hid1);
            List<Products> list =productsDao.selectAllProducts(products);
            productsDao.text();

            ObjectMapper om=new ObjectMapper();
            String json_products=om.writeValueAsString(list);
            response.getWriter().print(json_products);
        }else if(action.equals("bycname")){
            ProductsDao productsDao=new ProductsDao();
            List<Products> list =productsDao.selectBycname(2002,1002);

            ObjectMapper om=new ObjectMapper();
            String json_product2=om.writeValueAsString(list);
            response.getWriter().print(json_product2);
        }else{
            System.out.println("action不能为空！");
        }
    }
}
