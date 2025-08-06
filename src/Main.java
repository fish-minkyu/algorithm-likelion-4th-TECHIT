import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) throws IOException {
    int sum = IntStream.of(1, 3, 5, 7, 9)
        .peek(System.out::println)
        .sum();
  }
}
