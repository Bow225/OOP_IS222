package ooplab8;

import java.text.SimpleDateFormat;

public class PersonApp {
    public static void main(String[] args) {
       // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       // sdf = "20/12/1990";
        Student student = new Student("Boy Saiyai",
                "Male","20/12/1990",
                20,"STD0001","IS:MT");
        System.out.println(student.toString());


    }//main
}//class
