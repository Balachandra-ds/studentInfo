package studentInfo;

public class student {
    String studentId;
    String name;
    //int percentage;
    int[] marks = new int[4];

    studentgrade obj1=new studentgrade();

    public void calResult(student ob)
    {
        
        int total = ob.marks[0] +ob.marks[1]+ob.marks[2]+ob.marks[3];
        int percentage = total/4;
       
        System.out.println("Hi "+ ob.name +" ");
        System.out.println("The total and percentage is "+total+" and " + percentage+"%");
        String s=obj1.grade(percentage);
        System.out.println(s);
        //return percentage;
    }

    public void test (student ob)
    {
        int total = ob.marks[0] +ob.marks[1]+ob.marks[2]+ob.marks[3];
        int percentage = total/4;

        if(percentage>100)
        {
            System.out.println("percentage error");
        }
        else{
            System.out.println("Its working fine");
        }

        if(total>400)
        {
            System.out.println("total error");
        }
        else{
            System.out.println("Its working fine");
        }
    }


}