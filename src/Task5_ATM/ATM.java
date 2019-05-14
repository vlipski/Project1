package Task5_ATM;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    int cash20;
    int cash50;
    int cash100;
    int bufer;
    int summaCashATM;
    private static HashMap<Integer,CreditCard>numberCard;

    ATM(int cash20, int cash50, int cash100, int bufer){
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
        this.bufer = bufer;
        summaCashATM = cash20*20 + cash50*50 + cash100*100;
        numberCard = new HashMap<Integer,CreditCard>();
        numberCard.put(1001,CreditCard.LipskiVitali);
        numberCard.put(2002,CreditCard.vasya);
        numberCard.put(3003,CreditCard.SlabkoYuli);
        numberCard.put(4444, CreditCard.LipskayaSwetlana);
    }


    int numCard;
    void interaction() {
        System.out.print("вставте карту: ");
        Scanner num = new Scanner(System.in);
        numCard = num.nextInt();
        menu();
    }


        void menu(){
        System.out.print("введите пин-код: ");
        Scanner pin = new Scanner(System.in);
        int pinKod = pin.nextInt();
        if(validationPin(numCard, pinKod, numberCard.get(numCard))){
            System.out.println("выберете операцию:");
            System.out.println("1: баланс");
            System.out.println("2: снятие наличных");
            System.out.println("3: пополнение счета");
            System.out.println("4: перевод на другой счет");
            System.out.println("5: завершить работу");
            Scanner ch = new Scanner(System.in);
            int choose = ch.nextInt();
            switch (choose) {
                case 1:
                    balans(numberCard.get(numCard));
                    break;
                case 2:
                    withdrawСash(numberCard.get(numCard));
                    break;
                case 3:
                    depositAccount(numberCard.get(numCard));
                    break;
                case 4:
                    moneyTransfer(numberCard.get(numCard));
                    break;
                case 5:
                    finish();
                    break;
                default:
                    System.out.println("нет такой операции");
                    menu();
            }
        }else {
            System.out.println("пин-код не верный");
            System.out.println("1: ввести пин-код еще раз");
            System.out.println("2: забрать карту");
            Scanner pinNext = new Scanner(System.in);
            int pinKodNext = pinNext.nextInt();
            switch (pinKodNext){
                case 1: menu();
                       break;
                case 2: System.out.println("заберите карту");
            }
        }
    }


    boolean validationPin(int numCard, int pinKod, CreditCard be){
        if (pinKod ==  be.pinKod && numCard == be.numberAccount) {
            return true;
        } else {
            return false;
        }
    }


    void balans(CreditCard be){
        System.out.println("сумма на счете: "+be.balans+" рублей");
        proceed();
    }


     void withdrawСash(CreditCard be) {
         System.out.println(summaCashATM);
         System.out.println("доступные номиналы "+(cash20 > 0 ? "'20', " : "")+(cash50 > 0 ? "'50', " : "")+
                 (cash100 > 0 ? "'100' " : "")+ " введите сумму:");
         Scanner sum = new Scanner(System.in);
         int summa = sum.nextInt();
         int summaBalans = summa;
         if (be.balans < summa) {
             System.out.println("недостаточно средств на счете");
             proceed();
         } else if(summaCashATM < summa ){
             System.out.println("недостаточно средств в банкомате");
         } else {
             int i100 = 0;
             int i50 =0;
             int i20 = 0;
             for(;summa >= 100 && summa != 130 && summa != 110 && cash100 > 0; summa -= 100 , i100++ ,cash100--);
             for(;summa >= 50 && summa != 80 && summa != 60 && cash50 > 0; summa -= 50 , i50++ ,cash50--) {
                 if(summa % 4 == 0 && cash50 == 1){break;}
             }
             for(;summa >= 20 && cash20 > 0; summa -= 20 , i20++ ,cash20--);
             if(summa == 0) {
                 be.balans -= summaBalans;
                 summaCashATM -= summaBalans;
                 System.out.println("заберите деньги: " + (i100 > 0 ? i100 + "x'100' " : " ") + (i50 > 0 ? i50 + "x'50' " : " ") + (i20 > 0 ? i20 + "x'20'" : ""));
             }else{
                 cash100 += i100;
                 cash50 += i50;
                 cash20 += i20;
                 System.out.println("невозможно выдать нужную сумму");
             }
         }
         proceed();
     }


    void depositAccount(CreditCard be) {
        System.out.println("вложите купюры номиналом '20' , '50' или '100' рублей по одной в купюроприемник");
        Scanner ca = new Scanner(System.in);
        int cash = ca.nextInt();
        switch (cash) {
            case 20:
                cash20 += 1;
                be.balans += cash;
                bufer += cash;
                break;
            case 50:
                cash50 += 1;
                be.balans += cash;
                bufer += cash;
                break;
            case 100:
                cash100 += 1;
                be.balans += cash;
                bufer += cash;
                break;
            default:
                System.out.println("купюра возвращена, попробуйте еще раз");
                depositAccount(numberCard.get(numCard));
        }
        System.out.println("1: внести еще ");
        System.out.println("2: зачислить");
        Scanner choi = new Scanner(System.in);
        int choice = choi.nextInt();
        switch (choice) {
            case 1:
                depositAccount(numberCard.get(numCard));
                break;
            case 2:
                System.out.println("на ваш счет зачислено " + bufer + " рублей");
                bufer = 0;
                proceed();
        }
    }


    void moneyTransfer(CreditCard be){
        System.out.println("введите сумму перевода: ");
        Scanner transf = new Scanner(System.in);
        int transfer = transf.nextInt();
        if(transfer > be.balans){
            System.out.println("недостаточно средств на счете");
            proceed();
        }else {
            System.out.println("введите номер счета: ");
            Scanner acc = new Scanner(System.in);
            int numAccount = acc.nextInt();
            numberCard.get(numAccount).balans += transfer;
            be.balans -= transfer;
            System.out.println("на счет " + numAccount+ " зачислено " + transfer+ "р.");
            proceed();
        }
    }


    void proceed(){
        System.out.println("1: забрать карту");
        System.out.println("2: продолжить");
        Scanner val = new Scanner(System.in);
        int valu = val.nextInt();
        switch (valu){
            case 1: finish();
                    break;
            case 2: menu();
        }
    }


    void finish(){
        System.out.println("заберите карту");
        String finish = "stop";
        Scanner st = new Scanner(System.in);
        String stop = st.next();
        if(stop.equals(finish)){

        }
        else {
            interaction();
        }
    }
}


class ATMdemo {

    public static void main(String[] args){
        ATM sberbank = new ATM(20,3 ,2, 0);
        sberbank.interaction();
    }
}