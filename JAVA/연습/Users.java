package 연습;
public class Users {
    Users(){
        String name ="";
        for(int i=0; i<5; i++){
            name += (char)Math.round(Math.random()*100+1);
        }
        this.setUsername(name);
        this.setPassword("1234");
        this.setEmail(name+"@gmail.com");
    }

    private Long id;
    private String username;
    private String password;
    private String email;

    public Long getid(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
