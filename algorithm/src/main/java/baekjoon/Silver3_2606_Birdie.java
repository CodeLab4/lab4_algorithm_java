package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver3_2606_Birdie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computers = Integer.parseInt(br.readLine());
        Graph graph = new Graph(computers);

        int computerPair = Integer.parseInt(br.readLine());

        for (int i = 0; i < computerPair; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            graph.addEdge(i1, i2);
        }

        int answer = graph.dfs(0);

        System.out.println(answer - 1);

    }

    static class Graph {
        class Node {
            int data;
            boolean marked;
            int count;
            LinkedList<Node> adjacent;

            Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<>();
            }

        }

        Node[] nodes;
        Graph(int size) {
            nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1 - 1];
            Node n2 = nodes[i2 - 1];

            if (!n1.adjacent.contains(n2)) {
                n1.adjacent.add(n2);
            }
            if (!n2.adjacent.contains(n1)) {
                n2.adjacent.add(n1);
            }
        }

        void dfs() {
            dfs(0);
        }

        int dfs(int index) {
            int count = 0;
            Node root = nodes[index];
            Stack<Node> stack = new Stack<>();
            root.marked = true;

            stack.push(root);

            while (!stack.isEmpty()) {
                Node r = stack.pop();

                for (Node n : r.adjacent) {
                    if (n.marked == false) {
                        n.marked = true;
                        stack.push(n);
                    }
                }
                count++;
            }

            return count;
        }
    }
}
