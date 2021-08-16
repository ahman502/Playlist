import java.util.ArrayList;
import java.util.Collections;        //importing collections utility

class Playlist {

  public static void main(String[] args) {

    //creating a new ArrayList of String objects
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    //addings elements to the ArrayList
    desertIslandPlaylist.add("Imagine Dragons - Believer");
    desertIslandPlaylist.add("Camila Cabello - Havana");
    desertIslandPlaylist.add("John Lennon - Imagine");
    desertIslandPlaylist.add("The Beach Boys - Kokomo");
    desertIslandPlaylist.add("Luis Fonsi - Despacito");
    desertIslandPlaylist.add("Charlie Puth - Attention");
    desertIslandPlaylist.add("Los Del Río - Macarena");

    System.out.println("----------------------------------------------------------");

    //print original playlist
    System.out.println("My Original Playlist: " + desertIslandPlaylist);

    //check number of songs
    System.out.println("Number of Songs: " + desertIslandPlaylist.size());

    //remove song at index 2
    String removed = desertIslandPlaylist.remove(2);

    //print name of the removed song
    System.out.println("Removed Song: " + removed);

    //number of songs after removing one song
    System.out.println("Number of Songs: " + desertIslandPlaylist.size());

    //swapping song at index 1 with index 3 using collections utility in java
    Collections.swap(desertIslandPlaylist, 1, 3);

    //printing shuffled playlist after swap
    System.out.println("Shuffled Playlist: " + desertIslandPlaylist);

    //swapping songs manually using temp
    int a = desertIslandPlaylist.indexOf("The Beach Boys - Kokomo");
    int b = desertIslandPlaylist.indexOf("Los Del Río - Macarena");

    //temporary variable holds song name of variable b
    String temp = "Los Del Río - Macarena";

    //we set variable a to temp's value which is "Los Del Río - Macarena"
    desertIslandPlaylist.set(a, temp);
    //then we set variable b to variable a's song which is The Beach Boys - Kokomo"
    desertIslandPlaylist.set(b, "The Beach Boys - Kokomo");

    //then we print out the shuffled arraylist again
    System.out.println("Shuffled Again: " + desertIslandPlaylist);

    System.out.println("----------------------------------------------------------");
  }

}
