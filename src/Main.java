import java.util.*;
class  Student   {
    String name;
    int roll_no;
}
class Ans {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
        Student obj = new Student();
        obj.name = in.next();
        obj.roll_no=in.nextInt();
        System.out.println(obj.name +" "+obj.roll_no);
    }
}