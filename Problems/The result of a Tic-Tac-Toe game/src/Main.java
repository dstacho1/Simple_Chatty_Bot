import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // put your code here
        ArrayList<Character> tictactoe = new ArrayList<Character>();
        tictactoe.add('O');
        tictactoe.add('X');
        tictactoe.add('X');
        tictactoe.add('O');
        tictactoe.add('X');
        tictactoe.add('O');
        tictactoe.add('X');
        tictactoe.add('O');
        tictactoe.add('X');

        for (int i = 1; i <= 9; i++){
            System.out.print(tictactoe.get(i-1));
            if (i % 3 != 0){
                System.out.print(' ');
            }else{
                System.out.print("\n");
            }
        }
    }
}