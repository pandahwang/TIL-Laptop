public class Ex_181886 {
    public String[] solution(String[] names) {
        String[] answer;

        int count =  names.length / 5;
        if(names.length % 5 != 0) count++;
        String[] temp = new String[count];
        
        for(int i=0; i<count; i++){
            temp[i] = names[i*5];
        }
        answer = temp;
        return answer;
    }
}

/*
    names 길이 / 5 한 값 만큼 반복
    5명씩 묶은 그룹의 첫번째 사람 인덱스 번호 = 0, 5, 10, 15..
    그럼 i=0일때 0, i=1일때 5, i=2일때 10 으로 하려면
    인덱스 번호는 i*5
 */