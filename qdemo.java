//Очередь
class queue {
	private char[] q;
	private int putloc, getloc; //указатели на элементы очереди
	
	public queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	//Метод для помещения символа в очередь
	public void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - невозможно вставить символ, так как очередь переполнена.");
			return;
		}
		q[putloc++] = ch;
	}

	//Метод для извлечения символа из очереди
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - невозможно извлечь символ, так как очередь пуста.");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class qdemo {
	public static void main(String[] args) {
		queue bigq = new queue(100);
		queue smallq = new queue(4);
		char ch;
		int i;

		System.out.println("Использование очереди bigq для сохранения символов");
		for(i=0; i<26; i++)
			bigq.put((char) ('A' + i));

		//Извлекаем элементы из очереди bigq
		System.out.print("Содержание bigq: ");
		for(i=0; i<26; i++) {
			ch = bigq.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		//Использование очереди smallq
		for(i=0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Z' - i));
			smallq.put((char) ('Z' -i));
			System.out.println();	
		}
		System.out.println();
		System.out.print("Содержимое smallq: ");
		for(i=0; i<5; i++) {
                        ch = smallq.get();
                        if(ch != (char) 0)
                                System.out.print(ch);
		}
		
		//bigq.q[3] = 'E'; Попытка измненеия значения у закрытой переменной класса Queue
		//bigq.putloc = 50; Попытка изменения закрытого указателя в классе Queue
	}
}
