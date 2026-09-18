public class WhichSemester {

  // x is the month, should be between [1, 12]
  public static String whichSemester(int x) {
    if (x == 1){
      return "J-term";
    }
    else if (x >= 2 && x <= 5){
      return "Spring Semester";
    }
    else if (x >= 9 && x <= 12){
      return "Fall Semester";
    }
    else{
      return "No Semester";
    }
  }

  public static void main(String[] args) {
    String semester = whichSemester(1);
  }
}
