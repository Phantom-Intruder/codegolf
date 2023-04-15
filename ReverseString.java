public class ReverseString {
    public static void main(String[] args){
        System.out.println(extracted());
    }

    private static char[] rev(char[] sentence){
        int left = 0;
        int right = sentence.length - 1;
        char temp;

        while (right > left) {
            temp = sentence[right];
            sentence[right] = sentence[left];
            sentence[left] = temp;
            right--;
            left++;
        }

        return sentence;
    }

    private static String extracted() {
        String sentence = "We love Python";

        char[] sentenceArr = sentence.toCharArray();
        rev(sentenceArr);

        int start = 0;

        for (int i = 0; i < sentenceArr.length; i++) {
            if (sentenceArr[i] != ' '){
                start++;
            }
            while (start > 0){
                char temp = sentenceArr[start];
                sentenceArr[i - start + 1] = sentenceArr[start];
                sentenceArr[start] = temp;
                start--;
            }
        }

        System.out.println(sentenceArr);

        return sentence;
    }
}
