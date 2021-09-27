public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int totalPacks = (bigCount * 5) + smallCount, noOfBigCountNeeded = goal / 5;

        if (bigCount < 0 || smallCount < 0 || goal < 0 || goal > totalPacks) return false;
        else {
            if ((bigCount >= noOfBigCountNeeded || smallCount >= goal || totalPacks >= goal) && ((noOfBigCountNeeded * 5) + smallCount) >= goal) {
                return true;
            }
        }
        return false;
    }
}
