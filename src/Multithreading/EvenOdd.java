package Multithreading;

public class EvenOdd {

    volatile int counter=0;

    int limit;
    public EvenOdd(int limit) {
        this.limit = limit;
    }

   public synchronized void printEven(){
        while (counter<=limit){
            if (counter%2==0){
                System.out.println(Thread.currentThread().getName()+" "+counter);
                notifyAll();
            }
            else {
                try{
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
   }
    public synchronized void printOdd(){
        while(counter<=limit){
            if (counter%2==1){
                System.out.println(Thread.currentThread().getName()+" "+counter);
                counter++;
                notifyAll();
            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EvenOdd obj=new EvenOdd(20);
        Thread e=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printEven();
            }
        });
        e.setName("Even-");
        Thread o=new Thread(obj::printOdd);
        

        o.setName("Odd-");

        e.start();
        o.start();


    }
}
