package programmers;

// 글과 이어 붙여 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181915?language=java
class Solution181915 {
  public String solution(String my_string, int[] index_list) {
    String result = "";
    String[] arr = my_string.split("");

    for (int i = 0; i < index_list.length; i++) {
      result += arr[index_list[i]];
    }

    return result;
  }
}