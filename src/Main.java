import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] myCardString = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] inCards = br.readLine().split( " ");
        br.close();

        // 이진 탐색
        int[] myCards = new int[N];
        for (int i = 0; i < N; i++) {
            myCards[i] = Integer.parseInt(myCardString[i]);
        }

        Arrays.sort(myCards);

        StringBuilder answer = new StringBuilder();
        for (String str : inCards) {
            int result = binarySearch(myCards, Integer.parseInt(str)) ? 1 : 0;
            answer.append(result).append(" ");
        }

        System.out.println(answer);
    }

  // 이진탐색 메소드
    public boolean binarySearch(int[] arr, int target) {
      int low = 0;
      int high = arr.length -1;

      while (low <= high) {
          int mid = low + (high - low) / 2;

          if (arr[mid] == target) return true;
          else if (arr[mid] < target) {
              low = mid + 1;
          } else {
              high = mid - 1;
          }
      }

      return false;
    }
}
