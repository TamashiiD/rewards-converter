
public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){
    this.cashValue = Math.round(cashValue);
    convertToMiles();
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        convertToCash();
    }
    private double convertToCash(){
       return cashValue = Math.round(milesValue * 0.0035);
    }
    private int convertToMiles(){
    return (int) ( cashValue / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles();
    }
}
///this is the answer they gave//// different from what I wrote....But it passed the test so....
///public class RewardValue {
//    private final double cashValue;
//    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
//
//    public RewardValue(double cashValue) {
//        this.cashValue = cashValue;
//    }
//
//    public RewardValue(int milesValue) {
//        this.cashValue = convertToCash(milesValue);
//    }
//
//    private static int convertToMiles(double cashValue) {
//        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
//    }
//
//    private static double convertToCash(int milesValue) {
//        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
//    }
//
//    public double getCashValue() {
//        return cashValue;
//    }
//
//    public int getMilesValue() {
//        return convertToMiles(this.cashValue);
//    }
//}
