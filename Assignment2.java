import java.util.Scanner;

//1. Write a JAVA program to find maximum between two numbers.
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two number");
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else {
            System.out.println(b+" is greater than "+a);
        }
    }
}

//2. Write a JAVA program to find maximum between three numbers.
class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three number");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a>b && a>c) {
            System.out.println(a + " is the maximum number");
        }else if(b>a && b>c){
            System.out.println(b+" is the maximum number");
        }else{
            System.out.println(c+" is the maximum number");
        }

    }
}

//3. Write a JAVA program to check whether a number is negative, positive or zero.
class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        long a;
        a = scanner.nextInt();
        if(a<0){
            System.out.println("number is negative");
        } else if(a==0){
            System.out.println("number is zero");
        }else{
            System.out.println("number is positive");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class Div {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a;
        a = scanner.nextInt();
        if (a%5==0 && a%11==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible");
        }
    }
}

//5. Write a JAVA program to check whether a number is even or odd.
class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a;
        a = scanner.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class Leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = scanner.nextInt();
        boolean leap = false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    leap = true;
                }else {
                    leap = false;
                }

            }else {
                leap=true;
            }

        }else {
            leap = false;
        }
        if (leap==true){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }

    }
}
// 7. Write a JAVA program to check whether a character is alphabet or not.
class Alphabet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Alphabet");

        }else {
            System.out.println("Not an Alphabet|");
        }
    }
}

//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class AlphabetV{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        if( ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Vowel");
        }else {
            System.out.println("Not a Vowel");
        }
    }
}

//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special character.
class Character{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Alphabet");
        }else if(ch>=0 && ch<9){
            System.out.println("Digit");

        }else {
            System.out.println("Special Character");
        }
    }
}
//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class Lower{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }else{
            System.out.println("Not an alphabet");
        }
    }
}

//11. Write a JAVA program to input week number and print weekday.
class Week{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the week number");
        int weekNum = scanner.nextInt();
        if(weekNum==1){
            System.out.println("Sunday");
        }else if (weekNum==2){
            System.out.println("Monday");
        }else if (weekNum==3){
            System.out.println("Tuesday");
        }else if (weekNum==4){
            System.out.println("Wednesday");
        }else if (weekNum==5){
            System.out.println("Thursday");
        }else if (weekNum==6){
            System.out.println("Friday");
        }else if (weekNum==7){
            System.out.println("Saturday");
        }else {
            System.out.println("not available");
        }

    }
}

//12. Write a JAVA program to input month number and print number of days in that month.
/*class Month{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        System.out.println("Enter the year");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if(month == 1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 Days");
        }else if (month==4 || month==6 || month==9 || month==11){
            System.out.println("30 Days");
        }else if (month==2) {
            if (year % 4 == 0 && year!=100 || year%400) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }

        }
       else{
            System.out.println("Not available");
        }

    }
}*/

//13. Write a JAVA program to count total number of notes in given amount.
class Note{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = scanner.nextInt();
        int totalNoOfNotes;
        if (amount%5==0){
            totalNoOfNotes = amount/5;
            System.out.println(totalNoOfNotes);
        }else {
            System.out.println("You must enter valid figures");
        }
    }
}
//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
//the 3 angle should equal to 180
class Angle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 angle");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        int total = angle1+angle2+angle3;
        if(total==180 && angle1!=0 && angle2!=0 && angle3!=0){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
}

/*15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
A triangle is valid if sum of its two sides is greater than the third side. If three sides are a, b and c, then three conditions should be met.
1.a + b > c
2.a + c > b
3.b + c > a */

class Sides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 sides");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a1 = a+b ;
        int b1 = b+c;
        int c1 = a+c ;
        if (a1>c && b1>a && c1>b){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}

//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.

//17. Write a JAVA program to find all roots of a quadratic equation.
class Type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstRoot = 0 , secondRoot = 0;
        System.out.println("Enter the value of b ::");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b ::");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c ::");
        double c = scanner.nextDouble();

        double determinant = (b*b) - (4*a*c);
        double sqrt = Math.sqrt(determinant);
        if (determinant>0){
            firstRoot = (-b +sqrt)/(2*a);
            secondRoot = (-b - sqrt)/(2*a);
            System.out.println("Root are :: "+firstRoot+ " and "+secondRoot);
        }else if (determinant==0){
            System.out.println("Root is :: "+(-b)/(2*a));
        }

        }
    }

//18. Write a JAVA program to calculate profit or loss.
class PL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost price and selling price");
        float costPrice, sellingPrice, PL;
        costPrice = scanner.nextFloat();
        sellingPrice = scanner.nextFloat();
        PL = costPrice-sellingPrice;
        if (PL>0){
            System.out.println("Loss");
        }else {
            System.out.println("Profit");
        }

    }
}

class Salary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basicSalary = scanner.nextInt();
        if (basicSalary<=10000){

        }
    }
}


/*21. Write a JAVA program to input electricity unit charges and calculate total electricity bill
according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/

class Electricity{
    public static void main(String[] args) {
        int units;
        double amount, sur_charge, total_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of units");
        units = scanner.nextInt();
        if (units<=50){
            amount = units*0.5;
            sur_charge = 0.2 *amount;
        }
        else if (units<=150){
            amount = 25+ ((units-50)*75);
            sur_charge = 0.2 *amount;
        }else if (units<=250){
            amount = 25 +75 + ((units -150) * 1.20);
            sur_charge = 0.2 *amount;
        }
        else {
            amount = 25 +75 +120 + ((units -250 ) * 1.50);
            sur_charge = 0.2 * amount;
        }
        total_amount = amount +sur_charge;
        System.out.println("\n Electricity Bill = "+total_amount);
    }
}