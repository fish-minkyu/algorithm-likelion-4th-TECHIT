package programmers;

// n보다 커질 때까지 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181884
class Solution181884 {
  public int solution(int[] numbers, int n) {
    int sum = 0;
    for (int num: numbers) {
      if (sum > n) {
        return sum;
      } else {
        sum += num;
      }
    }

    return sum;
  }
}