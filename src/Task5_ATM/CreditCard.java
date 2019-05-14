package Task5_ATM;

public class CreditCard {
    int pinKod;
    int balans;
    int numberAccount;


    CreditCard(int pinKod, int balans, int numberAccound) {
        this.pinKod = pinKod;
        this.balans = balans;
        this.numberAccount = numberAccound;

    }

      static CreditCard LipskiVitali = new CreditCard(1111, 5000, 1001);
      static CreditCard vasya = new CreditCard(2222, 600, 2002);
      static CreditCard SlabkoYuli = new CreditCard(3333, 900,3003);
      static CreditCard LipskayaSwetlana = new CreditCard (4410, 1000000000, 4444);
}
