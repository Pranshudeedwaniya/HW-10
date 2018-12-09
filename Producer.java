class Producer extends Thread {
   private Pc pc;
   private int number;
   public Producer(Pc c, int number) {
      pc = c;
      this.number = number;
   } 
   public void run() {
      for (int i = 0; i < 10; i++) {
         pc.put(i);
         System.out.println("Producer #" + this.number + " put: " + i);
         try {
            sleep((int)(Math.random() * 100));
         } catch (InterruptedException e) { }
      } 
   }
}
