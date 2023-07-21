public class Looping {

    public void loopString(String str){
        for (int i = 0; i < str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }

    public void loopStringWhile(String str, int count){
        while( count <= 5){
            System.out.println(str);
            count++;
        }


    }
}
