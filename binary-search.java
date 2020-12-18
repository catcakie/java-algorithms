// performance: log(n)
// used for: sorted lists
// returns: index of a number in an array

public static int indexInArray(int targetNumber, ArrayList<Integer> array) {
    int minIndex = 0;
    int maxIndex = array.size()-1;

    while (minIndex <= maxIndex) {
        int midIndex = (minIndex + maxIndex) / 2;
        int guessNumber = array.get(midIndex);
        if (targetNumber == guessNumber)
            return midIndex;
        if (targetNumber < guessNumber)
            maxIndex = midIndex - 1;
        if (targetNumber > guessNumber)
            minIndex = midIndex + 1;
    }
    return -1;
}
