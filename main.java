// Practicum 8 (Strings in Java)
// (TO UPDATE)

class Main {
  public static void main(String[] args) {
    System.out.println("PRACTICUM on Strings in Java");

    // var declarations
    String str1, str2, str3;
    StringBuffer str4;
    boolean match;

    // string assignment
    str1 = "ABC";
    str2 = "ABC";
    str3 = "Hello";
    str4 = new StringBuffer("Hello");

    // string comparison
    match = (str1 == str2); 

    // string modification
    str3.replace('H','J');   
    str4.replace(0,1,"J"); 

    // display results
    System.out.println("match = " + match); // should equal true

    System.out.println("str3 = " + str3); // should equal "Jello"
    System.out.println("str4 = " + str4); // should equal "Jello"
  }
}
