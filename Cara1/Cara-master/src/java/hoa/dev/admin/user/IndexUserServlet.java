/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hoa.dev.admin.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import hoa.dev.admin.BaseAdminServlet;
import hoa.dev.data.dao.DatabaseDao;
import hoa.dev.data.dao.UserDao;
import hoa.dev.data.model.User;

/**
 *
 * @author Admin
 */
public class IndexUserServlet extends BaseAdminServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        List<User> userList = userDao.findAll();
        
        request.setAttribute("userList", userList);
        request.getRequestDispatcher("admin/user/index.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}