package Binary_Search;

class VersionControl {
    int bad;

    // Constructor to set the first bad version
    VersionControl(int bad) {
        this.bad = bad;
    }

    boolean isBadVersion(int version) {
        return version >= bad;
    }
}


public class First_bad_version extends VersionControl {

    First_bad_version(int bad){
        super(bad);
    }

    public int firstBadVersion(int n) {
      int start = 1;
      int end = n;
      int ans = -1;
      while(start <= end){
        int mid = start + (end - start)/2;
        boolean bad = isBadVersion(mid);
        if(bad == true){
            ans = mid;
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
      }
      return ans;
    }

    public static void main(String[] args) {
        First_bad_version ans = new First_bad_version(4);
        
        System.out.println(ans.firstBadVersion(5));
    }
}
