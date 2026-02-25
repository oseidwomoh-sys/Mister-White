// add package name here if needed
//
class App {

  public static void main(String[] args) {

    Thread t1 = new BusyThread();
    Thread t2 = new BusyThread();

    t1.start();
    t2.start();

  }
}

