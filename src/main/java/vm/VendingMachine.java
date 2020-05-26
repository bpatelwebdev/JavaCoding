package vm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VendingMachine {
    private final Logger LOGGER = LogManager.getLogger();
    private State state;
    private int milkLevel;
    private int coffeeLevel;
    private float requirePayment;
    private Drink readyDrink;
    public int something;

    public VendingMachine(){
        LOGGER.info("creating vending machine");
        state = State.STOPPED;
        milkLevel=0;
        coffeeLevel=0;
        requirePayment=0;
    }

    public void start() {
        LOGGER.info("starting vending machine");
        this.state=State.STARTED;
    }

    public State getState() {
        return this.state;
    }

    public void refillMilk(int milkLevel) throws VendingMachineException {
        LOGGER.info("refilling milk new level:" + milkLevel);
        if(!this.state.equals(State.STOPPED)) {
            this.milkLevel += milkLevel;
            updateState();
        }else{
            LOGGER.warn("Vending machine is in stopped state");
            throw new VendingMachineException("Vending Machine is in stopped state");
        }
    }

    private void updateState() {
        LOGGER.info("updating stae of vending machine");
        if(this.milkLevel>=100 && this.coffeeLevel>=5){
            this.state = State.IDLE;
        }
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public void refillCoffee(int coffee) throws VendingMachineException {
        if(!this.state.equals(State.STOPPED)) {
            this.coffeeLevel += coffee;
            updateState();
        }else{
            throw new VendingMachineException("Vending Machine is in stopped state");
        }
    }

    public int getCoffeeLevel() {
        return coffeeLevel;
    }

    public void requestMyDrink(Drink drink) throws VendingMachineException {
        if(this.state.equals(State.IDLE)){
            this.state = State.WAITINGPAYMENT;
            switch (drink){
                case EXPRESSO: this.requirePayment = 1.75f;
                this.readyDrink = drink;
            }
        }else{
            throw  new VendingMachineException("Machine is not in idle state");
        }
    }

    public double makePayment(double payment) {
        float tmpRequirePayment = requirePayment;
        requirePayment = 0;
        state = State.PAYMENTRECIVED;
        return payment-tmpRequirePayment;
    }

    public Drink filDrink() {
        state= State.IDLE;
        return readyDrink;
    }
}
