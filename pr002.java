class pr002 {
	public static void main(String args[]) {
		byte b, bb, bbb; //8-битная переменная
		short s, ss, sss;//16-битная переменная
		int i, ii, I;//32-битная перменная
		long l, ll, L;//64-битная переменная
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		//bbb = sss; Автопреобразование типов запрещено, так как могут привести к искажению значений
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);

		// Пример использования различных целых типов
		ii = 700000; // длина стороны куба в миллиметрах
		int V = ii*ii*ii; // объем куба в кубических мм
		System.out.println("Объем куба: " + V);
		long VV = (long)ii*ii*ii;
		System.out.println("Правильно вычисленный объем куба: " + VV);
		
		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);
	}
}
