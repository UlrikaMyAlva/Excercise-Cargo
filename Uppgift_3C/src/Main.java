import java.util.Scanner;

public class Main {

    /*
    AUTHOR
    Ulrika Eriksson, 2022-06-10

    INTRODUCTION
    A program that takes the size of a trucks' cargo area and tells you how many bags, of different sizes will fit,
    starting with packing the largest, then medium, then smallest.

    IMPLEMENTATION
    The user is asked for the trucks' cargo size in cm3. The value is stored in the class through a setter.
    The method named "Bags" takes the value, divides it with the big bags, and then stores that value. Then the cm3
    used for the big bags are subtracted from the cargo area. Then this repeats with the medium bags and the small bags.
    All the values are printed in the method.

    DISCUSSION
    In this exercise, my main struggle was how I would design this program. I wanted it to be easy to understand, but
    still as small as possible. If I made multiple methods, would I have to send the values back and forth between main
    and the class? So I decided to make one method that did it all: It took the size, divided it with the bag sizes and
    printed it as well. But I wasn't satisfied with this, because the main class looked really weird with only a setter
    for the truck size, then a method call and nothing more. So I decided to split them into three different methods
    depending on size. I was thinking, then it would be easier for the company if they only had for example big bags,
    to check how many big bags would fit in the truck by using only that method.

    I decided to keep the print function in the method, and use voids, instead of returning a value. I figured that
    you always want to print the result when you use the method, so it made sense to keep it in there.

    In this exercised I learned more about the limitations of int, and used long instead, because the program sometimes
    crashed when I used to big numbers.

    To improve the code, I would still want to make it easier to understand the code. Maybe by changing the names of the
    methods (amountBigBags?). Or make the printing in the main, I cannot really decide what would be the best for that.


     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Truck truck = new Truck();

        System.out.println("Please enter the cm3 area of the truck: ");
        truck.setTruckArea(scan.nextLong());

        //Methods that calculates how many bags fit in the truck.
        truck.bigBags();
        truck.mediumBags();
        truck.smallBags();


    }


}