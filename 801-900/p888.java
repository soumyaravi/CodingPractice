class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int suma = 0, sumb = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            suma += A[i];
            set.add(A[i]);
        }
        for(int i=0;i<B.length;i++)
            sumb += B[i];
        int av = (suma+sumb)/2;
        av-=suma;
        for(int i=0;i<B.length;i++){
            if(set.contains(B[i]-av))
                return new int[]{B[i]-av,B[i]};
        }
        
        return new int[]{-1,-1};
    }
}