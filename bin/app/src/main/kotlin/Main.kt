import org.mindrot.jbcrypt.BCrypt;

fun main(args: Array<String>) {
  val plainText = "Hello World!";
  val stored = BCrypt.hashpw(plainText, BCrypt.gensalt());
  println("Original: " + plainText);
  println("Hash: " + stored);
  println("Verified: " + BCrypt.checkpw(plainText, stored));
}
