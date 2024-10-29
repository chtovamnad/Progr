//Побитовые операции: & | ^ >> >>> << ~
class pr006 {
        public static void main(String[] args) {

                //Сброс 6-го бита в кодировке символа (побитовая операция "И")
                char ch;
                for (int i=0; i<26; i++) {
                        ch = (char) ('a' + i);
                        System.out.print(ch);
                        ch = (char) ((int) ch & 65503);

                        System.out.print(ch + " ");
                }
                System.out.println();

                //Отображение битового представления Байта
                System.out.println();
                int t;
                byte val;
                val = (byte) 'A';
                for (t=128; t>0; t=t/2) {
                        if((val&t) != 0) System.out.print("1 ");
                        else System.out.print("0 ");
                }
                System.out.println();

                //Установление 6-го бита в кодировке символа (побитовая операция "ИЛИ")
                System.out.println();

                for (int i=0; i<26; i++) {
                        ch = (char) ('A' + i);
                        System.out.print(ch);
                        ch = (char) ((int) ch & 32);

                        System.out.print(ch + " ");
                }
		              System.out.println();

                //Примитивное шифрование (побитовая операция "Исключающее ИЛИ")
                System.out.println();
                String msg = "Исходящая тестовая строка";
                String encmsg = "";
                String decmsg = "";
                int key = 88;

                System.out.print("Незашифрованное сообщение: ");
                System.out.println(msg);

                //Шифрование сообщения:
                for(int i=0; i<msg.length(); i++)
                        encmsg = encmsg + (char) (msg.charAt(i) ^ key);
                System.out.print("Защифрованное сообщение: ");
                System.out.println(encmsg);

                //Дешифровка сообщения:
                for(int i=0; i<msg.length(); i++)
                        decmsg = decmsg + (char)(encmsg.charAt(i)^key);

                System.out.print("Дешифрованное сообщение: ");
                System.out.println(decmsg);
		
		//Операция побитового "НЕ"
		System.out.println();
		byte b = -34;
		for(int t1=128; t1>0; t1=t1/2) {
			if((b & t1) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();

		b = (byte) -b;

		for(int t1=128; t1>0; t1=t1/2) {
			if((b & t1) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();
		
		//Сдвиговые битовые операции
		System.out.println();
                int v = 1;
		for(int i=0; i < 8; i++) {
                	for(int t1=128; t1>0; t1=t1/2) {
                	        if((b & t1) != 0)
                        	        System.out.print("1 ");
                	        else
                        	        System.out.print("0 ");
                	}
			System.out.println();
			v = v << 1;
		}
		v = 128;
		for(int i=0; i < 8; i++) {
                        for(int t1=128; t1>0; t1=t1/2) {
                                if((b & t1) != 0)
                                        System.out.print("1 ");
                                else
                                        System.out.print("0 ");
                        }
                        System.out.println();
                        v = v >> 1;
                }
	
	}
}
w
