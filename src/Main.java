import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

    String n = st.nextToken();
    int N = Integer.parseInt(st.nextToken());

    int ans = 0;

    int flag = 0;
    for (int i = n.length()-1; i >= 0 ; i--) {
      char c = n.charAt(i);
      if ('A' <= c && c <= 'Z') {
        ans += ((c - 'A') + 10) * Math.pow(N, flag);
      } else {
        ans += c * Math.pow(N, flag);
      }

      flag++;
      System.out.println("flag" + flag);
    }
    System.out.println(ans);
  }
}
