package Task10_String;

public class Zero {
    public static void main(String[] args) {
        long startBuild = System.currentTimeMillis();
        for (long i = 10000000; i < 100000000; i++) {
            meaningZero(i);
    //        meaningZero1(i);
     //       meaningZero2(i);
   //         meaningZero3(i);
        }
        long finishBuild = System.currentTimeMillis() - startBuild;
        System.out.println(finishBuild);
    }

    static String[] zero = {"000000000","00000000","0000000","000000","00000","0000","000","00","0"};
    static StringBuilder meaningZero(long num){
       return new StringBuilder(zero[getCountsOfDigits(num)]).append(num);
    }

    static String meaningZero1(long num) {
        StringBuilder number = new StringBuilder("000000000").append(num);
        return number.substring(number.length() - 10);
    }

    static String meaningZero2(long num) {
        String number = Long.toString(num + 10000000000L);
        return number.substring(number.length() - 10);
    }

    static String meaningZero3(long num)
    {
        return  String.format("%010d" , num);
    }

    public static int getCountsOfDigits(long n) {
        if (n < 100000) {
            if (n < 100) {
                if (n < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (n < 1000) {
                    return 3;
                } else {
                    if (n < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (n < 10000000) {
                if (n < 1000000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (n < 100000000) {
                    return 8;
                } else {
                    if (n < 1000000000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }

}



