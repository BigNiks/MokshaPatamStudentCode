import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Niko Madriz
 *
 */

public class MokshaPatam {
    private static Queue<Integer> queue = new LinkedList<>();
    private static int currentNode;
    private static int[] checkLad;
    private static int[] checkSnake;
    private static int[] numRolls;
    private static int node;
    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        checkLad = new int[boardsize + 1];
        checkSnake = new int[boardsize + 1];
        numRolls = new int[boardsize + 1];
        for (int i = 0; i < ladders.length; i++) {
            checkLad[ladders[i][0]] = ladders[i][1];
        }

        for (int i = 0; i < snakes.length; i++) {
            checkSnake[snakes[i][0]] = snakes[i][1];
        }

        queue.add(1);

        while (!queue.isEmpty()) {
            currentNode = (int) queue.remove();
            if (currentNode == boardsize) {
                return numRolls[currentNode];
            }
            for (int k = 1; k < 7; k++) {
                node = currentNode + k;
                if (node <= boardsize) {
                    if (checkLad[node] != 0) {
                        node = checkLad[node];
                    }
                    if (checkSnake[node] != 0) {
                        node = checkSnake[node];
                    }
                    if (numRolls[node] == 0) {
                        numRolls[node] += numRolls[currentNode] + 1;
                        queue.add(node);
                    }
                }
            }
        }
        return -1;
    }


}
