package phoneWords;


public class PhoneWords {

    public static String phoneWords(String str) {
        return str == null || str.isBlank() ? "" : str
                .replaceAll("222", "c")
                .replaceAll("22", "b")
                .replaceAll("2", "a")
                .replaceAll("333", "f")
                .replaceAll("33", "e")
                .replaceAll("3", "d")
                .replaceAll("444", "i")
                .replaceAll("44", "h")
                .replaceAll("4", "g")
                .replaceAll("555", "l")
                .replaceAll("55", "k")
                .replaceAll("5", "j")
                .replaceAll("666", "o")
                .replaceAll("66", "n")
                .replaceAll("6", "m")
                .replaceAll("7777", "s")
                .replaceAll("777", "r")
                .replaceAll("77", "q")
                .replaceAll("7", "p")
                .replaceAll("888", "v")
                .replaceAll("88", "u")
                .replaceAll("8", "t")
                .replaceAll("9999", "z")
                .replaceAll("999", "y")
                .replaceAll("99", "x")
                .replaceAll("9", "w")
                .replaceAll("0", " ")
                .replaceAll("1", "");
    }

}