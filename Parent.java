public class Parent {
    protected int p = 22;
    public Parent(){
        System.out.println("i parent non paramaterised constructor");
    }
    public Parent(int p){
        System.out.println("in parent paramertrised ");
        this.p = p;
    }
    public void show() {
        p = 10;
        System.out.println("in parent class");
    }
}
