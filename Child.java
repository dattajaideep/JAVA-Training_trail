public class Child extends Parent {
    int c = 5;
    public Child(int c){
        super(c);
        this.c = c;
    }
    public void show(){
        System.out.println("in child class");

    }
    public void addition(){
        System.out.println(p+c);
    }
}
