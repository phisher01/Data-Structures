

public class subsets {
    public static void findSubset(String str,StringBuilder sb,int i){
        if(i==str.length()){
            // if((sb.toString()).length()==0){
            //     System.out.println("Null");
            //     // sb.deleteCharAt(sb.length-1);
            // }else{

                System.out.println(sb.toString());
            // }
            return;
        }
        sb.append(str.charAt(i));
        findSubset(str, sb ,i+1);  ///yes choice
        sb.deleteCharAt(sb.length()-1);
        
        // sb.append("_");
        findSubset(str, sb, i+1);        //no choice
        // sb.deleteCharAt(sb.length()-1);
        
    }


    // public static void findSubset(String str,String empty,int i){
    //     if(i==str.length()){
    //         if(empty.length()==0){
    //             System.out.println("Null");
    //         }else{

    //             System.out.println(empty);
    //         }
    //             return;
    //     }
    
    //     findSubset(str, empty+str.charAt(i), i+1);  ///yes choice
    //     findSubset(str, empty, i+1);        //no choice

    // }
    public static void main(String[] args) {
        String str="abc";
        StringBuilder sb=new StringBuilder("");

        findSubset(str,sb, 0);
        

        
    }
    
}
