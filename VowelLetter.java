package PractTasks5;

/* Напишите программу, которая бы определяла, является ли введённая буква
*  (символ) гласной (постарайтесь сделать данное задание всеми возможными и
*  невозможными способами; не обращайте внимание на запреты требования).*/

public class VowelLetter {
    public static void main(String[] args) {
        System.out.println(CheckLetter.isVowel('A'));
        System.out.println(CheckLetter.isVowel('c'));
        System.out.println((int)'Y');
        System.out.println(CheckLetter.isVowel2((char)141));
    }
}

class CheckLetter{
    private final static  char a = 'a';
    private final static  char e = 'e';
    private final static  char i = 'i';
    private final static  char o = 'o';
    private final static  char u = 'u';
    private final static  char y = 'y';
    private final static int registr = 32;
    private final static int x1 = 97, x2 = 101, x3 = 105, x4 = 111, x5 = 117, x6 = 121;

    public static boolean isVowel(char let){
        boolean status = false;

        if(let == a || let == e || let == i || let == u || let == o ||
            let == y || let == a - registr || let == e - registr ||
        let == i - registr || let == o - registr || let == u - registr ||
        let == y - registr){
            status = true;
        }
        return status;
    }

    public static boolean isVowel2(char let){
        boolean status = false;

        if(let == x1 || let == x1 - registr || let == x2 || let == x2 - registr || let == x3 ||
                let == x3 - registr || let == x4 || let == x4 - registr || let == x5 ||
                let == x5 - registr || let == x6 || let == x6 - registr ){
            status = true;
        }
        return status;

    }
}
