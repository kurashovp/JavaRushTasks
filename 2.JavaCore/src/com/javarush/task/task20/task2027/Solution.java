package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same").forEach(System.out::println);
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                for (String word : words) {
                    if (word.length() > 1) {
                        for (Direction direction : Direction.values()) {
                            char[] buffer = new char[word.length()];
                            for (int k = 0; k < word.length()
                                    && j + direction.getJ() * k >= 0
                                    && j + direction.getJ() * k < crossword[i].length
                                    && i + direction.getI() * k >= 0
                                    && i + direction.getI() * k < crossword.length; k++) {
                                buffer[k] = (char) crossword[i + k * direction.getI()][j + direction.getJ() * k];
                            }
                            if (String.valueOf(buffer).equals(word)) {
                                Word detectedWord = new Word(word);
                                detectedWord.setStartPoint(j, i);
                                detectedWord.setEndPoint(j + direction.getJ() * (word.length() - 1), i + direction.getI() * (word.length() - 1));
                                result.add(detectedWord);
                            }
                        }
                    } else if (word.length() == 1 && crossword[i][j] == word.charAt(0)) {
                        Word detectedWord = new Word(word);
                        detectedWord.setStartPoint(j, i);
                        detectedWord.setEndPoint(j, i);
                        result.add(detectedWord);
                    }
                }
            }
        }
        return result;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
