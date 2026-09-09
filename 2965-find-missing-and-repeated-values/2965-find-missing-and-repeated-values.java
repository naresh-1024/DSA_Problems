class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int missing = 0, repeated = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int[] row : grid) {
            for(int key : row) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int n = grid.length;

        for(int i = 1; i <= n*n; i++) {

            if(!map.containsKey(i))
                missing = i;

            else if(map.get(i) > 1)
                repeated = i;
        }

        return new int[]{repeated, missing};
    }
}