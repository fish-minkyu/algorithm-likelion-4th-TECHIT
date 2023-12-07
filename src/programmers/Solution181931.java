package programmers;

public class Solution181931 {

  public static int solution(int a, int d, boolean[] included) {
    int answer = 0;
    for (int i = 0; i < included.length; i++) {
      if (included[i]) {
        answer += a + (d * i);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int a = 10, d = 5;
    boolean[] included = {false, true, false, true, true};

    System.out.println(new Solution181931().solution(a, d, included));
  }
}
