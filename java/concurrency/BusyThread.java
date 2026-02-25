// add package name here if needed
//
class BusyThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 1_000_000; i++) {
      try {
        Thread.sleep((int)(Math.random() * 10) + 1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      printResult(i);

    }
  }

  private synchronized void printResult(int i) {
    // both threads will print to the console, but they will not interfere with each other because they are running in separate threads
    double x = Math.sqrt(i);
    System.out.println("Thread " + Thread.currentThread().getName() + " is busy with i = " + i + " and sqrt(i) = " + x);
  }

}

