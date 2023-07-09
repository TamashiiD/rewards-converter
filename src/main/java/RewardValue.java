
public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue){
    this.cashValue = cashValue;
    convertToMiles();
    }
    public void convertToMiles(){
    milesValue = cashValue / 0.0035;
    }


    public double getMilesValue() {
        return milesValue;
    }
}


