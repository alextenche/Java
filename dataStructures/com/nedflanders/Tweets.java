package com.nedflanders;

import java.io.*;

public class Tweets {
  public static void save(Tweet[] treets) {
    try (
      FileOutputStream fos = new FileOutputStream("treets.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
    ) {
      oos.writeObject(treets);
    } catch(IOException ioe) {
      System.out.println("Problem saving Treets");
      ioe.printStackTrace();
    }
  }
  
  public static Tweet[] load() {
    Tweet[] tweets = new Tweet[0];
    try (
      FileInputStream fis = new FileInputStream("treets.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
    ) {
      tweets = (Tweet[]) ois.readObject();
    } catch(IOException ioe) {
      System.out.println("Error reading file");
      ioe.printStackTrace();
    } catch(ClassNotFoundException cnfe) {
      System.out.println("Error loading treets");
      cnfe.printStackTrace();
    }
    return tweets;
  }
  
}
