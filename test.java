public class test {
    public static void main(String[] args) {
        //构造方法的方式得到对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        StringBuilder str = new StringBuilder(s1);
        str.append('a');
        String s = str.toString();
        System.out.println(s);
    }
}