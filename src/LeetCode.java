import java.util.Hashtable;

public class LeetCode {
    public static void main(String[] args) throws Exception {
        int[][] points = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } };
        System.out.println(maxPoints(points));
    }

    public static int maxPoints(int[][] points) {
        Hashtable<Double, Integer> ht = new Hashtable<>();
        int slopeCount = 0;
        for (int i = 0; i < points.length - 1; i++) {
            // for (int j = i; j < points.length; j++) {
            // if (i != j) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];
            double slope;
            if (x2 - x1 != 0) {
                slope = (y2 - y1) / (x2 - x1);
            } else {
                slope = 1000.0;
            }
            if (ht.containsKey(slope)) {
                slopeCount = ht.get(slope);
            }
            ht.put(slope, slopeCount + 1);
            // }
            // }
        }
        System.out.println(ht);
        return 1;
    }
}
