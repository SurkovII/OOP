import java.util.Scanner;

public class ComplexCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ComplexNumber complex1;
		ComplexNumber complex2;
		ComplexNumber complex3;
		float a;
		float b;
		int choice = 0;

		while(choice != 5){
			System.out.println("\nКакую команду ?\n1: Сложение\n2: Вычитание\n3: Умножение\n4: Деление\n5: Выход\n");
			choice = input.nextInt();
			//Addition
			if(choice == 1){
				System.out.println("Пример суммы комплексных чисел:\n (a + bi) + (c + di)\n");
				System.out.println("Введите a:");
				a = input.nextFloat();
				System.out.println("Введите b:");
				b = input.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введите c:");
				a = input.nextFloat();
				System.out.println("Введите d:");
				b = input.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.add(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			//Subtraction
			if(choice == 2){
				System.out.println("Пример разности комплексных чисел:\n(a + bi) - (c + di)\n");
				System.out.println("Введите a:");
				a = input.nextFloat();
				System.out.println("Введите b:");
				b = input.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введите c:");
				a = input.nextFloat();
				System.out.println("Введите d:");
				b = input.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.subtract(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			//Multiplication
			if(choice == 3){
				System.out.println("Пример разности комплексных чисел:\n(a + bi)(c + di)\n");
				System.out.println("Введите a:");
				a = input.nextFloat();
				System.out.println("Введите b:");
				b = input.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введите c:");
				a = input.nextFloat();
				System.out.println("Введите d:");
				b = input.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.multiply(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
			//Division
			if(choice == 4){
				System.out.println("Пример разности комплексных чисел:\n(a + bi)/(c + di)\n");
				System.out.println("Введите a:");
				a = input.nextFloat();
				System.out.println("Введите b:");
				b = input.nextFloat();
				complex1 = new ComplexNumber(a, b);
				System.out.println("Введите c:");
				a = input.nextFloat();
				System.out.println("Введите d:");
				b = input.nextFloat();
				complex2 = new ComplexNumber(a, b);
				complex3 = complex1.divide(complex2);
				System.out.println("Результат: " + complex3.toString());
			}
		}
	}
}
