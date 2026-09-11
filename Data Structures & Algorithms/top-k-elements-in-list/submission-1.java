
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : freq.keySet()) {
            int frequency = freq.get(num);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(num);
        }

        // Step 3: Get top k elements
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}