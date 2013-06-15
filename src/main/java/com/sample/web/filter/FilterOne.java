package com.sample.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * <p>
 *     filter execution order has been defined in the web.xml file
 * </p>
 */
@WebFilter(
        filterName = "helloFilterOne",
        urlPatterns = {"/hello"}

)
public class FilterOne implements Filter{

    private FilterConfig filterConfig;
    private static final Logger logger = LoggerFactory.getLogger(FilterOne.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(" inside the filter one ");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
       //releasing the resources
    }
}
