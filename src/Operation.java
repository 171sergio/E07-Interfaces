
import java.util.Date;

public abstract class Operation implements ITaxa{

    protected Date date;

    protected char type;

    protected double amount;

    public static int totOperations=0;

    public Operation(char type, double amount) {
        this.type = type;
        this.amount = amount;
        date = new Date();
        totOperations++;
    }

    @Override
    public String toString(){
        String opStr;

        opStr = "Data : " + getDate() + "Tipo : " + getType() + "Valor : " + getAmount();

        return opStr;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if(type=='d' || type=='s'){
            this.type = type;
        }else{
            System.err.println("Erro, valores aceitos em type: s/d");;
            System.exit(1);
        }

    }

}