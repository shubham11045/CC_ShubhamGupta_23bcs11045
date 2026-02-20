 public int sumBitDifferences(int[] arr) {
        int n = arr.length;
        long ans = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    count++;
                }
            }

            ans += (long) count * (n - count) * 2;
        }

        return (int) ans;
    }
