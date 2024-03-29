package boj;// 상수
// https://www.acmicpc.net/problem/2908
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

    int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

    System.out.println(a > b ? a : b);
  }
}
