package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class OptimizedSolution {

    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int u = 0; u < 9; u++){
            for (int v = 0; v < 9; v++){

                char num = board[u][v];

                if (num != '.')
                    if (!seen.add(num + " in row " + u) ||
                        !seen.add(num + " in col " + v) ||
                        !seen.add(num + " in box " + u/3 + '-' + v/3)
                    ) return false;
            }
        }

        return true;
    }
}
