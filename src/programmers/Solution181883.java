package programmers;

import java.util.Arrays;

public class Solution181883 {
  public static int[] solution(int[] arr, int[][] queries) {
    for (int i = 0; i < queries.length; i++) {
      for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
        arr[j]++;
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4};
    int[][] quries = {
      {0, 1}, {1, 2}, {2, 3}
    };
    System.out.println(Arrays.toString(solution(arr, quries)));
  }
}