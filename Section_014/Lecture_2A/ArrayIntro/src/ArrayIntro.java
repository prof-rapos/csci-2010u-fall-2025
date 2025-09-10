public class ArrayIntro {
  public static void main(String[] args) {
    char[] charArray = new char[5];
    for(int i = 0; i < charArray.length; i++) {
      charArray[i] = (char)(i + 65);
    }
    System.out.println(charArray);
    int[] intArray = {5, 12, 17, 64, 67};
    System.out.println(intArray[4]);

    for(int i = 0; i < intArray.length; i++) {
      System.out.print(intArray[i] + " ");
    }

    for (int i : intArray) {
      System.out.print(i + " ");
    }

  }
}