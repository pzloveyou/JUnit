import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebFilter(value="/test",dispatcherTypes ={ DispatcherType.FORWARD,DispatcherType.REQUEST})
public class Testfiloe implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        String name = servletRequest.getParameter("text");
        String[] mn = new String[]{
                "草", "操", "妈", "志"};
        String names="";
            names= name.replace(mn[0], "*");

        servletResponse.getWriter().println(name);
        filterChain.doFilter(servletRequest, servletResponse);
    }



    @Override
    public void destroy() {
        System.out.println("结束");
    }
}
