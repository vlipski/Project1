package Task10_String;
// 2 and 3 task
public class Smile {
    public static void main(String[] args) {
        String smile = "( :( ggggggggggggg :( bbbbbbbbbbbbbb :( bbbbbbbbbb :(";
        String newSmile = smile.replace('(', ')');
        System.out.println(newSmile);
        System.out.println(comparSegment(smile,"("));
        System.out.println(comparSegment(newSmile,"("));
    }


    static boolean comparSegment(String string, String segment){
        return (string.endsWith(segment) && string.startsWith(segment));
    }
}
