package Task12_Generics;

public class Program{

    public static void main(String[] args) {

        Account<Integer> acc1 = new Account(2334, 5000); // id - число
        Integer acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<String> acc2 = new Account("sid5523", 5000);// id - строка
        String acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}

class Account<T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

