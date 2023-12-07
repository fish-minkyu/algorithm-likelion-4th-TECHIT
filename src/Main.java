import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    // 스택
    Stack<Character> wording = new Stack<>();

    int goodWords = 0;
    // 이중 for문
    for (int i = 0; i < count; i++) {
      String input = reader.readLine();
      Character init = input.charAt(0);
      wording.push(init);
      for (int j = 1; j < input.length(); j++) {
        // AAA일 때, 마지막 A를 확인할 때 스택은 이미 비어있어서 에러를 반환한다.
        if (wording.peek() == input.charAt(j)) {
          wording.pop();
        } else {
          wording.push(input.charAt(j));
        }
      }
      if (wording.empty()) goodWords++;
    }
    // 직전 스택을 확인하여 입력된 스택과 동일하면 pop
    // 아니면 push
    // 마지막에 스택이 비어있으면 count++

    System.out.println(goodWords);
  }
}
