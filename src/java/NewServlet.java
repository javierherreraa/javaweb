/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pais;
import modelo.Traduccion;

/**
 *
 * @author Sebastian :3
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    
    Pais pais = new Pais();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1> Nombre del pais</h1>");
            if(request.getParameter("resp")== "angola"){
                out.println("Nombre del Pais:  "+pais.buscarNombre("angola"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("angola"));
                out.println("Gentilicio:  "+pais.buscarGentilico("angola"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("angola"));
            }else if(request.getParameter("resp")=="senagal"){
                out.println("Nombre del Pais:  "+pais.buscarNombre("senagal"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("senagal"));
                out.println("Gentilicio:  "+pais.buscarGentilico("senagal"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("senagal"));
            }else if(request.getParameter("resp")=="ghana"){
                out.println("Nombre del Pais:  "+pais.buscarNombre("ghana"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("ghana"));
                out.println("Gentilicio:  "+pais.buscarGentilico("ghana"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("ghana"));
            }else if(request.getParameter("resp")=="kenia"){
                out.println("Nombre del Pais:  "+pais.buscarNombre("kenia"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("kenia"));
                out.println("Gentilicio:  "+pais.buscarGentilico("kenia"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("kenia"));
            }else if(request.getParameter("resp")=="mali"){
                out.println("Nombre del Pais:  "+pais.buscarNombre("mali"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("mali"));
                out.println("Gentilicio:  "+pais.buscarGentilico("mali"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("mali"));
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
