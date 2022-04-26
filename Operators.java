public class Operators {
    //1. Write a program to check whether a person can cast a vote or not. Condition is you must be above 18 years to vote.
    public static void main(String[] args) {
        int age = 11;
        if (age>18){
            System.out.println("your can vote");
        }

    }
}

//2. Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid.
class Si{
    public static void main(String[] args) {
        float pr,time,rate;
        pr = 10000;
        time = 3;
        rate=14;
        float SI = (pr*time*rate)/100;
        System.out.println(SI);
    }
}
class AreaOFTri{
    public static void main(String[] args) {
        float base , height;
        base = 45;
        height =95;
        float areaOFtriangle = (base*height)/2;
        System.out.println(areaOFtriangle);
    }
}
class VolOfCube{
    public static void main(String[] args) {
        float a = 20;
        float volOfCube = (a*a*a);
        System.out.println(volOfCube);
    }
}

class VolOfCuboid{
    public static void main(String[] args) {
        float l,b,h;
        l = 35;
        b=45;
        h=23;
        float volC = (l*b*h);
        System.out.println(volC);
    }
}

class TernaryV{
    public static void main(String[] args) {
        int age = 11;
        String eligibility;
//       ternary operator
        eligibility = (age >= 19)? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println(eligibility);
    }
}

/*4. Write a program to calculate the total marks of four subjects of a student and the total
percentage secured. And use following conditions to generate the final result;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail.*/

class Q4{
    public static void main(String[] args) {
        float sub1,sub2,sub3,sub4,total,percentage;
        sub1 = 89;
        sub2 = 67;
        sub3 = 77;
        sub4 = 81;
        total = (sub1+sub2+sub3+sub4);
        percentage = (total*100)/400;
        String grade;
        System.out.println("Total marks "+total);
        System.out.println("Percentage "+percentage);
        grade = (percentage>=70)? "First Class" : (percentage>=59 && percentage<70)? "Upper Second Class" : (percentage>=49 && percentage<59)? "Second Class" : (percentage>=39 && percentage<49)? "Third Class" : "Fail";
        System.out.println(grade);
    }
}


