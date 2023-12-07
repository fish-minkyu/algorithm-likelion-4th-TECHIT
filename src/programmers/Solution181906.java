package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution181906 {
  public static int solution(String my_string, String is_prefix) {
    String str = "";
    // 반복문을 통해 b, ba, ... banana 배열을 만든다.
    List<String> banana = new ArrayList<String>();

    for (int i = 0; i < my_string.length(); i++) {
      banana.add(my_string.substring(0, i + 1));
    }
    // 배열과 indexOf를 한다.
    return banana.contains(is_prefix) ? 1 : 0;
  }

  public static void main(String[] args) {
    System.out.println(solution("banana", "ban"));
  }
}
