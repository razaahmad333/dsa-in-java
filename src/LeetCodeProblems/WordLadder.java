package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class WordLadder {
    public static void main(String[] args) {
        // String[] wordlist = { "hot", "dot", "dog", "lot", "log", "cog" };
        List<String> wordList = new ArrayList<String>();

        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("lot");
        wordList.add("cog");

        boolean[] visited = new boolean[wordList.size()];

        for (int k = 0; k < wordList.size(); k++) {
            visited[k] = false;
        }

        String beginWord = "hit";
        String endWord = "cog";
        double count = 1;
        String currentWord = beginWord;
        if (!wordList.contains(endWord)) {
            // return count;
            System.out.println(count);
        }

        for (int i = 0; i < 2 * wordList.size(); i++) {
            currentWord = getMatchingString(wordList, currentWord, visited);
            if (currentWord == ".") {
                // return 0;

            } else {

                System.out.println(currentWord);
                count++;
                if (currentWord == endWord) {
                    break;
                }
            }
        }

        System.out.println(count);

        System.out.println(compareTwoStrings("hop", "hit"));
    }

    private static String getMatchingString(List<String> wordlist, String currentWord, boolean[] visited) {
        for (int j = 0; j < wordlist.size(); j++) {
            if (visited[j]) {
                continue;
            }

            String word = wordlist.get(j).toString();
            char ch = compareTwoStrings(currentWord, word);
            if (ch != '.') {
                visited[j] = true;
                return word;
            }
        }

        return ".";
    }

    private static char compareTwoStrings(String str1, String str2) {
        int count = 0;
        char ch = '.';
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                ch = str2.charAt(i);
            }
        }
        if (count == 1) {
            return ch;
        } else {
            return '.';
        }
    }
}
