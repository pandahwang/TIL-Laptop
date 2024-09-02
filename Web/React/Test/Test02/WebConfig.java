package Web.React.Test.Test02;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginInterceptor())

                .addPathPatterns("/user/mypage", "/user/modify", "/user/remove", "user/allUser");

    }
}
