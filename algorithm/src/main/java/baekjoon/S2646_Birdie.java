package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class S2646_Birdie {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        Graph graph = new Graph(people);

        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        int cycle = Integer.parseInt(br.readLine());

        for (int i = 0; i < cycle; i++) {
            StringTokenizer tmp = new StringTokenizer(br.readLine(), " ");
            int i1 = Integer.parseInt(tmp.nextToken());
            int i2 = Integer.parseInt(tmp.nextToken());

            graph.addEdge(i1, i2);
        }

        Graph.Node root = graph.nodes[from - 1];
        int i = graph.dfsRecursion(root, to, answer);

        if (i == 0) {
            System.out.println(-1);
        }else {
            System.out.println(i);
        }
    }


    static class Graph {
        class Node {
            int data;
            boolean marked;
            LinkedList<Node> adjacent;

            Node(int data) {
                this.data = data;
                this.marked = false;
                this.adjacent = new LinkedList<>();
            }
        }

        Node[] nodes;

        Graph(int size) {
            nodes = new Node[size];

            for (int i = 1; i <= size; i++) {
                nodes[i - 1] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node node1 = nodes[i1 - 1];
            Node node2 = nodes[i2 - 1];

            if (!node1.adjacent.contains(node2)) {
                node1.adjacent.add(node2);
            }
            if (!node2.adjacent.contains(node1)) {
                node2.adjacent.add(node1);
            }
        }

        int dfs(int from, int to) {
            Node root = nodes[from];
            root.marked = true;
            int count = 0;

            Stack<Node> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                Node pop = stack.pop();

                for (Node n : pop.adjacent) {
                    if (n.marked == false) {
                        n.marked = true;
                        stack.push(n);
                        count++;
                        if (n.data == to) {
                            return count;
                        }
                    }
                }
                count--;
            }

            return -1;
        }

        int dfsRecursion(Node node, int to, int count) {
            if (node.data == to) {
//                System.out.println(count);
                count += count;
                return count;
            }
            if (node == null) {
                return count;
            }

            count++;
            node.marked = true;
            for (Node n : node.adjacent) {
                if (n.marked == false) {
                    count = dfsRecursion(n, to, count);
                }
            }
            return --count;
        }

    }
}
