// String 클래스의 메서드

package chap_09;

public class _11_Example {
    public static void main(String[] args) {
        // 1) public char charAt(int index)
        String s1 = "abc";
        System.out.println(s1.charAt(0)); // a

        // 2) public int compareTo(String anotherString)
        String s2 = "aaa";
        String s3 = "bbb";
        System.out.println(s2.compareTo(s3)); // -1

        String s4 = "aaa";
        String s5 = "aaa";
        System.out.println(s4.compareTo(s5)); // 0

        String s6 = "bbb";
        String s7 = "aaa";
        System.out.println(s6.compareTo(s7)); // 1

        // 3) public String concat(String str)
        String s8 = "abc";
        String s9 = "def";
        System.out.println(s8.concat(s9)); // abcdef

        // 4) public boolean contains(CharSequence s)
        String s10 = "abc";
        String s11= "bc";
        System.out.println(s10.contains(s11)); // true

        // 5-1) public boolean startsWith(String prefix)
        // 5-2) public boolean endsWith(String suffix)
        String s12 = "abc";
        String s13= "bc";
        System.out.println(s12.startsWith(s13)); // false
        System.out.println(s12.endsWith(s13)); // true

        // 6-1) public boolean equals(Object anObject)
        String s14 = "abc";
        String s15= "bc";
        System.out.println(s14.equals(s15)); // false

        // 6-2) public boolean equalsIgnoreCase(String anotherString)
        String s16 = "abc";
        String s17 = "ABC";
        System.out.println(s16.equalsIgnoreCase(s17)); // true

        // 7-1) public int indexOf(int ch)
        String s18 = "abcde";
        String s19 = "a";
        String s20 = "b";
        System.out.println(s18.indexOf(s19)); // 0
        System.out.println(s18.indexOf(s20)); // 1

        // 7-2) public int indexOf(int ch, int fromIndex)
        // 7-3) public int indexOf(String str)
        String s21 = "abcde";
        System.out.println(s21.indexOf("c", 1)); // 2
        System.out.println(s21.indexOf("c", 2)); // 2
        System.out.println(s21.indexOf("c", 3)); // -1
        System.out.println(s21.indexOf("bcd")); // 1

        // 7-4) public int lastIndexOf(int ch)
        // 7-5) public int indexOf(String str)
        String s22 = "abc.abc.abc";
        System.out.println(s22.lastIndexOf(".")); // 7
        // System.out.println(s22.indexOf(".")); // 3
        System.out.println(s22.lastIndexOf("abc")); // 8
        // System.out.println(s22.indexOf("abc")); // 0

        // 8) public int length()
        String s23 = "abc";
        System.out.println(s23.length()); // 3

        // 9-1) public String[] split(String regex)
        String s24 = "abc,def,ghi";
        String[] arr1 = s24.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        /*
        arr1[0] = abc
        arr1[1] = def
        arr1[2] = ghi
        */

        // 9-2) public String[] split(String regex, int limit)
        String[] arr2 = s24.split(",", 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        /*
        arr2[0] = abc
        arr2[1] = def,ghi
        */

        // 10-1) public String substring(int beginIndex)
        // 10-2) public String substring(int beginIndex, int endIndex)
        String s25 = "abc.def.ghi";
        System.out.println(s25.substring(4)); // def.ghi
        System.out.println(s25.substring(4, 7)); // def

        // 11-1) public String toLowerCase()
        // 11-2) public String toUpperCase()
        String s26 = "abcABC";
        System.out.println(s26.toLowerCase()); // abcabc
        System.out.println(s26.toUpperCase()); // ABCABC

        // 12) public String trim()
        String s27 = "   a  b  c   ";
        System.out.println(s27.trim()); // a  b  c

        // 13-1) static String valueOf(boolean b)
        String b = String.valueOf(true);
        System.out.println(b); // "true"

        // 13-2) static String valueOf(char c)
        String c = String.valueOf('a');
        System.out.println(c); // "a"

        // 13-3) static String valueOf(int i)
        String i = String.valueOf(100);
        System.out.println(i); // "100"

        // 13-4) static String valueOf(long l)
        String l = String.valueOf(100L);
        System.out.println(l); // "100"

        // 13-5) static String valueOf(float f)
        String f = String.valueOf(100f);
        System.out.println(f); // "100.0"

        // 13-6) static String valueOf(double d)
        String d = String.valueOf(100.0);
        System.out.println(d); // "100.0"

        // 13-7) static String valueOf(Object o)
        java.util.Date d1 = new java.util.Date();
        String d2 = String.valueOf(d1);
        System.out.println(d2); // Tue Nov 28 16:01:45 KST 2023
        System.out.println(d1.toString()); // Tue Nov 28 16:01:45 KST 2023
    }
}