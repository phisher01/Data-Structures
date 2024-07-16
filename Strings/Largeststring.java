public class Largeststring {

    public static void main(String args[]){
        // String str1="Bbc";
        // String str2="aBC";
        // System.out.println(str1.compareTo(str2));   // compareTo fn is worked exactly like ascii values (lexicographic)
        // System.out.println(str1.compareToIgnoreCase(str2));        //compareTOIgnoreCase fn doesnt works like ascii value



        String Fruits[]={"apple", "Mango", "Banana"};
        String Largest=Fruits[0];
        for(int i=1;i<Fruits.length;i++){
            if(Largest.compareTo(Fruits[i])<0){
                Largest=Fruits[i];

            }


        }
        System.out.println(Largest);
    }
}