// 두 수의 연산값 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181938
package programmers;

class Solution181938 {
  public int solution(int a, int b) {
    int x = Integer.parseInt("" + a + b);
    int y = 2 * a * b;

    return Math.max(x, y);
  }
}