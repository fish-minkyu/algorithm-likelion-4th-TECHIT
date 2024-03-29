// 1. 순열
package d5BruteForce;

import java.util.Arrays;

public class Permutation { // 순차적 나열
  // 0 ~ n -1의 숫자로 만들 수 있는 3가지 숫자 나열 전부 출력하는 메서드 (알아두면 좋음!)
  public static void perSimple(int n) {
    int first;
    int second;
    int third;

    // 0에서 n 사이의 숫자를 차례데로 골라본다.
    for (int i = 0; i < n; i++) {
      // 첫번째 숫자를 골랐음
      first = i;
      // 0에서 n 사이의 숫자 중, 아직 고르지 않은 숫자를 골라본다.
      for (int j = 0; j < n; j++) {
        // 이미 고른 숫자라면 나머지는 실행하지 않는다.
        if (j == first) {
          continue;
        }
        second = j;
        // 0에서 n 사이의 숫자 중, 아직 고르지 않은 숫자를 골라본다.
        for (int k = 0; k < n; k++) {
          if (k == first || k == second) {
            continue;
          }
          third = k;
          System.out.println(first + " " + second + " " + third);
        }
      }
    }
  }

  // 재귀함수로 더 많은 원소를 선택하는 순열을 만들어보자.
  public static void permRecurHelper(
    // 순열을 구할때 필요한거: 고르는 대상, 고르는 갯수
    int n, int r,
    // 내가 지금 몇번째 원소를 고르고 있는지
    int depth,
    // 어떤 요소들을 사용했는지 저장하는 배열
    boolean[] used,
    // 결과를 저장하기 위한 배열
    int[] perm
  ) {
    // 내가 고른것의 갯수가 고를것의 갯수와 같아지면 중단.
    if (depth == r) {
      System.out.println(Arrays.toString(perm));
    }
    else {
      // n개의 원소중 하나를 선택하는 for
      for (int i = 0; i < n; i++) {
        // 이미 선택했다면 스킵
        if (used[i]) continue;

        // 선택을 할때 first = i;의 형태로 작성했던 부분
        perm[depth] = i;
        // 내가 이번에 i를 선택했다는걸 기록
        used[i] = true;
        // 중첩된 for 대신 재귀 호출
        permRecurHelper(n, r, depth + 1, used, perm);
        // 이 i에서 출발하는 순열을 다 찾으면, 다음 i를 쓰기위해 기록 변경
        used[i] = false;
      }
    }
  }

  // 사용성을 위해 실제 메서드를 분리한다. (n과 r만 있어도 실행이 되게끔)
  public static void permRecursive(int n, int r) {
    permRecurHelper(n, r, 0, new boolean[n], new int[r]);
  }

  // main
  public static void main(String[] args) {
    perSimple(9);
    permRecurHelper(10, 4, 0, new boolean[10], new int[4]);
    permRecursive(5, 2);
  }
}
// 2, 3개는 중첩 for문을 쓰고 그 이상은 재귀함수로 하여 permRecursive로 만든다면 사용성을 증가시킬 수 있다.