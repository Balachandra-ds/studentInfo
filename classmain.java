package studentInfo;

import java.util.*;
public class classmain {

    public static void main(String[] args) {
        student obj1 = new student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        obj1.name =sc.next();
        System.out.print("Enter your student id: ");
        obj1.studentId =sc.next();
        System.out.print("Enter your 4 subject marks ");
        for(int i =0 ;i<4;i++)
        {
            obj1.marks[i]= sc.nextInt();
        }
        sc.close();
        obj1.calResult(obj1);
        obj1.test(obj1);
        //String res=obj2.grade(p);
       // System.out.println(res);
    }
    
}
