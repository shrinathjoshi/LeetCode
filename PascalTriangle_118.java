/**
 * 
 * @author Shrinath Joshi
 * date:- 8th December 2019 
 *
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Time Complexity :- O(n^2)
 * Space Complexity :- O(n^2)
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        
        if(numRows == 0)
            return triangle;
        
        //Adding the first row 
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        triangle.add(firstRow);

        for(int index =1 ;index<numRows;index++)
        {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> previousRow=triangle.get(index-1); 
            
            for(int i=1;i<previousRow.size();i++){
                Integer sum=previousRow.get(i)+previousRow.get(i-1);
                row.add(sum);
            }
            row.add(1);
            triangle.add(row);
        }
        
        return triangle;
        
    }
}