class Consumer extends Thread {
   private Pc pc;
   private int number;
public Consumer(Pc c, int number) {
      pc = c;
      this.number = number;
   }
   public void run() {
      int value = 0;
      for (int i = 0; i < 10; i++) {
         value = pc.get();
         System.out.println("Consumer #" + this.number + " got: " + value);
      }
   }
}
