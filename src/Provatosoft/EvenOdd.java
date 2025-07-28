package Provatosoft;

interface Vehicle {
    void start();

    default void horn() {
        System.out.println("Beep beep! (Default horn)");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}


//using thread
    public class EvenOdd {
        int number =0;

        public synchronized void printEven(){
            while (number<=100){
                if(number%2!=0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }else {
                    System.out.println("Even "+number +" "+ Thread.currentThread().getName());
                    number++;
                    notify();
                }}
        }

        public synchronized void printOdd(){
            while (number<=100){
                if(number%2==0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }else {
                    System.out.println("Odd "+number +" "+ Thread.currentThread().getName());
                    number++;
                    notify();
                }}
        }

        public static void main(String[] args) {
            EvenOdd evenOdd =new EvenOdd();
            Thread t1 =new Thread(() -> evenOdd.printEven());
            Thread t2 =new Thread(() -> evenOdd.printOdd());

            t1.start();
            System.out.println(t1.getState());
//            t2.start();
           System.out.println(t2.getState());

//            Car car = new Car();
//            car.start();     // Car started
//            car.horn();

        }
    }
