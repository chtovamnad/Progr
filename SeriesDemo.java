class SeriesDemo {
  public static void main(String[] args) {
    ByTwos ob = new ByTwos();
    for(int i = 0; i < 5; i++)
      System.out.println("Следующее значение в последовательности: " + ob.getNext());
    System.out.println("\nСброс последовательности к стартовому значению");
    ob.reset();
    for(int i=0; i < 5; i++)
      System.out.println("Следующее значение в последовательности: " + ob.getNext());
    System.out.println("\nУстанавливаем стартовое значение");
    ob.setStart(100);
    for(int i=0; i < 5; i++)
      System.out.println("Следующее значение в последовательности: " + ob.getNext());
  }
}