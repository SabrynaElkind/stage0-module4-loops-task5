package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int j=1;j<=sideLength;j++){
                if (i==3||j==3){
                    System.out.print("8");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
