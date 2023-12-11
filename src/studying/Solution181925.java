package studying;

// 수 조작하기2
// https://school.programmers.co.kr/learn/courses/30/lessons/181925
class Solution181925 {
  public String solution(int[] numLog) {
//    String result = "";
//    // 반복문
//    for (int i = 1; i < numLog.length; i++) {
//      int flag = numLog[i] - numLog[i -1];
//
//      switch (flag) {
//        case 1:
//          result += "w";
//          break;
//        case -1:
//          result += "s";
//          break;
//        case 10:
//          result += "d";
//          break;
//        case -10:
//          result += "a";
//          break;
//      }
//    }
//
//    return result;
    StringBuilder answerBuilder = new StringBuilder();
    // 인덱스(순서)가지고 순회를 할 것이며,
    // n-1까지만 순회하며 앞 뒤를 비교
    for (int i = 0; i < numLog.length -1; i++) {
      int diff = numLog[i+1] - numLog[i];
      // switch 사용해보자
      switch (diff) {
        case 1:
          answerBuilder.append('w');
          break;
        case -1:
          answerBuilder.append('s');
          break;
        case 10:
          answerBuilder.append('d');
          break;
        case -10:
          answerBuilder.append('a');
          break;
      }
    }

    return answerBuilder.toString();
  }
}