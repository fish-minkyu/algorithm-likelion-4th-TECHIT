// 조건 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181934
class Solution181934 {
  public int solution(String ineq, String eq, int n, int m) {
    int result = 0;
    switch (ineq + eq) {
      case ">=":
        result = n >= m ? 1 : 0;
        break;
      case "<=":
        result = n <= m ? 1 : 0;
        break;
      case ">!":
        result = n > m ? 1 : 0;
        break;
      case "<!":
        result = n < m ? 1 : 0;
        break;
    }
    return result;
  }
}