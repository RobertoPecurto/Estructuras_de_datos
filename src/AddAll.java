import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        nums.add("uno");
        nums.add("dos");
        nums.add("tres");
        List<String> nums2 = new ArrayList<>();
        nums2.add("cuatro");
        nums2.add("cinco");
        nums2.add("seis");

        nums.addAll(nums2);
        System.out.println(nums);
    }
}
