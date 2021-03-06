package controller;

import model.Burger;
import model.DaoFactoryI;
import model.Soda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    // we want to display our 'home page' using this servlet, when someone loads
    //  'http://localhost:8080/'


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // This will be the page we access when we hit 'http://localhost:8080/ - without any URL patterns to recognize

//         Get all of the existing  burgers, and list them here with the links to their individual profile pages
        List<Burger> allBurgers = new ArrayList<>();
        allBurgers.add(DaoFactoryI.getBurgersDao().findById(1L));// BigMac
        allBurgers.add(DaoFactoryI.getBurgersDao().findById(2L));//homestyle
        allBurgers.add(DaoFactoryI.getBurgersDao().findById(3L));// QuarterPounder

        req.setAttribute("allBurgers", allBurgers);//sending our list<Burgers as the attribute "allBurgers:

//        Get all of the list of all oue existing sodas
 //        add a new attribute called "allSodas"
        List<Soda> allSodas = new ArrayList<>();
        allSodas.add(DaoFactoryI.getSodasDao().findById(1L)); //coca cola
        allSodas.add(DaoFactoryI.getSodasDao().findById(2L));//drPepper
        allSodas.add(DaoFactoryI.getSodasDao().findById(3L)); //sprite

        req.setAttribute("allSodas", allSodas);//sending our list<Burgers as the attribute "allBurgers:

        // TODO: After printing our simple message, let's step up our game and print out some awesome HTML instead, by utilizing some templates!
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        // the path is relative to our 'webapp' folder

    }
}