package strings;

import java.nio.charset.StandardCharsets;

public class StringDemo {
  public static void main(String[] args) {
    /**
     * Strings are immutable, sequence of characters.
     * Immutability means values cannot be changed once it is assigned.
     * Reasons: Thread safety, String pooling, Hashing
     */
    String str = "Welcome";
    System.out.println(str);
    str = "hey there!";
    System.out.println(str);
    String str2 = "hey there!";
    str2 = "Hello hey there!";

    // Newer, Faster and not thread safe
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append("Hello").append(" World");

    // Older, Slower but thread safe
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("Hello").append(" World");

    /**
     * Java v9: Strings are stored as byte[] instead of char[], called as compact
     * string, more memory effcient
     * String Encoding: Process of converting String to bytes and bytes back to
     * String. Java uses UTF-16 encoding.
     */

     String str3 = "Hello $";
     byte[] utf16 = str3.getBytes(StandardCharsets.UTF_16);
     String str4 = new String(utf16, StandardCharsets.UTF_16);

  }
}
