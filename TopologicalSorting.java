
package question3;


public class TopologicalSorting {
    
    final private Stack stack;

    public TopologicalSorting() {
        this.stack = new Stack();
    }

    public int[] topological(int adjacency_matrix[][], int r) throws NullPointerException {
        int number_of_nodes = adjacency_matrix[r].length - 1;
        int[] topological_sort = new int[number_of_nodes + 1];
        int pos = 1;
        int j;
        int visited[] = new int[number_of_nodes + 1];
        int element = r;
        int i = r;
        visited[r] = 1;
        stack.push(r);
        while (!stack.isEmpty()) {
            element = stack.peek();
            while (i <= number_of_nodes) {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 1 && stack.contains(i)) {
                    System.out.println("TOPOLOGICAL SORT NOT POSSIBLE");
                    return null;
                }
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    continue;
                }
                i++;
            }
            j = stack.pop();
            topological_sort[pos++] = j;
            i = ++j;
        }
        return topological_sort;
    }
}
