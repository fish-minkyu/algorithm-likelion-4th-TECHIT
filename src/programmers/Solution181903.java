package programmers;

// qr code
// https://school.programmers.co.kr/learn/courses/30/lessons/181903?language=java
class Solution181903 {
  public String solution(int q, int r, String code) {
    // code를 배열로 만든다.
    String[] str = code.split("");

    String result = "";
   // 반복문, 각 인덱스를 q로 나눠 r인 것들을 배열에 담는다.
    for (int i = 0; i < code.length(); i++) {
      if (i % q == r) {
        result += str[i];
      }
    }
   return result;
  }
}