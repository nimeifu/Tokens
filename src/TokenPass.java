public class TokenPass {
   int[]arr={5,6,7,2,1,5,19,5,1,2,3,};

    public void bubbleSort(int[] arr)
    {
        boolean done=false;
        while(!done)
        {
            done=true;
            for(int i=0;i<arr.length-1;i++)
            {
                int a=arr[i];
                int b=arr[i+1];
                if(a>b)
                {
                    done=false;
                    arr[i]=b;
                    arr[i+1]=a;
                }
            }
        }
    }
}


