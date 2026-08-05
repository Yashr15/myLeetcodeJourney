class Solution {
    public boolean judgeCircle(String moves) {
        int ucount = 0;
        int dcount = 0;
        int lcount = 0;
        int rcount = 0;
        for (int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                ucount++;
            }else if(moves.charAt(i) == 'D'){
                dcount++;
            }else if(moves.charAt(i) == 'L'){
                lcount++;
            }else {
                rcount++;
            }
        }
        if( ucount == dcount && lcount == rcount) return true;
        return false;
    }
}