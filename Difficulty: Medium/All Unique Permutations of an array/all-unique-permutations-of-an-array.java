class Solution {
    public static void helper(ArrayList<Integer> arr, TreeSet<ArrayList<Integer>> ts, int i){
        if(i == arr.size()){
            ts.add(new ArrayList<>(arr));
            return;
        }
        for(int j = i ; j < arr.size() ; j++){
            Collections.swap(arr, i, j);
            helper(arr, ts, i+1);
            Collections.swap(arr, i, j);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] a) {
        // code here
        TreeSet<ArrayList<Integer>> ts = new TreeSet<>(new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
                int i = 0;
                while(i < o1.size() && i < o2.size()){
                    if(o1.get(i) > o2.get(i))
                        return 1;
                    else if(o1.get(i) < o2.get(i))
                        return -1;
                    i++;
                }
                return 0;
            }
        });
        ArrayList<Integer> arr =  new ArrayList<>();
        for(int i:a){
            arr.add(i);
        }
        helper(arr, ts, 0);
        ArrayList<ArrayList<Integer>> req = new ArrayList<>(ts);
        return req;
    }
};