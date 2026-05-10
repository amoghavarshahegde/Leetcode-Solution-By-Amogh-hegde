class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
    List<String[]> list = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            if (isActive[i] &&
               (businessLine[i].equals("electronics") ||
                businessLine[i].equals("grocery") ||
                businessLine[i].equals("pharmacy") ||
                businessLine[i].equals("restaurant")) &&
               code[i].matches("[a-zA-Z0-9_]+")) {

                list.add(new String[]{businessLine[i], code[i]});
            }
        }

        Collections.sort(list, (a, b) -> {
            List<String> order = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");

            if (!a[0].equals(b[0])) {
                return order.indexOf(a[0]) - order.indexOf(b[0]);
            }

            return a[1].compareTo(b[1]);
        });

        List<String> ans = new ArrayList<>();

        for (String[] x : list) {
            ans.add(x[1]);
        }

        return ans;
    }
}