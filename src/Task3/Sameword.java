package Task3;

import java.util.Scanner;
public class Sameword {
    public static void main(String[] args) {

        System.out.print("введите первое слово: ");
        Scanner sc1 = new Scanner(System.in);
        String word1 = sc1.next();

        System.out.print("введите второе слово: ");
        Scanner sc2 = new Scanner(System.in);
        String word2 = sc2.next();

        if(word1.equals(word2)){
            System.out.print("отлично! слова совпадают");
        }else if(word1.equalsIgnoreCase(word2)){
            System.out.print("хорошо. почти одинаковы");
        }else if(word1.length()==word2.length()){
            System.out.print("ну, хотя бы длина одинаковая");
        }else System.out.print("слова разные");
    }
}