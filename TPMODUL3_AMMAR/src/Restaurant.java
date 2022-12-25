public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    public void run(){
        while(true){
            getFood();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber(){
        return foodNumber;
    }

    public static Object getLock(){
        return lock;
    }

    public void getFood(){
        synchronized(getLock()){
            if(this.waitingForPickup){
                try{
                    System.out.println("Restaurant : Waiting for the waiter to deliver the food");
                    getLock().wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
        }
        waitingForPickup = true;
        System.out.println("Restaurant : Making food number"+foodNumber++);
        getLock().notifyAll();
        System.out.println("Restaurant : Telling the waiter to get food \n");
    }
    }
}

