package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd =  st.nextToken();


            switch (cmd) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;
                case "pop" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                        //else sb.append(last).append("\n");
                    else {
                        int lastVal = 0;
                        Iterator<Integer> iter = queue.iterator();

                        while(iter.hasNext()) {
                            lastVal = iter.next();
                        }
                        sb.append(lastVal).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
