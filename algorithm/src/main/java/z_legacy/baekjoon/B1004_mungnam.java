package z_legacy.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1004_mungnam {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        Point start, destination, planet;
        List<Point> planetList;
        int T, N, answer;
        double startDistance, destinationDistance;
        boolean startFlag, destinationFlag;

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            answer = 0;
            planetList = new ArrayList<>();
            stringTokenizer = new StringTokenizer(br.readLine());
            start = new Point(Integer.parseInt(stringTokenizer.nextToken()),
                    Integer.parseInt(stringTokenizer.nextToken()));
            destination = new Point(Integer.parseInt(stringTokenizer.nextToken()),
                    Integer.parseInt(stringTokenizer.nextToken()));
            N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                stringTokenizer = new StringTokenizer(br.readLine());
                planetList.add(new Point(Integer.parseInt(stringTokenizer.nextToken()),
                        Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())));
            }

            /**
             * start와 destination를 포함하는 원의 갯수
             * but, start와 destination을 동시에 포함하는 원은
             * 카운트를 올리지 않음 !!
             * 원이 교접하는 경우는 없기 때문에 -> 이 경우만 생각하면 되지 않을까 ...?
             * 원 안에 start(destination)가 있는지 확인하려면
             * distance < r : 원 안에 있음
             * distance > r : 원 안에 없음
             */

            for (int j = 0; j < planetList.size(); j++) {
                planet = planetList.get(j);
                startDistance = Math.sqrt(Math.pow(planet.x - start.x, 2) + Math.pow(planet.y - start.y, 2));
                destinationDistance = Math.sqrt(
                        Math.pow(planet.x - destination.x, 2) + Math.pow(planet.y - destination.y, 2));
                // start는 planet 안에 포함되지 않음
                startFlag = !(startDistance > planet.r);
                destinationFlag = !(destinationDistance > planet.r);

                if (startFlag && destinationFlag) {
                    continue;
                }
                if (startFlag || destinationFlag) {
                    answer++;
                }
            }

            bw.write(Integer.toString(answer));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

class Point {

    int x, y, r;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
