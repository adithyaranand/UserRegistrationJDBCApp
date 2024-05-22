package com.servlet.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String INSERT_QUERY = "INSERT INTO USER(NAME, CITY, MOBILE, DOB) VALUES(?, ?, ?, ?)";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        String name = req.getParameter("name");
        String city = req.getParameter("city");
        String mobile = req.getParameter("mobile");
        String dob = req.getParameter("dob");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            pw.println("Error loading JDBC Driver");
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "1234567890");
             PreparedStatement ps = con.prepareStatement(INSERT_QUERY)) {
            ps.setString(1, name);
            ps.setString(2, city);
            ps.setString(3, mobile);
            ps.setString(4, dob);

            int count = ps.executeUpdate();

            if (count == 0) {
                pw.println("Record not stored into database");
            } else {
                pw.println("Record Stored into Database");
            }
        } catch (SQLException se) {
            pw.println(se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            pw.println(e.getMessage());
            e.printStackTrace();
        }

        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
