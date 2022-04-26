import java.util.Scanner;
  /*Using switch statement Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B Percentage >= 70% : Grade C Percentage >= 60% : Grade D Percentage >= 40% : Grade E Percentage < 40% : Grade F*/

public class SwitchCase {
        public static void main(String[] args) {
            System.out.println("Enter your marks");
            Scanner scanner = new Scanner(System.in);
            float physics, chemistry, biology, mathematics, computer,total, percent;
            String grade;
            physics = scanner.nextFloat();
            chemistry = scanner.nextFloat();
            biology = scanner.nextFloat();
            mathematics = scanner.nextFloat();
            computer = scanner.nextFloat();
            total = physics+chemistry+biology+mathematics+computer;
            percent = (total*100)/500;
            System.out.println(percent+" percent");
            int percentage = (int) percent;
            switch (percentage/10){
                case 10:
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade C");
                    break;
                case 6:
                    System.out.println("Grade D");
                    break;
                case 5:
                case 4:
                    System.out.println("Grade E");
                    break;
                default:
                    System.out.println("Fail");
                    break;
            }
        }
    }

// JAVA Program to find the maximum between two numbers. Using the switch statement.
class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        switch((x>y)?0:1){
            case 0:
                System.out.println(x+" is greater");
                break;
            case 1:
                System.out.println(y+" is greater");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

//JAVA Program to find the maximum between three numbers. Using the switch statement.
class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int x,y,z;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
//        switch ((x>y)?0:(y>z)?0:1){
        switch ((x>y)?0:1){
            case 0:
                switch ((y>z)?0:1){
                    case 0:
                        System.out.println(x+" is the maximum number.");
                        break;
                    case 1:
                        System.out.println(z+" is the maximum number");
                        break;
                }
                break;

            case 1:
                switch ((y>z)?0:1){
                    case 0:
                        System.out.println(y+" is the maximum number");
                        break;
                    case 1:
                        System.out.println(z+" is the maximum number");
                        break;
                }
                break;
            default:
                System.out.println("Invalid");
                break;

        }
    }
}

//JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch statement.

class Ques4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scanner.nextInt();
        boolean remainder5 = x%5==0;
        boolean remainder11 = x%11==0;
        switch ((remainder5&&remainder11)?0:1) {
            case 0:
                System.out.println("Divisible");
                break;
            case 1:
                System.out.println("Indivisible");
                break;

        }

    }
}

//JAVA Program to check whether a year is a leap year or not. Using switch statement
class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        boolean remainder4= year%4==0;
        boolean remainder100 = year%100!=0;
        boolean remainder400 = year%400==0;

        switch ((remainder4 || remainder100 && remainder400)?0:1){
            case 0:
                System.out.println("Leap Year");
                break;
            case 1:
                System.out.println("Not a Leap Year");

        }
    }
}

//    JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class Ques6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        boolean chh=(ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        switch ((chh)?0:1){
            case 0:
                System.out.println("It is an alphabet");
                break;
            case 1:
                System.out.println("It is not an alphabet");
        }
    }
}

//    JAVA Program to take the value from the user as input any alphabet and check whether it is vowel or consonant. Using the switch statement.
class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        boolean chh = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        switch ((chh)?0:1){
            case 0:
                System.out.println("It is a vowel");
                break;
            case 1:
                System.out.println("It is a consonant");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}
/*JAVA Program to take the value from the user as input any character and check whether it is the alphabet, digit or special character. Using the switch statement.*/
class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        boolean alp = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        boolean digit = (ch>=0 && ch<=9);
        switch ((alp)?0:(digit)?1:2){
            case 0:
                System.out.println("It is an Alphabet");
                break;
            case 1:
                System.out.println("It is a digit");
                break;
            case 2:
                System.out.println("It is a special character");
        }
    }
}

//    JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the switch statement.
class Ques9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        boolean lower = (ch>='a' && ch<='z');
        switch ((lower)?0:1){
            case 0:
                System.out.println(ch+" is LowerCase");
                break;
            case 1:
                System.out.println(ch+" is UpperCase");
        }

    }
}
//    JAVA Program to take the value from the user as an input week number and print weekday by using the switch statement.
class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weekday");
        int day = scanner.nextInt();
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

class Ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month");
        System.out.println("Enter the year");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        boolean Month31 = (month == 1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12);
        boolean Month30 = (month==4 || month==6 || month==9 || month==11);
        boolean remainder4= year%4==0;
        boolean remainder100 = year%100!=0;
        boolean remainder400 = year%400==0;
        switch ((Month31)?0:(Month30)?1:2){
            case 0:
                System.out.println("The month has 31 days");
                break;
            case 1:
                System.out.println("The month has 30 days");
                break;
            case 2:
                switch ((remainder4 || remainder100 && remainder400)?0:1){
                    case 0:
                        System.out.println("The month has 29 days");
                        break;
                    case 1:
                        System.out.println("The month has 28 days");
                        break;
                }break;
        }
    }
}

//    JAVA Program to count the total number of notes in a given amount. Using the switch statement.
class Ques12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = scanner.nextInt();
        int totalNoOfNotes;
        boolean a = amount%5==0;
        switch ((a)?0:1){
            case 0:
                totalNoOfNotes = amount/5;
                System.out.println(totalNoOfNotes);
                break;
            case 1:
                System.out.println("Enter valid amount");
        }
    }
}

//    JAVA Program to take the value from the user as input all sides of a triangle and check whether the triangle is valid or not. Using switch statement/**/
class Ques13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        System.out.print("Enter the degree of second angle:: ");
        System.out.print("Enter the degree of second angle:: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}

/*
14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement
 */
class Quest14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        System.out.print("Enter the degree of second angle:: ");
        System.out.print("Enter the degree of second angle:: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }
}

//15

// JAVA Program to calculate profit or loss. Using switch statement.
class Ques16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost price and selling price");
        int costPrice, sellingPrice, statement;
        costPrice = scanner.nextInt();
        sellingPrice = scanner.nextInt();
        switch ((costPrice>sellingPrice)?0:1){
            case 0:
                System.out.println("Loss");
                break;
            case 1:
                System.out.println("Profit");
                break;
        }
    }
}

/*17. Using switch statement JAVA Program to take the value from the user as input marks of five
subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade according to the following:
 Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F, Using switch statement.*/

class Ques17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Physics");
        double physics = scanner.nextDouble();

        System.out.println("Enter marks for Chemistry");
        double chemistry = scanner.nextDouble();

        System.out.println("Enter marks for Biology");
        double biology = scanner.nextDouble();

        System.out.println("Enter marks for Mathematics");
        double mathematics = scanner.nextDouble();

        System.out.println("Enter marks for Computer");
        double computer = scanner.nextDouble();

        double total, percentage;
        total = physics +chemistry+biology+mathematics+computer;
        percentage = (total*100)/500;

        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+percentage);

        switch ((percentage>=90)?1:(percentage>=80 && percentage<90)?2:(percentage>=70 && percentage<80)?3:(percentage>=60 && percentage<70)?4:(percentage>=40 && percentage<60)?5:6){
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("Grade E");
                break;
            case 6:
                System.out.println("Fail");
                break;
        }

    }
}

class Ques18{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your Basic Salary");
        double salary = scanner.nextDouble();

        double HRA, DA;
        switch ((salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0){
            case 1:
                double grossSalary = salary+(0.2*salary)+(0.8*salary);
                System.out.println("Gross salary is "+grossSalary);
                break;
            case 2:
                double grossSalary1 = salary+(0.25*salary)+(0.9*salary);
                System.out.println("Gross salary is "+grossSalary1);
                break;
            case 3:
                double grossSalary2 = salary+(0.3*salary)+(0.95*salary);
                System.out.println("Gross salary is "+grossSalary2);
                break;
            case 0:
                System.out.println("Invalid");

        }
    }
}

/*19. JAVA Program to take the value from the user as input electricity unit charges and calculate
total electricity bill according to the given condition:
For the first 50 units Rs. 0.50/unit.............
For the next 100 units Rs. 0.75/unit.....
For the next 100 units Rs. 1.20/unit ...............
For unit above 250 Rs. 1.50/unit.........
An additional surcharge of 20% is added to the bill.......Using the switch statement.*/

class Ques19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the electricity unit charges:");
        double unit= scanner.nextDouble();
        double amount, sur, bill;

        switch ((unit<=50)?1:(unit<=150)?2:(unit<=250)?3:4) {
            case 1:
                amount = unit * 0.5;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("Total bill: " + bill);
            case 2:
                amount = 25 + (unit - 50) * 0.75;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("the total bill is" + bill);
                break;

            case 3:
                amount = 25 + 75 + (unit - 150) * 1.20;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("total bill is " + bill);
                break;

            case 4:
                amount = 25 + 75 + 150 + (unit - 250) * 1.50;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("total bill is " + bill);
                break;

            default:
                System.out.println("invalid");
        }
    }
}

/* Write a program that determines a student’s grade. The program will read three types of scores (quiz, mid-term, and final scores)
and determine the grade based on the following rules:
if the average score =90% =>grade=A.......................-
if the average score >= 70% and <90% => grade=B........................-
if the average score>=50% and <70% =>grade=C..........................-
if the average score<50% =>grade=F*/

class Ques20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quiz marks:");
        double quizMarks = scanner.nextDouble();

        System.out.println("Enter the mid-term marks:");
        double mid_term = scanner.nextDouble();

        System.out.println("Enter your final Score:");
        double finals = scanner.nextDouble();

        double avg=(quizMarks+mid_term+finals)/3;
        System.out.println("the average is "+avg);

        switch ((avg>=90)? 1:(avg>=70&& avg<90)? 2:(avg>=50&& avg<70)?3:4){
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*Program to take the hours and minutes as input by the user and the show that whether it is AM or PM by using the switch statement.*/
/*
class Ques21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hour");
        double hours = scanner.nextDouble();

        System.out.println("Enter the minute");
        double minute =scanner.nextDouble();

        double
    }
}*/
