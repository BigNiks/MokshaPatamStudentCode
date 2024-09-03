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

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {

        return 0;
    }

    public static int largeLad(int[][] ladders) {
        int biggest = ladders[0][0];
        for (int i = 0; i < ladders[0].length; i++) {
            for (int j = 0; j < ladders.length; j++) {
                if (ladders[i][j] > biggest) {
                    biggest = ladders[i][j];
                }
            }
        }
        return biggest;
    }

    public static int largeSnake(int[][] snakes) {
        int biggest = snakes[0][0];
        for (int i = 0; i < snakes[0].length; i++) {
            for (int j = 0; j < snakes.length; j++) {
                if (snakes[i][j] > biggest) {
                    biggest = snakes[i][j];
                }
            }
        }
        return biggest;
    }
}
