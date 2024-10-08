class Avtomobil {
	int pass; //количество пассажиров
	int v; //объем топливного бака в л.
	double rash; // расход топлива в л. на 100 км.
	
	void rasst() {
		System.out.println("Расстояние на полном баке: " + ((int)(v/rash*100)));
	}

	int rasst2() {
		return (int)(v/rash*100);
	}

	double fuelneeded(int km) {
		return ((double)km/100)*rash;
	}
}
class pr004 {
	public static void main(String args[]) {
		//Создание экземпляра класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porsche = new Avtomobil();
		int rasst, rasst2;

		//Присваивание значений внутренним переменным экземпляра класса
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porsche.pass = 1;
		porsche.v = 100;
		porsche.rash = 14.0;

		System.out.println("Для расстояния в 10 км. нужно " + lada.fuelneeded(10) + " литров бензина");
		rasst=10;
		System.out.println("Для расстояния в 10 км. нужно " + lada.fuelneeded(rasst) + " литров бензина");

		//Расчет расстояния, которое lada проедет на полном баке
		//rasst = (int) (lada.v/lada.rash * 100);

		System.out.print("Для Lada: ");
		lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результат вызова метода rasst2(): " + rasst);

		//rasst2 = (int) (porsche.v/porsche.rash * 100);

                System.out.print("Для Porsche: ");
		porsche.rasst();
		System.out.println("Результат вызова метода rasst2(): " + porsche.rasst2());
	}
}

