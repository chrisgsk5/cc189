

public class CC1 {

    // 1.1
    public boolean isUnique (String tar) {
        if (tar.length() > 128) {
            return false;
        }
        boolean[] rec = new boolean[128];
        for (int i = 0; i < tar.length(); i++) {
            if(rec[tar.charAt(i)]) {
                return false;
            }
            rec[tar.charAt(i)] = true;
        }
        return true;
    }

    // 1.2

    // 1.3

    // 1.4

    // 1.5

    // 1.6

    // 1.7

    // 1.8

    // 1.9

    public static void main(String[] args) {

    }
}
