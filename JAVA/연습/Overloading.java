package 연습;
public class Overloading {
    public static void main(String[] args) {
        Child c = new Child(2, 4, 6);
        System.out.println(c.add());
    }
}

 class Parent { // extends Object
    int x;
    int y;
    Parent(){}              // 기본 생성자
    Parent(int x, int y){   // 생성자
        // super(); Object의 멤버를 초기화
        this.x = x;
        this.y = y;
    }

    public String add (){   // 메서드
        return "x =" + x + ", y = " + y;
    }
 }
    class Child extends Parent {
        int z;
        Child(){}                   // 기본 생성자
        Child(int x, int y, int z){ // 생성자
            super(x, y);            // Parent의 생성자를 호출
            this.z = z;
        }
        public String add(){             // 오버라이딩.
        return "x =" + x + ", y = " + y + ", z = " + z;
        }
    }




    class Parent { // extends Object
    int x;
    int y;
    }
    class Child extends Parent {
        int z = 30;
        super.x = 10;
        super.y = 20;
    }
