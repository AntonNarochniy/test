import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
        System.out.print("������ ����� �� 0 �� 11: ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
       if (number < 0 || number > 11) {
           System.out.println("������� ������������� ����� ��� ����� ������ 11");
           System. exit(0);
       }
	   for(int i = 0; i <= 11; i++) {
		   System.out.println(number + " x " + i + " = " + (number * i));
	   }   
	   
	   System.out.println("test");
	   System.out.println("test");
	}
}