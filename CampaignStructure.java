/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author thucnt
 */
public class CampaignStructure extends HttpServlet {

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
        
//        JSONObject json = new JSONObject();
	
//        Map<String, Long> map = new HashMap<String, Long>();
//        map.put("totals", 1L);
//        json.accumulateAll(map);
       
//	Map<String,String> trials = new HashMap<String,String>();
//	trials.put("productid","1");
//	trials.put("productname","Option");
//        List<Map<String,String>> list = new ArrayList<>();
//        list.add(trials);
//		
//	json.accumulate("rows", list);
        
        
        JSONObject json      = new JSONObject();
        JSONArray  trialList = new JSONArray();
        JSONObject trial;
            try
            {
               int count = 3;

               for (int i=4 ; i <= (3 +count) ; i++)
               {
                   trial = new JSONObject();
              
                   trial.put("trialid", "" + i);
                   trial.put("trialname", "Trial Name " + i);
                   
                   trialList.add(trial);
               }
               json.put("rows", trialList);
            }
            catch (Exception jse)
            { 
                System.out.println(jse.getMessage());
            }
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
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
        processRequest(request, response);
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
