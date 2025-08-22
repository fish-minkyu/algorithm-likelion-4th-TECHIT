package boj;

// BOJ 문제풀이 템플릿
// : 클래스명부터 input까지 통째로 외워두기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bojDefault {
  public static void main(String[] args) throws IOException { // IOException는 문제를 풀다가 잘못 입력했을 경우를 대비한 오류다.
    // 어떤 입력에 대하여 버퍼링 기능 제공(한 번에 많은 데이터를 읽게 들이는 클래스)
    // 가장 빠르게 입력 받을 수 있는 방법
    BufferedReader reader
      = new BufferedReader(new InputStreamReader(System.in));
    // readLine을 통해 한줄 입력 받기
    String input = reader.readLine(); // 여러 줄의 복수입력이 들어오면 readline을 여러 번 쓰면 된다.
    // ------------------------------------------------------------

  }
}
