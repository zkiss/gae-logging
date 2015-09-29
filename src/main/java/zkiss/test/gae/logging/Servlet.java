package zkiss.test.gae.logging;

import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class Servlet extends HttpServlet {

    private static final Logger jul = Logger.getLogger(Servlet.class.getName());
    private static final org.slf4j.Logger slf4j = LoggerFactory.getLogger(Servlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        jul.severe("jul severe");
        jul.warning("jul warning");
        jul.info("jul info");
        jul.fine("jul fine");
        jul.finer("jul finer");
        jul.finest("jul finest");

        slf4j.error("slf4j error");
        slf4j.warn("slf4j warn");
        slf4j.info("slf4j info");
        slf4j.debug("slf4j debug");
        slf4j.trace("slf4j trace");
    }
}
