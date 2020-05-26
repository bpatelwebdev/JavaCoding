package vm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import vm.Drink;
import vm.State;
import vm.VendingMachine;
import vm.VendingMachineException;

public class VendingMachineTest {
    private final Logger LOGGER = LogManager.getLogger();
    VendingMachine vm;
    @BeforeMethod
    public void bootUpVendingMachine(){
        vm = new VendingMachine();
        vm.start();
    }

    @Test()
    public void toTestBootOfVendingMachine(){
        LOGGER.error("error");
        try {
            Assert.assertEquals(State.IDLE, vm.getState());
        }catch (Error e){
            LOGGER.error(e);
            throw e;
        }
    }

    @Test()
    public void toTestRefillMilk() throws VendingMachineException {
       vm.refillMilk(1000);
       Assert.assertEquals(1000,vm.getMilkLevel());
    }

    @Test()
    public void toTestRefillMilkSecondTime() throws VendingMachineException {
        vm.refillMilk(100);
        vm.refillMilk(900);
        Assert.assertEquals(1000,vm.getMilkLevel());
    }
    @Test(groups = {"not-pre-filled"})
    public void toTestRefillCoffee() throws VendingMachineException {
        vm.refillCoffee(1000);
        Assert.assertEquals(1000,vm.getCoffeeLevel());
    }

    @Test()
    public void toTestRefillCoffeeSecondTime() throws VendingMachineException {
        vm.refillCoffee(100);
        vm.refillCoffee(900);
        Assert.assertEquals(1000,vm.getCoffeeLevel());
    }

    private void preRefill() throws VendingMachineException {
        vm.refillCoffee(100);
        vm.refillMilk(1000);
    }

    @Test()
    public void requestDrink() throws VendingMachineException {
        preRefill();
        vm.requestMyDrink(Drink.EXPRESSO);
        double change = vm.makePayment(10);
        Drink dr = vm.filDrink();
        Assert.assertEquals(Drink.EXPRESSO,dr);
        Assert.assertEquals(8.25,change);
        Assert.assertEquals(vm.getState(),State.IDLE);
    }
}
