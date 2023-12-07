// 더 크게 합치기
// https://school.programmers.co.kr/learn/courses/30/lessons/181939
package programmers;

class Solution181939 {
//  public int solution(int a, int b) {
//    String x = String.valueOf(a);
//    String y = String.valueOf(b);
//    String answer1 = x + y;
//    String answer2 = y + x;
//
//    if (Integer.parseInt(answer1) < Integer.parseInt(answer2)) {
//      return Integer.parseInt(answer2);
//    } else {
//      return Integer.parseInt(answer1);
//    }
//  }
  public int solution(int a, int b) {
    // StringBuilder aBuilder = new StringBuilder();
    // aBuilder.append(a).append(b)

    String resultA = "" + a + b;
    String resultB = "" + b + a;

    int resultAint = Integer.parseInt(resultA);
    int resultBint = Integer.parseInt(resultB);

    if (resultAint > resultBint) {
      return resultAint;
    } else {
      return resultBint;
    }
  }

  public static void main(String[] args) {
    System.out.println(new Solution181939().solution(1, 3));
  }
}