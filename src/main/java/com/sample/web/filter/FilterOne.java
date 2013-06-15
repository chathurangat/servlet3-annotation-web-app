package com.sample.web.filter;

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

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" inside the filter one ");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
       //releasing the resources
    }
}
