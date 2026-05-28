import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        for( ; i < nums1.length && j < nums2.length ; ){

            // same id
            if(nums1[i][0] == nums2[j][0]){

                list.add(new int[]{
                    nums1[i][0],
                    nums1[i][1] + nums2[j][1]
                });

                i++;
                j++;
            }

            // nums1 smaller
            else if(nums1[i][0] < nums2[j][0]){

                list.add(new int[]{
                    nums1[i][0],
                    nums1[i][1]
                });

                i++;
            }

            // nums2 smaller
            else{

                list.add(new int[]{
                    nums2[j][0],
                    nums2[j][1]
                });

                j++;
            }
        }

        // remaining nums1
        for( ; i < nums1.length ; i++){
            list.add(new int[]{
                nums1[i][0],
                nums1[i][1]
            });
        }

        // remaining nums2
        for( ; j < nums2.length ; j++){
            list.add(new int[]{
                nums2[j][0],
                nums2[j][1]
            });
        }

        int[][] ans = new int[list.size()][2];

        for(int k = 0; k < list.size(); k++){
            ans[k] = list.get(k);
        }

        return ans;
    }
}