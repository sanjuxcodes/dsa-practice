import java.util.*;

public class bomb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<int[]> bombs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            bombs.add(new int[]{x, y});
        }

        // Step 1: Find starting bomb (min x, then min y)
        int startIndex = 0;
        for (int i = 1; i < n; i++) {
            int[] curr = bombs.get(i);
            int[] best = bombs.get(startIndex);

            if (curr[0] < best[0] || (curr[0] == best[0] && curr[1] < best[1])) {
                startIndex = i;
            }
        }

        boolean[] visited = new boolean[n];
        visited[startIndex] = true;

        int currX = bombs.get(startIndex)[0];
        int currY = bombs.get(startIndex)[1];

        double totalDistance = 0;

        // Step 2: Visit remaining bombs
        for (int count = 1; count < n; count++) {

            int nextIndex = -1;
            int minDistSq = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    int dx = bombs.get(i)[0] - currX;
                    int dy = bombs.get(i)[1] - currY;

                    int distSq = dx * dx + dy * dy;

                    if (distSq < minDistSq) {
                        minDistSq = distSq;
                        nextIndex = i;
                    } else if (distSq == minDistSq) {
                        // tie-breaker: leftmost, then topmost
                        int[] a = bombs.get(i);
                        int[] b = bombs.get(nextIndex);

                        if (a[0] < b[0] || (a[0] == b[0] && a[1] < b[1])) {
                            nextIndex = i;
                        }
                    }
                }
            }

            // Move to next bomb
            int nextX = bombs.get(nextIndex)[0];
            int nextY = bombs.get(nextIndex)[1];

            totalDistance += Math.sqrt(minDistSq);

            currX = nextX;
            currY = nextY;
            visited[nextIndex] = true;
        }

        // Final answer
        System.out.println((int) Math.ceil(totalDistance));
    }
}