import java.util.Scanner; 
import java.util.Random;

public class passwordGenerator{
public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     Random rand = new Random();

System.out.println("How many characters do you want in your password?");
 int length = input.nextInt();

System.out.println("Do you want to include uppercase letters? (y/n)"); 

boolean includeUppercase = input.next().equalsIgnoreCase("y");

System.out.println("Do you want to include lowercase letters? (y/n)"); 
boolean includeLowercase = input.next().equalsIgnoreCase("y");

System.out.println("Do you want to include numbers? (y/n)"); 
boolean includeNumbers = input.next().equalsIgnoreCase("y");

System.out.println("Do you want to include special characters? (y/n)"); 
boolean includeSpecialChars = input.next().equalsIgnoreCase("y");

String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
String numbers = "0123456789";
String specialChars = "!@#$%^&*()_+{}[]|:;<>,.?/~`"; 
String password = "";
if (includeUppercase) {
password += uppercaseLetters.charAt(rand.nextInt(uppercaseLetters.length()));
}
if (includeLowercase) {
password += lowercaseLetters.charAt(rand.nextInt(lowercaseLetters.length()));
}
 
if (includeNumbers) {
password += numbers.charAt(rand.nextInt(numbers.length()));
}
if (includeSpecialChars) {
password += specialChars.charAt(rand.nextInt(specialChars.length()));
}

while (password.length() < length) {
String chars = uppercaseLetters + lowercaseLetters + numbers + specialChars; password += chars.charAt(rand.nextInt(chars.length()));
}

System.out.println("Your generated password is: " + password);
}
}
