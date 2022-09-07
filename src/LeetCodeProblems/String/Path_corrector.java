package LeetCodeProblems.String;

public class Path_corrector {
    public static void main(String[] args) {
        String path = "/home//food/";
        System.out.println(simplyPath(path));
    }

    static String simplyPath(String path) {
        int slashC = 0;
        int dotC = 0;
        int dir = 0;
        StringBuilder newPath = new StringBuilder();
        for (int i = 0; i < path.length(); i++) {

            if (slashC == 1) {
                dir++;
            }

            if (path.charAt(i) == '/') {

                slashC++;
            } else {
                slashC = 0;
            }

            if (path.charAt(i) == '.') {
                dotC++;
            } else {
                dotC = 0;
            }

            // '/ahmad/../'
            if (dotC == 2) {

            }

            if ((i == path.length() - 1 ? slashC == 0 : slashC <= 2)) {
                newPath.append(path.charAt(i));
            }

        }

        System.out.println(dir);
        return newPath.toString();
    }
}
