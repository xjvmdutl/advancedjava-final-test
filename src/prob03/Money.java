package prob03;

public class Money {

	private int amount;
    public Money(int amount){
    	this.amount=amount;
    }
    @Override
    public boolean equals(Object m) {
    	if(m instanceof Money)
    		return (((Money) m).getAmount()==this.amount);
    	return false;
    }
    public int getAmount() {
    	return amount;
    }
    public void setAmount(int a) {
    	amount=a;
    }
    public Money add(Money m){
    	return new Money(amount+m.getAmount());
    }
    public Money minus(Money m){
    	return new Money(amount-m.getAmount());
    }
    public Money multiply(Money m){
    	return new Money(amount*m.getAmount());
    }
    public Money devide(Money m){
    	return new Money(amount/m.getAmount());
    }
}
