package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.MagasinSoapService;
import com.infotel.wssoap.MagasinSoapServiceProxy;

/**
 * Servlet implementation class SupprimerMagasin
 */
@WebServlet("/SupprimerMagasin")
public class SupprimerMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerMagasin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MagasinSoapService mag = new MagasinSoapServiceProxy();
		
		long idMagasin = Long.parseLong(request.getParameter("idMagasin"));
		//Personne p = services.getPersonne(Integer.parseInt(request.getParameter("idPersonne")));
		//services.supprimerPersonne(p);
		mag.supprimerMagasin(idMagasin);
		// 3 - Preparation a l'envoi à JSP
		request.setAttribute("magasins",mag.getAllMagasin());
				
		// 4 - Envoi a la JSP
		request.getRequestDispatcher("supprimerMagasin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
