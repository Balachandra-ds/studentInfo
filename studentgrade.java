package studentInfo;

public class studentgrade {


     String grade(int x){
        if(x<1 && x>100){
            return "INVALID PERCENTAGE";
        }
        if(x>=80 && x<101){
            return "DISTINCTION";
        }
        else if(x>=60 && x<80){
            return "FIRST CLASS";
        }
        else if(x>=40 && x<60){
            return "SECOND CLASS";
        }
        else if(x>=30 && x<40){
            return "PASS";
        }
        else {
            return "FAIL";
        }
    }
    
}
