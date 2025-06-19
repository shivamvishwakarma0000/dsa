public class leetcode{
    public static void main(String[] args) {

        String caption = "shivam vishwakarma is googd boy";
        String[] words = caption.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(i==0){
                System.out.print("#"+words[i]);

            }
            else{

                String word = words[i];
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
                System.out.print(capitalized);
            }

        }

    }

}