public class Books {
    public String books(){
        return "total = 100";
    }
}
class Storybooks extends Books{
    public String books(){
        System.out.println(super.books());
        return "storybooks = 50";
    }
}
class Educationalbooks extends Books{
    public String books(){
        return "educational books = 30";
    }
}
class Religiousbooks extends Books{
    public String books(){
        return "religious books = 20";
    }
}
class Testbooks{
    public static void main(String[] args) {
        Storybooks s = new Storybooks();
        Educationalbooks e = new Educationalbooks();
        Religiousbooks r = new Religiousbooks();
        System.out.println(s.books());
        System.out.println(e.books());
        System.out.println(r.books());
    }
}