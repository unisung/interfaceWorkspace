package ch03_reference;

public class Calculator {
	//static�ɹ�
  public static int staticMethod(int x, int y) {return x+y;}
  public static int staticMethod(int x) {return x;}
    //instance�ɹ�
  public int instanceMethod(int x, int y) {return x+y;}
  public int instanceMethod(int x) {return x;}
  public int instanceMethod(int x,int y, int z) {return x+y+z;}
}
