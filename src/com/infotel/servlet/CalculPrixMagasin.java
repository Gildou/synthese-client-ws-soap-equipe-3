package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.Magasin;
import com.infotel.wssoap.MagasinSoapService;
import com.infotel.wssoap.MagasinSoapServiceProxy;

/**
 * Servlet implementation class CalculPrixMagasin
 */
@WebServlet("/CalculPrixMagasin")
public class CalculPrixMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculPrixMagasin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MagasinSoapService mag = new MagasinSoapServiceProxy();
		
		Magasin magasin = new Magasin();
		
		int idMagasin = 0;
		idMagasin = Integer.parseInt(request.getParameter("idMagasin"));
		magasin = mag.getMagasin(idMagasin);
		
		request.setAttribute("magasins",mag.getAllMagasin());
		request.setAttribute("prixMagasin",mag.calculPrixMagasin(idMagasin));
		
		// 4 - Envoi a la JSP
		request.getRequestDispatcher("calculPrixMagasin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
