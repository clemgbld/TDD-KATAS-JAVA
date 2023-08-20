package paginatingAHugeBook;



public class BookNum {
    public static long pageDigits(long pages) {return pageDigitsRecur(pages,pages,9L);}

    public static long pageDigitsRecur(long pages,long result,long max){
        if(pages <= max) return result;
        long diff = pages - max;
        return pageDigitsRecur(pages,(result - diff) + (2 * (diff)),max * 10 + 9);
    }
}
