 Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n+1];
    arr[0] = 0; // base case
    arr[1] = 1;
    for(int i=2;i<arr.length;i++){
        arr[i] = arr[i-1] + arr[i-2];
        
    }
    System.out.print(arr[n]);
