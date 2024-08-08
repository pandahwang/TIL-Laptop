package JAVA.Programmers;

class Ex_120824 {
    public int[] solution(int[] num_list) {
        int ec = 0;
        int oc = 0;
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0) ec++; 
            else oc++;
        }
        int[] result = {ec,oc};
        return result;
    }
}