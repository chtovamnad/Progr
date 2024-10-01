class Avtomobil {
	int pass; //количество пассажиров
	int v; //объем топливного бака в л.
	double rash; // расход топлива в люъ. на 100 км.
}
class pr004 {
	public static void main(String args[]) {
		//Создание экземпляра класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porsche = new Avtomobil();
		int rasst;

		//Присваивание значений внутренним переменным экземпляра класса
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porsche.pass = 1;
		porsche.v = 100;
		porsche.rash = 14.0;

		//Расчет расстояния, которое lada проедет на полном баке
		rasst = (int) (lada.v/lada.rash * 100);

		System.out.println("Lada проедет " + rasst + " км. на полном баке");
		
		rasst = (int) (porsche.v/porsche.rash * 100);

                System.out.println("Porsche проедет " + rasst + " км. на полном баке");
	}
}
