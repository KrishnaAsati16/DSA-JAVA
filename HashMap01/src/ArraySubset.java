import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[] ,int b[]) {
        HashMap<Integer, Integer> amap = new HashMap<>();
        for(int ele :a){
            if (amap.containsKey(ele)) {
                int freq = amap.get(ele);
                amap.put(ele,freq+1);
            }
            else amap.put(ele, 1);
        }
        HashMap<Integer, Integer> bMap = new HashMap<>();
        for(int ele :b){
            if(!amap.containsKey(ele)) return false;
            if (amap.containsKey(ele)) {
                int freq = bMap.get(ele);
                bMap.put(ele,freq+1);
            }
            else bMap.put(ele, 1);
        }
        for(int ele: bMap.keySet()){
            int freq = bMap.get(ele);
            int afreq = bMap.get(ele);
        if(afreq<freq) return false;
        }
        return true ;
    }
}
