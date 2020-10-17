//put imports you need here

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here


        String name, age, edu, exp, cusine;

        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        age = scanner.next();
        edu = scanner.next();
        exp = scanner.next();
        cusine = scanner.next();

        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.", name, cusine);


    }
}

