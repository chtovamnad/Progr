//Суперкласс
class Music {
  String name;
  String author;
  double time;
  
  Music(String n, String a, double t) {
      name = n;
      author = a;
      time = t;
  }
  String getName() {
      return name;
  }
  String getAuthor() {
      return author;
  }
  double getTime() {
      return time;
  }
  void genre() {
      System.out.println(name + " - песня жанра ...");
  }
  void about() {
      System.out.println("Песня исполняется: " + author + "; и длится: " + time);
  }
}

//Подкласс
class Indie extends Music {
    Indie(String name, String author, double time) {
        super(name, author, time);
    }
    void genre() {
        System.out.println(getName() + " - песня жанра Инди");
    }
    void about() {
        System.out.println("Песня исполняется: " + getAuthor() + "; и длится: " + getTime());
    }
}
class Pop extends Music {
    Pop(String name, String author, double time) {
        super(name, author, time);
    }
    void genre() {
        System.out.println(getName() + " - песня жанра Поп-музыка");
    }
    void about() {
        System.out.println("Песня исполняется: " + getAuthor() + "; и длится: " + getTime());
    }
}
//Главный класс
class Proverochnaya {
    public static void main(String[] args) {
        Indie is1 = new Indie("ИНОГДА", "Андрей Катиков", 2.54);
        Pop ps1 = new Pop("Ничего нет", "любови", 2.34);
        
        System.out.println("Информация о песне №1: ");
        is1.genre();
        is1.about();
        System.out.println();
        System.out.println("Информация о песне №2: ");
        ps1.genre();
        ps1.about();
    }
}
