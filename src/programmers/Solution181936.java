package programmers;

// 공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/181936?language=java
public class Solution181936 {
  public int solution(int number, int n, int m) {
    if (number % n == 0 && number % m == 0) return 1;
    return 0;
  }
}
