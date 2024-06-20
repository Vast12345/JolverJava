package com.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> WordLists = new ArrayList<>();
        WordLists.add("OneWord");
        WordLists.add("SecondWord");
        WordLists.add("Third Word");
        boolean playagain;

        int initialResponse = JOptionPane.showConfirmDialog(null, "Do you want to play the game?", "Hangman", JOptionPane.YES_NO_OPTION);
        if (initialResponse == JOptionPane.YES_OPTION) {
            do {
                try (Scanner sc = new Scanner(System.in)) {
                    String word = WordLists.get((int) (Math.random() * WordLists.size()));
                    String[] chara = word.split("");
                    ArrayList<String> charArray = new ArrayList<>(Arrays.asList(chara));
                    int charLength = charArray.size();
                    ArrayList<String> graphicDisplay = new ArrayList<>();
                    int accu = 0;

                    for(int i = 0; i < charLength; i++) {
                        graphicDisplay.add("_");
                    }

                    do {
                        System.out.println(graphicDisplay.toString());
                        if(charArray.equals(graphicDisplay)) {
                            System.out.println("Congratulations You've won!");
                            break;
                        } else {
                            String input = sc.nextLine();
                            if (input.length() > 1) {
                                System.out.println("Input must be one character");
                            } else if (graphicDisplay.contains(input)) {
                                System.out.println("Character already in word");

                            } else {
                                if (WordLists.contains(input)) {
                                    for (int j = 0; j < charArray.size(); j++) {
                                        if (charArray.get(j) == input) {
                                            graphicDisplay.set(j, input);
                                        }
                                    }
                                } else {
                                    System.out.println("Wrong letter!");
                                    accu++;
                                }
                            }
                        }
                    } while (accu >= 10);
                    sc.close();
                }
                int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play again?", JOptionPane.YES_NO_OPTION);
                playagain = (response == JOptionPane.YES_OPTION);
            } while (playagain);
        }
        System.out.println("Thank you for playing!");
    }
}