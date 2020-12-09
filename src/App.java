public class App {
    public static void main(String[] args) {
        //nbcbs!
        StringBuffer strBuff=new StringBuffer();
        String word="NCIS";
        String merged;
        char[] otherWord={'B','o','b','!'};
        for(int i=0;i<=otherWord.length-1;i++){
            if(word.charAt(i)!='I' && word.charAt(i)!='o'){
                strBuff.append(word.charAt(i));
            }


            if(otherWord[i]!='I' && otherWord[i]!='o'){
                strBuff.append(otherWord[i]);
            }
            
        }
        merged=strBuff.toString();
        System.out.println(merged);
    }
}
