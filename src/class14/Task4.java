package class14;

public class Task4 {
    public static void main(String[] args) {
        /* How would yoiu reverse a String word by word? 
         */
        String str="This is sentence I want to reverse";
        String [] arr=str.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i <arr.length ; i++) {
            String word=arr[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            arr[i]=stringBuilder.toString();
            st.append(arr[i]).append(" ");
            
        }
        System.out.println(st);
        
    }
}
