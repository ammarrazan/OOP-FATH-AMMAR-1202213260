public class Waiters implements Runnable{
    private int orderQty,customerID,foodPrice;
    public Waiters(int orderQty,int customerID){
        this.orderQty = orderQty;
        this.customerID = customerID;
        this.foodPrice = 25000; 
    }

    public void run(){
        while(true){
            getFood();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    public void orderinfo(){
        System.out.println("=================================");
        System.out.println("Customer ID : " + this.customerID);
        System.out.println("Number of food : " + this.orderQty);
        System.out.println("Total Price : " + (this.orderQty * this.foodPrice));
        System.out.println("================================");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter : Food is ready to deliver");
            Restaurant rest = new Restaurant();
            rest.setWaitingForPickup(false);
            if(rest.getFoodNumber() == this.orderQty + 1){
                orderinfo();
                System.exit(0);
            }
            rest.getLock().notifyAll();
            System.out.println("waiter : Tell the restaurant to make another food \n");
        }
    }
}

