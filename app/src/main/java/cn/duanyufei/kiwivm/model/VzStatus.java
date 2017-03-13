package cn.duanyufei.kiwivm.model;

/**
 * Created by DUAN Yufei on 2017/3/13.
 */

public class VzStatus {
    private String status;
    private String hostname;
    private String load_average;
    private String nproc;
    private String nproc_b;
    private String kmemsize;
    private String kmemsize_b;
    private String privvmpages;
    private String privvmpages_b;
    private String oomguarpages;
    private String oomguarpages_b;
    private String numtcpsock;
    private String numtcpsock_b;
    private String numfile;
    private String numfile_b;
    private String swappages;
    private String swappages_b;
    private String physpages;
    private String physpages_l;
}
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