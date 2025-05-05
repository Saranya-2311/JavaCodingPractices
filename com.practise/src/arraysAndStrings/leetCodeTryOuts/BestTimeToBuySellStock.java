package arraysAndStrings.leetCodeTryOuts;

public class BestTimeToBuySellStock {
    public static void main(String args[]){
    int[] arr ={7,1,5,3,6,4};
    int result = timeToBuySellStocks(arr);
    System.out.println("result"+result);
    }
    public static int timeToBuySellStocks(int[] arr){
    int maxProfit = 0; int minPrice=0;
        minPrice =arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i] < minPrice ){
            minPrice=arr[i];
        } else if(arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
        }
    }
    return maxProfit;
    }
}
