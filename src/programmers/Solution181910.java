package programmers;

// 문자열의 뒤의 n글자
// https://school.programmers.co.kr/learn/courses/30/lessons/181910?language=java
class Solution181910 {
  public String solution(String my_string, int n) {
   int length = my_string.length();
   String result = my_string.substring(length - n, length);
   return result;
  }
}