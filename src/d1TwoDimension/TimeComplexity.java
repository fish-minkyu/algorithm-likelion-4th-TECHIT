package d1TwoDimension;

public class TimeComplexity { // 시간복잡도
  // 자연수 n을 받아서
  // 1부터 n까지 모든 자연수를 합하는 메서드
  // 단, 입력 검증 필요 없음
  public static int sumUntillN1(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  // n * (n + 1) / 2를 하면 1부터 n까지의 자연수를 합한것과 동일
  public static int sumUntillN2(int n) {
    return n * (n + 1) / 2;
  }

   public static void main(String[] args) {
    long startTime = System.nanoTime();
    System.out.println(sumUntillN1(10));
    long endTime = System.nanoTime();
    System.out.println("총 걸린 시간: " + (endTime - startTime));

     startTime = System.nanoTime();
    System.out.println(sumUntillN2(10));
     endTime = System.nanoTime();
     System.out.println("총 걸린 시간: " + (endTime - startTime));
  }
}
