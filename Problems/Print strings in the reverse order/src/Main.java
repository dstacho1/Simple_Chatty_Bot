//put imports you need here

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            arr.add(input);
        }
        scanner.close();

        for (int i = arr.size()-1; i >= 0; i--){
            System.out.println(arr.get(i));
        }
    }
}