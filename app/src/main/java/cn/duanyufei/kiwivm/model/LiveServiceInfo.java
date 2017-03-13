package cn.duanyufei.kiwivm.model;

/**
 * Created by DUAN Yufei on 2017/3/13.
 */

public class LiveServiceInfo extends ServiceInfo {
    private String vm_type;
    private VzStatus vz_status;
    private VzQuota vz_quota;

    private String is_cpu_throttled;
    private int ssh_port;

    public String getIs_cpu_throttled() {
        return is_cpu_throttled;
    }

    public void setIs_cpu_throttled(String is_cpu_throttled) {
        this.is_cpu_throttled = is_cpu_throttled;
    }

    public int getSsh_port() {
        return ssh_port;
    }

    public void setSsh_port(int ssh_port) {
        this.ssh_port = ssh_port;
    }

    public String getVm_type() {
        return vm_type;
    }

    public void setVm_type(String vm_type) {
        this.vm_type = vm_type;
    }

    public VzQuota getVz_quota() {
        return vz_quota;
    }

    public void setVz_quota(VzQuota vz_quota) {
        this.vz_quota = vz_quota;
    }

    public VzStatus getVz_status() {
        return vz_status;
    }

    public void setVz_status(VzStatus vz_status) {
        this.vz_status = vz_status;
    }
}
// {"vm_type":"ovz",
// "vz_status":{
//      "status":"running",
//      "hostname":"localhost.localdomain",
//      "load_average":"0.00\/0.00\/0.00",
//      "nproc":"7",
//      "nproc_b":"200",
//      "kmemsize":"2079775",
//      "kmemsize_b":"134217728",
//      "privvmpages":"3380",
//      "privvmpages_b":"262144",
//      "oomguarpages":"2304",
//      "oomguarpages_b":"65536",
//      "numtcpsock":"17",
//      "numtcpsock_b":"1670",
//      "numfile":"114",
//      "numfile_b":"10240",
//      "swappages":"883",
//      "swappages_b":"32768",
//      "physpages":"4359",
//      "physpages_l":"65536"
// },
// "vz_quota":{
//      "occupied_kb":"665424",
//      "softlimit_kb":"12582912",
//      "hardlimit_kb":"13211648",
//      "occupied_inodes":"23231",
//      "softlimit_inodes":"12288000",
//      "hardlimit_inodes":"12902400"
// },
// "is_cpu_throttled":"",
// "ssh_port":27077,
// "hostname":"localhost.localdomain",
// "node_ip":"104.194.76.13",
// "node_alias":"v803",
// "node_location":"US, California",
// "location_ipv6_ready":true,
// "plan":"wagonv2-10g",
// "plan_monthly_data":590558003200,
// "plan_disk":12884901888,
// "plan_ram":268435456,
// "plan_swap":134217728,
// "plan_max_ipv6s":5,
// "os":"centos-6-x86",
// "email":"xminor@163.com",
// "data_counter":7451070428,
// "data_next_reset":1491796800,
// "ip_addresses":["45.62.104.239","2607:8700:102:65e9::"],
// "rdns_api_available":true,
// "ptr":{"45.62.104.239":null,"2607:8700:102:65e9::":""},
// "suspended":false,
// "error":0}