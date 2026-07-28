class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < seats.length && j < students.length){
            sum += Math.abs(seats[i] - students[j]);
            i++;j++;
        }        
        return sum;
    }
}