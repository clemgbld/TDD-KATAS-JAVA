package ascendDescendRepeat;

public class AscendDescend {
    public static String ascendDescend(int length, int min, int max) {
        if (min > max) return "";
        return min == max ? Integer.toString(max).repeat(length) : ascendDescendRecur(length, min, max, true, min, "");
    }

    private static String ascendDescendRecur(int length, int min, int max, boolean isAscend, int currentNum, String numSequence) {
        if (numSequence.length() > length) return numSequence.substring(0, length);
        if (isAscend)
            return ascendDescendRecur(length, min, max, currentNum + 1 <= max, Math.min(currentNum + 1, max), numSequence + currentNum);
        int newCurrentNumber = currentNum - 1;
        return ascendDescendRecur(length, min, max, newCurrentNumber == min, newCurrentNumber == min ? min + 1 : newCurrentNumber, numSequence + newCurrentNumber);
    }
}
