class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = delayedTime + arrivalTime;
        return sum % 24;
    }
}