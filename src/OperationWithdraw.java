public class OperationWithdraw extends Operation {
    public OperationWithdraw(float amount) {
        super('s', amount);
    }

    @Override
    public String toString() {
        return "Data : " + getDate() + " Tipo : " + getType() + " Valor : " + getAmount();
    }

    @Override
    public double calculateTax() {
        return 0.05;
    }
}
