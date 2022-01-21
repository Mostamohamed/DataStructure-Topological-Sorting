
package question3;

import java.util.Scanner;
public class Question3 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m, r, x, y;
        System.out.println("Enter nnumber of islands");
        n = s.nextInt();
        System.out.println("Enter the number of one-way bridges ");
        m = s.nextInt();
        System.out.println("enter the inslad you are intially on");
        r = s.nextInt();
        int graph_matrix[][] = new int[n + 1][n + 1];
        System.out.println("Enter the connections");
        for (int i = 0; i < m; i++) {
            x = s.nextInt();
            y = s.nextInt();

            graph_matrix[x][y] = 1;
        }

        TopologicalSorting h = new TopologicalSorting();
        int a[] = null;
        a = h.topological(graph_matrix, r);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != 0) {
                System.out.println("the island he will stuck on : " + a[i]);
                break;
            }
        }

    }
}

    
    

