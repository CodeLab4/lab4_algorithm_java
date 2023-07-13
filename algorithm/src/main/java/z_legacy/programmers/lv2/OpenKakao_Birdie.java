package z_legacy.programmers.lv2;

public class OpenKakao_Birdie {
	/**
	 * from collections import deque
	 *
	 * def solution(record):
	 *     answer = []
	 *     command_queue = deque()
	 *     my_dic = {}
	 *
	 *     for i in record:
	 *         splited = i.split()
	 *         command = splited[0]
	 *         uuid = splited[1]
	 *         if len(splited) == 3:
	 *             nickname = splited[2]
	 *             my_dic[uuid] = nickname
	 *         command_queue.append((command, uuid))
	 *
	 *     for i in range(len(command_queue)):
	 *         tmp = command_queue.popleft()
	 *
	 *         command = tmp[0]
	 *         if command != 'Change':
	 *             uuid = tmp[1]
	 *             name = str(my_dic[uuid])
	 *             result = str(in_out(command))
	 *             a = (name + result)
	 *             answer.append(a)
	 *
	 *     return answer
	 *
	 * def in_out(input):
	 *     if input == 'Enter':
	 *         return '님이 들어왔습니다.'
	 *     elif input == 'Leave':
	 *         return '님이 나갔습니다.'
	 *
	 * record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
	 *
	 * print(solution(record))
	 */
}
