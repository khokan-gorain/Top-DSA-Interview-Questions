public class TrappingRainWater {
    public static int trappingWater(int height[]){ // 4 2,0,6,3,2,5

        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0]; // 4
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]); // 
        }

        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);

        }

        int totalTrappedWater = 0;
        int width = 1;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            totalTrappedWater += (waterLevel - height[i]*width);
        }


        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total Trapped Water "+trappingWater(height));
    }
}
