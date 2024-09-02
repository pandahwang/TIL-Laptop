package Web.React.Test.Test02;

public class LoginInterceptor implements HandlerInterceptor {
    @Override

    public boolean preHandle(HttpServletRequest request, 
                            HttpServletResponse response, 
                            Object handler)

            throws Exception {

        HttpSession session = request.getSession(false);

        UserDTO u = (UserDTO) session.getAttribute("user");

        if (u != null) {
            return true;
        } else {
            response.sendRedirect("/");
            return false;
        }

    }
}
