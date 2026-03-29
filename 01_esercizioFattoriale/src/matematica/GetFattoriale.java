package matematica;

public class GetFattoriale {
    public static long getFattoriale(int n) {
        long fatt = 1;
        if (n < 0) {
            return -1;
        }
        else if (n == 0 || n == 1) {
            return fatt;
        }
        else {
            for(int i = 1; i<=n; i++) {
                fatt = fatt*i;
            }
            return fatt;
        }
    }
}

