package boj;

// 꼬마 정민
// https://www.acmicpc.net/problem/11382
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11382 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split(" ");
    long A = Long.parseLong(input[0]);
    long B = Long.parseLong(input[1]);
    long C = Long.parseLong(input[2]);

    System.out.println(A + B + C);
  }
}
