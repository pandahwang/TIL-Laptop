package 연습;

public class Ex_RandomName {
    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Users users = new Users();
            System.out.println(users.getUsername());
        }
    }
}
