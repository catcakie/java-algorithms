// performance: log(n)
// used for: sorted lists
// returns: index of a number in an array

public static int indexInArray(int num, ArrayList<Integer> array) {
    int minIndex = 0;
    int maxIndex = array.size()-1;

    while (minIndex <= maxIndex) {
        int midIndex = (minIndex + maxIndex) / 2;
        int numGuess = array.get(midIndex);
        if (num == numGuess)
            return midIndex;
        if (num < numGuess)
            maxIndex = midIndex - 1;
        if (num > numGuess)
            minIndex = midIndex + 1;
        midIndex = (minIndex + maxIndex) / 2;
    }
    return -1;
}
