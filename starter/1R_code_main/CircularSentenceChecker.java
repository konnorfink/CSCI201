public class CircularSentenceChecker {

  public static boolean isCircularSentence(String sentence) {
    sentence = sentence.toLowerCase();
    int n = sentence.length();
    char first = sentence.charAt(0);

    for (int i = 0; i < n; i++){
      if (sentence.charAt(i) == ' '){
        if (sentence.charAt(i - 1) != sentence.charAt(i + 1)){
          return false;
        }
      }
    }
    return (sentence.charAt(n - 1) == first);
  }

  public static void main(String[] args) {
    boolean result = isCircularSentence("you use extra avocado on noodles strangely");
    System.out.println(result);
  }
}