package ch03_reference;

public class Calculator {
	//static¸É¹ö
  public static int staticMethod(int x, int y) {return x+y;}
  public static int staticMethod(int x) {return x;}
    //instance¸É¹ö
  public int instanceMethod(int x, int y) {return x+y;}
  public int instanceMethod(int x) {return x;}
  public int instanceMethod(int x,int y, int z) {return x+y+z;}
}
