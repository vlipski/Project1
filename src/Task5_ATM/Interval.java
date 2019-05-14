package Task5_ATM;

class Interval {
    private int sec;
    private int min;
    private int hour;

    Interval(int sec, int min, int hour){
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    Interval(int sec){
        hour = sec / 3600;
        min = (sec % 3600) / 60;
        this.sec = sec - (hour * 3600 + min * 60);
    }

    void prin(){
    System.out.println(hour + "часов");
    System.out.println(min + "минут");
    System.out.println(sec + "секунд");
    System.out.println();
    }
}


class IntervalDemo{
    public static void main(String[] args){
        Interval vork = new Interval(10 ,20, 8);
        Interval relax = new Interval(6005);

        vork.prin();
        relax.prin();
    }
}
