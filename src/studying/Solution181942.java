package studying;

public class Solution181942 {
  // 방법 1.
  public String solution1(String str1, String str2) {
    String answer = "";
    // string.toCharArray()
    // : 문자열을 구성하는 char의 배열을 반환하는 메서드
    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();

    // 1. str1의 길이만큼 반복한다.
    for (int i = 0; i < str1.length(); i++) {
    // 2. str1의 i번째 글자를 answer에 덧붙인다.
      answer += chars1[i];
    // 3. str2의 i번째 글자를 answer에 덧붙인다.
      answer += chars2[i];

    }
    // 4. 답을 반환한다.
    return answer;
  }

  // 방법 2. string.charAt(): 문자열 배열로 나타내지 않고 들고 있는 데이터를 바로 바로 꺼내온다.
  // 문자열을 구성하는 char들 중 index번째를 반환하는 메서드
  public String solution2(String str1, String str2) {
    String answer = "";

    // Java의 string 저장법 찾아보기
    // 이 반복문에서 20개의 문자열 객체를 만들게 된다.
    for (int i = 0; i < str1.length(); i++) {
      answer += str1.charAt(i); // 새로운 문자열을 만들어 참조값을 바꾼다.
      answer += str2.charAt(i);
    }

    return answer;
  }

  // StringBuilder로 답을 작성하기 <- 사용하는데 익숙해지는 것을 추천
  // StringBuilder는 문자열을 만드는 사람
  // 이렇게 하는 것이 방법2보다 훨씬 더 빠르다. Builder 메소드 자체가 빠르다.
  public static String solution3(String str1, String str2) {
    // lineBuilder는 한번에 문자열로 바꿔준다.
    // 변경사항을 기억해두었다가 한번에 변경하는 방식이다.
    StringBuilder lineBuilder = new StringBuilder();
    for (int i = 0; i < str1.length(); i++) {
      // 정답 문자열 뒤에 붙이고 싶은 데이터를 append 메서드로 전달
      // append가 +를 대신하는 메서드다.
      lineBuilder.append(str1.charAt(i));
      lineBuilder.append(str2.charAt(i));
    }

    String answer = lineBuilder.toString();
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(new Solution181942().solution1("aaaa", "bbbb"));
    System.out.println(new Solution181942().solution2("aaaa", "bbbb"));
  }
}
