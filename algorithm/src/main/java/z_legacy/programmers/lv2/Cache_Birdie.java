package z_legacy.programmers.lv2;

public class Cache_Birdie {
	/**
	 * from collections import deque
	 *
	 * def solution(cacheSize, cities):
	 *     answer = 0
	 *     cache = deque()
	 *
	 *     for i in cities:
	 *         city = i.upper()
	 *         if city in cache:
	 *             answer += 1
	 *             cache.remove(city)
	 *             cache.append(city)
	 *
	 *         else:
	 *             answer += 5
	 *             cache.append(city)
	 *
	 *
	 *         if len(cache) > cacheSize:
	 *             cache.popleft()
	 *
	 *     return answer
	 *
	 * cacheSize = 3
	 * cities = ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
	 * # print(solution(cacheSize, cities))
	 *
	 * cacheSize2 = 3
	 * cities2 = ["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]
	 * # print(solution(cacheSize2, cities2))
	 *
	 * cacheSize3 = 2
	 * cities3 = "Jeju", "Pangyo", "NewYork", "newyork"
	 * print(solution(cacheSize3, cities3))
	 */
}
