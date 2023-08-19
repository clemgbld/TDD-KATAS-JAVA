package paginatingAHugeBook;



public class BookNum {
    public static long pageDigits(long pages) {
       long result = pages;
       long max = 9L;
       while (pages > max){
           long diff = pages - max;
           result= (result - diff) + (2 * (diff));
           max = max * 10 + 9;
       }

       return result;
    }
}
