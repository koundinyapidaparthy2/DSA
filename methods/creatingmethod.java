package methods;

public class creatingmethod {
    static void Hello(){
        System.out.println("Hello world");
    }
    public void HelloPublicMethod(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        Hello();
        creatingmethod myObj = new creatingmethod();
        myObj.HelloPublicMethod();
    }
}
