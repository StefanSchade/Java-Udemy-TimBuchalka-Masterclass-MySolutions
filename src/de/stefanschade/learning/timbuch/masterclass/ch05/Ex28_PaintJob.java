package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex28_PaintJob {

        public static int getBucketCount(double area, double areaPerBucket) {

            if (area <= 0 || areaPerBucket <= 0) {
                return -1;
            }

            double bucketsNeeded = (area / areaPerBucket) + 0.5;
            int bucketsNeededInt = (int) Math.round(bucketsNeeded);


            return  bucketsNeededInt;

        }


        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;
            }

            return getBucketCount(width*height, areaPerBucket) - extraBuckets;

        }


        public static int getBucketCount(double width, double height, double areaPerBucket) {

            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1;
            }

            return getBucketCount(width, height, areaPerBucket, 0);
        }

    public static void main(String[] args) {

        double[] area = {1.0, 1.0, 1.0, 2.0, 1.0};
        double[] areaPerBucket = {0.499995, 0.50001, 1.0, 1.0, 1.0};

       if (area.length != areaPerBucket.length) {
           System.out.println("INPUT VECTORS HAVE TO HAVE THE SAME LENGTH");
           System.exit(-1);
       }

        for (int i = 0; i < area.length; i++) {
            System.out.println("Area: " + area[i]);
            System.out.println("AreaPerBucket: " + areaPerBucket[i]);
            System.out.println("-------------------------------------");
            System.out.println("BucketsNeeded: " + getBucketCount(area[i], areaPerBucket[i]));
            System.out.println();
        }


    }


}
