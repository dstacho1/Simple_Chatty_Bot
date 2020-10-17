import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        ArrayList<String> input = new ArrayList<>();
        String oneIn;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            oneIn = scanner.next();
            if (oneIn.equals("") | oneIn.equals("end"))
                break;
            input.add(oneIn);
        }
        for (int i = 0; i < input.size(); i++)
            System.out.println(input.get(i));
    }
}