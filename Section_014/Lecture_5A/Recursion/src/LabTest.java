public class LabTest {
  public static void main(String[] args) {
    System.out.println(interleaveChar("hello",'-'));
    System.out.println(interleaveChar("CSCI", ' '));
    System.out.println(interleaveChar("<<<>>>", '*'));
  }

  public static String interleaveChar(String str, char ch){
    if (str.length() <= 1) {
      return str;
    } else {
      return "" + str.charAt(0) + ch + interleaveChar(str.substring(1), ch);
    }
  }
}
