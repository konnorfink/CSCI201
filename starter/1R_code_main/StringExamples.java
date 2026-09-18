public class StringExamples {

  public static void main(String[] args) {

    String message = "Hi CS 201!";

    System.out.println(isFriendlyMessage(message));

    int nChars = message.length();
    System.out.println("message has " + nChars + " characters");

    char firstChar = message.charAt(0);
    char lastChar = message.charAt(message.length() - 1);
    System.out.println("first = " + firstChar + " last = " + lastChar);

    System.out.println(message.toLowerCase());

    String newString = message.replace('2', '7');
    System.out.println("New class: " + newString);

    System.out.println("Rest of string: " + message.substring(1, message.length()));

    String courseNum = message.substring(6, 9);
    boolean same = courseNum.equals("201");
    System.out.println("num: " + courseNum + " is same: " + same);
  }

  public static boolean isFriendlyMessage(String s){
    return s.contains(":)");
  }
}