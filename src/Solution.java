import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int len = progresses.length;
        Queue<Integer> queue = new LinkedList<>();

        int index = 0;
        int count = 0;

        while (index < progresses.length) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            if (progresses[index] >= 100) {
                while (index < progresses.length && progresses[index] >= 100) {
                    count++;
                    index++;
                }
                queue.offer(count);
                count = 0;
            }
        }

        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }


        return answer;
    }
}