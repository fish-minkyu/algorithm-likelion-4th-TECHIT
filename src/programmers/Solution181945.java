package programmers;// 문자열 돌리기
// https://school.programmers.co.kr/learn/courses/30/lessons/181945
import java.util.Scanner;

public class Solution181945 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();

    for (int i = 0; i < a.length(); i++) {
      System.out.println(a.charAt(i));
    }
  }
}