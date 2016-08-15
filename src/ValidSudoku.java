import java.util.HashSet;

/**
 * Created by lld on 16/8/14.
 */
public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i ++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (set.contains(board[i][j]) == true) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {

                if (board[j][i] == '.') {
                    continue;
                } else {
                    if (set.contains(board[j][i]) == true) {
                        return false;
                    } else {
                        set.add(board[j][i]);
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[0].length; j = j + 3) {
                HashSet<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i + k][j + l] == '.') {
                            continue;
                        } else {
                            if (set.contains(board[i + k][j + l])) {
                                return false;
                            } else {
                                set.add(board[i + k][j + l]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] array = {"..4...63.".toCharArray(),".........".toCharArray(),"5......9.".toCharArray(),"...56....".toCharArray(),"4.3.....1".toCharArray(),"...7.....".toCharArray(),"...5.....".toCharArray(),".........".toCharArray(),".........".toCharArray()};
        for (int i = 0; i < array.length; i ++) {
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf(array[i][j] + " ");
            }
        }
        System.out.println(isValidSudoku(array));
    }
}
