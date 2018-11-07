public class Calculate {
	public static void main (String[] arg) {
		System.out.println("Calculate...");
		int firs = Integer.valueOf (arg[0]);
		int second = Integer.valueOf (arg[1]);
		int summ = firs+second;
		int raznica = firs-second;
		int proiz = firs*second;
		float chastnoe =   (float)firs/ (float)second;
		System.out.println ("Введены числа = "+firs+"  "+second);
		System.out.println ("Сумма чисел = "+summ);
		System.out.println ("Разница чисел = "+raznica);
		System.out.println ("Произведение чисел = "+proiz);
		System.out.print ("Частное чисел = ");
		System.out.printf ("%.2f", chastnoe);
		
	}
}