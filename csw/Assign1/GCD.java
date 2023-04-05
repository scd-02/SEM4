public class GCD {

  public static int gcd(int a, int b) {
    if(a<b){
      return gcd(b, a);
    }
    if(a%b==0)
      return b;
    
    return gcd(b, a%b);

  }

  public static void main(String[] args) {
    System.out.println(gcd(48, 52));
  }
}
