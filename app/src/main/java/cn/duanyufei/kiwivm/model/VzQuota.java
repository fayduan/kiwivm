package cn.duanyufei.kiwivm.model;

/**
 * Created by DUAN Yufei on 2017/3/13.
 */

public class VzQuota {
    private String occupied_kb;
    private String softlimit_kb;
    private String hardlimit_kb;
    private String occupied_inodes;
    private String softlimit_inodes;
    private String hardlimit_inodes;

    public String getHardlimit_inodes() {
        return hardlimit_inodes;
    }

    public void setHardlimit_inodes(String hardlimit_inodes) {
        this.hardlimit_inodes = hardlimit_inodes;
    }

    public String getHardlimit_kb() {
        return hardlimit_kb;
    }

    public void setHardlimit_kb(String hardlimit_kb) {
        this.hardlimit_kb = hardlimit_kb;
    }

    public String getOccupied_inodes() {
        return occupied_inodes;
    }

    public void setOccupied_inodes(String occupied_inodes) {
        this.occupied_inodes = occupied_inodes;
    }

    public String getOccupied_kb() {
        return occupied_kb;
    }

    public void setOccupied_kb(String occupied_kb) {
        this.occupied_kb = occupied_kb;
    }

    public String getSoftlimit_inodes() {
        return softlimit_inodes;
    }

    public void setSoftlimit_inodes(String softlimit_inodes) {
        this.softlimit_inodes = softlimit_inodes;
    }

    public String getSoftlimit_kb() {
        return softlimit_kb;
    }

    public void setSoftlimit_kb(String softlimit_kb) {
        this.softlimit_kb = softlimit_kb;
    }
}
// "vz_quota":{
//      "occupied_kb":"665424",
//      "softlimit_kb":"12582912",
//      "hardlimit_kb":"13211648",
//      "occupied_inodes":"23231",
//      "softlimit_inodes":"12288000",
//      "hardlimit_inodes":"12902400"
// },
