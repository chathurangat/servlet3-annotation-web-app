package com.sample.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * <p>
 *     you can see that the filter name and url patters  are defined with annotations.
 * </p>
 */
@WebFilter(
        filterName = "helloFilterTwo",
        urlPatterns = {"/hello"}

)
public class FilterTwo implements Filter {

    private FilterConfig filterConfig;
    private static final Logger logger = LoggerFactory.getLogger(FilterTwo.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(" inside the filter two ");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        //releasing the resources
    }
}