import java.util.*;

public class simple{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(num < 0 ? "negative":"positive");
    switch (num) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Satruday");
        break;
      default:
        break;
    }
    for(int i = 0; i < num; i++){
      System.out.println(i);
    }
    for(int i = num; i > -1; i--){
      System.out.println(i);
    }
    int i = 0;
    while(i < 4){
      System.out.println(i);
      i++;
    }
  }
}
