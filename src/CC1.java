

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
    public boolean checkPerm(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] rec = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            rec[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char cur = s2.charAt(i);
            rec[cur]--;
            if (rec[cur] < 0) return false;
        }
        return true;
    }

    // 1.3

    public String unify(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        boolean added = false;
        for (char c : s.toCharArray()) {
            if (!added && c != ' ') {
                sb.append("%20");
                added = true;
            } else {
                sb.append(c);
                added = false;
            }
        }
        return sb.toString();
    }

    // 1.4

    public boolean ispal(String s) {
        if (s.length() <= 1) {
            return true;
        }
        s = s.toUpperCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j++) {
            while (i < j && !Character.isDigit(s.charAt(i))) i++;
            while (i < j && !Character.isDigit(s.charAt(j))) j--;
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;

    }

    // 1.5

    public boolean oneAway(String s1, String s2) {
        int sd = s1.length() - s2.length();
        if (sd > 1) {
            return false;
        }

        String sf = s1.length() > s2.length() ? s2 : s1;
        String ss = s1.length() > s2.length() ? s1 : s2;
        int pos1 = 0;
        int pos2 = 0;
        boolean found = false;

        while (pos1 < sf.length() && pos2 < ss.length() ) {
            if (sf.charAt(pos1) != ss.charAt(pos2)) {
                if (found) return false;
                found = true;

                if (sf.length() == ss.length()) {
                    pos1++;
                }
            } else {
                pos1++;
            }
            pos2++;
        }

        return true;
    }



    // 1.6

    // 1.7

    // 1.8

    // 1.9

    public static void main(String[] args) {

    }
}
