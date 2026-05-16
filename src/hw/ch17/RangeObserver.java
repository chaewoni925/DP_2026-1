package hw.ch17;

public class RangeObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        int n = generator.getNumber();
        
        if (0 <= n && n <10){
             System.out.println("RangeObserver: " + "[Low] " + generator.getNumber());
        } else if ( 10<= n && n <20) {
            System.out.println("RangeObserver: " + "[Mid] " + generator.getNumber());
        } else{
            System.out.println("RangeObserver: " + "[High] "+ generator.getNumber());
        }
           
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
    