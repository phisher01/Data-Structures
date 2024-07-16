public class Object{
 public static void main(String args[]){
    Pen p1=new Pen();
    p1.color="Blue";
    System.out.print(p1.color);
    p1.setcolor("yellow");
    System.out.print(p1.color);
 }
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
class Student {
    int height;
    int cgpa;
    String name;
}