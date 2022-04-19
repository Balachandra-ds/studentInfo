public class student {
    String studentId;
    String name;
    int marks[];

    public void calResult(student ob)
    {
        int total = ob.marks[0] +ob.marks[1]+ob.marks[2]+ob.marks[3];
        int percentage = total/4;
        System.out.println("The total and percentage is "+total+" and " + percentage);
    }


}