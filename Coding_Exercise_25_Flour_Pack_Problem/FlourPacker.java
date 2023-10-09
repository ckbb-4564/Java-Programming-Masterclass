public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int maxBig = goal / 5;
        if (bigCount >= maxBig) {
            goal -= maxBig * 5;
        } else {
            goal -= bigCount * 5;
        }

        return smallCount >= goal;
    }
}
