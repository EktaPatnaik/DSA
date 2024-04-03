public class WaterTrappingProblem {
    public static void main(String[] args) {

        //size of the building
        int building[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};


        //  left boundary
        int lb[]=new int[building.length];
        lb[0]=0;
        lb[lb.length-1]=0;
        int highestBoundaryOnLeft=0;
        for (int i=1;i<building.length;i++)
        {lb[i]=Math.max(building[i-1], highestBoundaryOnLeft);
                highestBoundaryOnLeft=lb[i];
                ;}



        //  right boundary
        int rb[]=new int[building.length];
        rb[lb.length-1]=0;
        int highestBoundaryOnRight=0;
            for (int i=building.length-2;i>=0;i--)
            {rb[i]=Math.max(building[i+1], highestBoundaryOnRight);
                    highestBoundaryOnRight=rb[i];
        }

        int waterTrap[]=new int[building.length];
        int waterTrappedTotal=0;
        for (int i=0;i<building.length;i++)
        {if(rb[i]!=0 && lb[i]!=0 && building[i]<Math.min(rb[i],lb[i]))
        {
            waterTrap[i]=Math.min(rb[i],lb[i])-building[i];
        }
        else {
            waterTrap[i]=0;
        }
            waterTrappedTotal=waterTrappedTotal+waterTrap[i];
            System.out.print(i+"---");
            System.out.println(waterTrap[i]);
        }
        System.out.print("Total Water Trapped is "+waterTrappedTotal);

    }
}