import java.util.Scanner;
public class rot1 {
  public static void main(String[] args){
      Scanner gh = new Scanner (System.in) ;
      int answer = 3 ;
      while(answer>=3 || answer<=0){
        System.out.println("hello this is code ROT1");
    System.out.println("choose one option :");
        System.out.println("1-Converting from ROT1 to english. ");
        System.out.println("2-Converting from english to ROT1. ");
         answer = gh.nextInt();
      }
     Scanner input = new Scanner(System.in) ;
                                                                                                           
       if(answer==2){
    char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w','x', 'y', 'z','0', '1', '2', '3','4', '5','6','7','8', '9' };
    String[] ROT1Letters = { " ", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x","y", "z", "0", "1", "2", "3", "4","5","6","7", "8","9" };
        
    String newText = "";
        System.out.println("Enter text you want to change");
  String textToChange = input.nextLine();
    
    textToChange = textToChange.toLowerCase();
      
    for (int i = 0; i < textToChange.length(); i++) {
      for (int j = 0; j < 37; j++) {
        if (textToChange.charAt(i) == letters[j]) {
          newText += ROT1Letters[j];
          newText += "";
  
        break ;
        }        
      }
    }
   
    System.out.println("the Text is ");
    System.out.println(newText);
  }

   else if(answer==1){
   
  String[] letters = {  " ", "a", "b","c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w","x", "y", "z","0", "1", "2", "3","4","5","6", "7","8", "9"};
    char [] ROT1Letters = { ' ', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r', 's', 't','u', 'v', 'w', 'x','y', 'z', '0', '1', '2', '3','4','5','6', '7','8', '9' };
    String newText = "";
        System.out.println("Enter text you want to change");
  String textToChange = input.nextLine();

    textToChange = textToChange.toLowerCase();
      
    for (int i = 0; i < textToChange.length(); i++) {
      for (int j = 0; j < 37; j++) {
        if (textToChange.charAt(i) == ROT1Letters[j]) {
          newText += letters[j];
          newText += "";
  
        break ;
        }        
      }
    }
   
    System.out.println("the Text is ");
    System.out.println(newText);
  }
}}


