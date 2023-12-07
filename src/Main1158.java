// 요세푸스 문제
// https://www.acmicpc.net/problem/1158
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main1158 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    String input = reader.readLine();
    Integer N = Integer.parseInt(input.split(" ")[0]);
    Integer K = Integer.parseInt(input.split(" ")[1]);

    // 큐 만들기
    Queue<Integer> queue = new LinkedList<>();
    // 1 ~ N번까지 큐 넣기
    for (int i = 0; i < N; i++) {
      queue.offer(i+1);
    }

    int count = 1;
    String result = "";
    while (true) {
      if (queue.isEmpty()) break;
      int temp = queue.peek();
      queue.poll();
      queue.offer(temp);
      count++;
      if (count == K) {
        result += temp + ", ";
        System.out.println(result);
        count = 1;
      }
    }

  }
}
