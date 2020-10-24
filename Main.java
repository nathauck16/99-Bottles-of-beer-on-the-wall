import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*
    *This class exists as a practice for me to run scanners, practice commenting,etc.
    *@author Nathaniel Hauck
    */
    //if loop
    
    //variables
    

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter any number to begin countown of beers on the wall");
    int beerNum = s.nextInt();

    String word = "bottles";
    while (beerNum > 0) {
      if (beerNum ==1){
        word = "bottle";
      }
    }

    

    if (beerNum > 0){
      System.out.println( beerNum + "" + word +" of beer on the wall!");
      System.out.println(beerNum + "" + word + "of beer!");
      System.out.println("take one down");
      System.out.println("pass it around");
      beerNum = beerNum -1;
      System.out.println( beerNum + "" + word +" of beer on the wall!");
    }else{
      System.out.println("No more bottles of beeer on the wall");
    }

  }
}