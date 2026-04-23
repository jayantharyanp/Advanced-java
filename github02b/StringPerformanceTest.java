package github02b;

public class StringPerformanceTest {
    public static void main(String[] args) {

        // Test for StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " 
                           + (endTimeBuffer - startTimeBuffer) + " ms");

        // Test for StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " 
                           + (endTimeBuilder - startTimeBuilder) + " ms");
    }
}