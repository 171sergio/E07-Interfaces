public class OperationDeposit extends Operation {
    public OperationDeposit(float amount) {
        super('d', amount);
    }

    @Override
    public String toString() {
        return "Data : " + getDate() + " Tipo : " + getType() + " Valor : " + getAmount();
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
