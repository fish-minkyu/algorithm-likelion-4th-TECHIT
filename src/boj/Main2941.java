package boj;// 크로아티아 알파벳
// https://www.acmicpc.net/problem/2941
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2941 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    String input = reader.readLine();
    String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj","s=", "z="};

    for (String val : croatiaAlphabet) {
      input = input.replace(val, "A");
    }

    System.out.println(input.length());
  }
}
