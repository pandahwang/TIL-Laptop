package JAVA.Programmers;

class Ex_120821 {
    public int[] solution(int[] num_list) {
    int[] result = new int[num_list.length];
    int j=num_list.length-1;
    for(int i=0; i<num_list.length; i++){
      result[j] = num_list[i];
        j--;
        }
        return result;
    }
}