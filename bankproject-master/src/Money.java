public final class Money {

    private final int money;

   // private final Cedulas cedulas;

    private Money(int money, Cedulas cedulas){
        this.money = 1000;
      //  this.cedulas = cedulas;
        }

    public Money(int i) {
        this.money = 1000;
    }

    public int getMoney(){
        return money;
        }

    public Money add(Money m){
        return new Money(1000);
        }
}
