package ch04.examples;

public class Triangle {
    public static void triangle(int a){
        int[][] triangle = new int[a][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = i + j;
                System.out.print(triangle[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
