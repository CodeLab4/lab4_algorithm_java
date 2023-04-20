package z_legacy.programmers.lv2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class ParkingFeeCalculation_mungnam {

    /**
     * 분명 코드 실행을 했을 때 테스트 케이스는 문제 없이 통과했다.
     * 하지만 계속 제출하면 런타임 에러가 무수히 많이 떴는데, 도저히 해결 방법을 몰랐다.
     * 그렇게 구글링을 해 본 결과, 72행에서 remove를 하는 과정에서 문제가 있는 것 같았다.
     * 런타임 에러가 발생했던 이유는 아마 remove가 실행 되면서 동시성 오류가 발생했기에 그랬던 것 같다.
     * 비교적 문제가 되는 부분을 빨리 찾아서 다행이었다.
     * 하마터면 주화입마에 들 뻔했던 문제 ...
     */

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 기본 시간(분), 기본 요금(원), 단위 시간(분), 단위 요금(원)
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        int[] result = solution(fees, records);

        bw.write(Arrays.toString(result));
        bw.newLine();

        bw.flush();
        bw.close();
    }

    public static int[] solution(int[] fees, String[] records) {

        String carNumber, inTime, outTime;
        int totalTime, fee;

        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];


        Map<String, String> carNumberWithTime = new HashMap<>();
        Map<String, Integer> carNumberWithTotalTime = new HashMap<>();
        for (String record : records) {
            String[] splittedRecord = record.split(" ");        // 시각 | 차량 번호 | 내역
            carNumber = splittedRecord[1];      // 차량 번호
            if (splittedRecord[2].equals("IN")) {       // 차량 입차 시
                if (!carNumberWithTotalTime.containsKey(carNumber)) {        // carNumberWithCost에 해당 carNumber가 없다면 추가
                    carNumberWithTotalTime.put(carNumber, 0);
                }
                carNumberWithTime.put(carNumber, splittedRecord[0]);        // carNumberWithTime에 입차 시간과 차량 번호 등록
                continue;
            }
            // 차량 출차 시
            outTime = splittedRecord[0];        // 출차 시간
            inTime = carNumberWithTime.get(carNumber);      // 입차 시간
            totalTime = calculateTime(inTime, outTime);     // 분으로 나타낸 총 시간
            totalTime += carNumberWithTotalTime.get(carNumber);
            carNumberWithTotalTime.put(carNumber, totalTime);
            carNumberWithTime.remove(carNumber);
        }
        if (!carNumberWithTime.isEmpty()) {     // 비어있지 않다면 -> 23:59분에 출차했다는 뜻으로 간주
            for (Map.Entry<String, String> entry : carNumberWithTime.entrySet()) {
                carNumber = entry.getKey();
                outTime = "23:59";
                inTime = carNumberWithTime.get(carNumber);
                totalTime = calculateTime(inTime, outTime);
                totalTime += carNumberWithTotalTime.get(carNumber);
                carNumberWithTotalTime.put(carNumber, totalTime);
//                carNumberWithTime.remove(carNumber);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = carNumberWithTotalTime.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            carNumber = entry.getKey();
            totalTime = entry.getValue();
            if (totalTime <= defaultTime) {     // 총 주차 시간이 기본 시간보다 작거나 같을 경우
                fee = defaultFee;
                carNumberWithTotalTime.put(carNumber, fee);
                continue;
            }
            // 총 주차 시간이 기본 시간보다 클 경우
            fee = defaultFee;
            if ((totalTime - defaultTime) % unitTime != 0) {        // 올림이 필요한 경우
                fee += ((totalTime - defaultTime) / unitTime + 1) * unitFee;
            } else {
                fee += (totalTime - defaultTime) / unitTime * unitFee;
            }
            carNumberWithTotalTime.put(carNumber, fee);
        }


        entrySet = carNumberWithTotalTime.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);

        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        int[] result = new int[carNumberWithTotalTime.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = entryList.get(i).getValue();
        }

        return result;
    }

    public static int calculateTime(String inTime, String outTime) {
        int totalTime;
        String[] splittedInTime = inTime.split(":");
        String[] splittedOutTime = outTime.split(":");
        int hours = Integer.parseInt(splittedOutTime[0]) - Integer.parseInt(splittedInTime[0]);
        int minutes = Integer.parseInt(splittedOutTime[1]) - Integer.parseInt(splittedInTime[1]);
        if (minutes < 0) {
            hours -= 1;
            minutes += 60;
        }
        totalTime = hours * 60 + minutes;
        return totalTime;
    }
}
