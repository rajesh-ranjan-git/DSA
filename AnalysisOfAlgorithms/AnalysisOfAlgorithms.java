package AnalysisOfAlgorithms;
// Example Problem : Sum of natural numbers

// I/P : n = 3
// O/p : 6 // 1 + 2 + 3

// I/P : n = 5
// O/P : 15 // 1 + 2 + 3 + 4 + 5

public class AnalysisOfAlgorithms {

  int sum1(int num) {
    int temp = 0;
    for (int i = 1; i <= num; i++) {
      temp = temp + i;
    }
    return temp;
  }

  int sum2(int num) {
    return num * (num + 1) / 2; // most efficient
  }

  int sum3(int num) { // never executes
    int temp = 0;
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; i++)
        temp++;
    }
    return temp;
  }

  public static void main(String[] args) {
    AnalysisOfAlgorithms a = new AnalysisOfAlgorithms();
    System.out.println(a.sum1(7));
    System.out.println(a.sum2(7));
    System.out.println(a.sum3(7));
  }
}
