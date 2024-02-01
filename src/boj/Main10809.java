package boj;
// 알파벳 찾기
// https://www.acmicpc.net/status?user_id=e951219&problem_id=10809&from_mine=1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10809 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    // input
    String s = reader.readLine();
    // alphabet
    Character[] alphabet = {
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
      'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
      'w', 'x', 'y', 'z'
    };


    for (int i = 0; i < alphabet.length; i++) {
      System.out.print(String.format("%d ", s.indexOf(alphabet[i])));
    }
  }
}
