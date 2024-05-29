package com.Registration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.Candidate.CandidateProfile;

public class CandidateRegistration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CandidateProfile candidateProfile = new CandidateProfile(
                request.getParameter("fName"),
                request.getParameter("mName"),
                request.getParameter("lName"),
                request.getParameter("emailId"),
                Long.parseLong(request.getParameter("mobileNo")),
                request.getParameter("password"),
                request.getParameter("employment"),
                request.getParameter("photo"), // You need to handle file uploads separately
                request.getParameter("collegeName"),
                request.getParameter("startYear"),
                request.getParameter("passYear"),
                Integer.parseInt(request.getParameter("marks")),
                request.getParameter("projectName"),
                request.getParameter("projectInfo"),
                request.getParameter("patent"),
                request.getParameter("profileSummary"),
                request.getParameter("linkedinLink"),
                request.getParameter("githubLink"),
                request.getParameter("gender"),
                request.getParameter("dateOfBirth"),
                request.getParameter("careerBreak"),
                request.getParameter("resume"),
                request.getParameter("address")
        );


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

//        entityManager.persist(person);
        entityManager.persist(candidateProfile);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();


        System.out.println(candidateProfile);
        response.sendRedirect("registration_success.html");
    }
}
