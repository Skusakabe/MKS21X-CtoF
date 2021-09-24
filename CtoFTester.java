public class CtoFTester {
  /*
  The functions should have celsius/fahrenheit as parameters(depending on which
  is being converted to which). They should be type double so that more precise
  parameters can be given, but int also works. celsiusToFahrenheit should return
  a double that is = 9/5 * cels + 32 and fahrenheitToCelsius should return a
  double that is = 5/9 * (fahr - 32).
  */
  public static double celsiusToFahrenheit(double cels) {
    return cels * 1.8 + 32;
  }

  public static double fahrenheitToCelsius(double fahr) {
    return 5.0/9 * (fahr - 32);
  }

  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(10));
    System.out.println(fahrenheitToCelsius(50));
  }
}
