public class Harmonik {

    public static void main(String[] args) {

        double[] arr={1,2,3,4,5};
        double sum=0;

        for (double i:arr){
            sum+=(1/i);
        }

        System.out.println("Harmonik ortalama= "+(arr.length/sum));

    }

}
