public class Houses {
    void  a(){
        System.out.println("there are 4 houses");
    }
}
class Venus extends Houses{
    void  a() {
        super.a();
        System.out.println("Venus");
    }

}
class Uranus extends Houses {
    void  a(){
        System.out.println("Uranus");
    }
}
class Saturn extends Houses {
    void  a(){
        System.out.println("Saturn");
    }
}
class Mars extends Houses {
    void  a(){
        System.out.println("Mars");
    }
}
class Test{
    public static void main(String[] args) {
        Venus v=new Venus();
        Uranus u=new Uranus();
        Saturn s=new Saturn();
        Mars m=new Mars();
        v.a();
        u.a();
        s.a();
        m.a();
    }
}
