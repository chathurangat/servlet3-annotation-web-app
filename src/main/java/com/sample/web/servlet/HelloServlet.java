package com.sample.web.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *     you can see that we can pass init param for the servlet through the annotations.
 * </p>
 */
@WebServlet(
        name = "hello",
        urlPatterns = {"/hello"},
        initParams = {
                @WebInitParam(name = "username",value = "chathuranga"),
                @WebInitParam(name = "email",value = "chathuranga.t@gmail.com")
        },
        loadOnStartup = 1
)
public class HelloServlet extends HttpServlet{

    private static final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info(" this servlet will be executed after executing the all relevant filters according to their order ");
        response.setContentType("text/plain");
        response.getWriter().write(" Welcome to Servlet Annotation with Servlet 3");
    }
}
