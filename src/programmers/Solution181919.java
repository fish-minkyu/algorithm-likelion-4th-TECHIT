package programmers;// 콜라츠 수열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181919?language=java
import java.util.ArrayList;
import java.util.List;

public class Solution181919 {
  public static List<Integer> solution(int n) {
    int x = n;
    // ArrayList 선언
    List<Integer> result = new ArrayList<>();
    result.add(n);
    // 반복 - 조건문
    while (true) {
      // 종료 조건, 1이면 종료
      if (x==1) break;

      // 홀짝 판별
      if (x % 2 == 1) {
        x = 3 * x + 1;
        result.add(x);
      } else {
        x = x / 2;
        result.add(x);
      }
    }

    // ArrayList 반환
    return result;
  }
}
