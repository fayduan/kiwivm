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

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getKmemsize() {
        return kmemsize;
    }

    public void setKmemsize(String kmemsize) {
        this.kmemsize = kmemsize;
    }

    public String getKmemsize_b() {
        return kmemsize_b;
    }

    public void setKmemsize_b(String kmemsize_b) {
        this.kmemsize_b = kmemsize_b;
    }

    public String getLoad_average() {
        return load_average;
    }

    public void setLoad_average(String load_average) {
        this.load_average = load_average;
    }

    public String getNproc() {
        return nproc;
    }

    public void setNproc(String nproc) {
        this.nproc = nproc;
    }

    public String getNproc_b() {
        return nproc_b;
    }

    public void setNproc_b(String nproc_b) {
        this.nproc_b = nproc_b;
    }

    public String getNumfile() {
        return numfile;
    }

    public void setNumfile(String numfile) {
        this.numfile = numfile;
    }

    public String getNumfile_b() {
        return numfile_b;
    }

    public void setNumfile_b(String numfile_b) {
        this.numfile_b = numfile_b;
    }

    public String getNumtcpsock() {
        return numtcpsock;
    }

    public void setNumtcpsock(String numtcpsock) {
        this.numtcpsock = numtcpsock;
    }

    public String getNumtcpsock_b() {
        return numtcpsock_b;
    }

    public void setNumtcpsock_b(String numtcpsock_b) {
        this.numtcpsock_b = numtcpsock_b;
    }

    public String getOomguarpages() {
        return oomguarpages;
    }

    public void setOomguarpages(String oomguarpages) {
        this.oomguarpages = oomguarpages;
    }

    public String getOomguarpages_b() {
        return oomguarpages_b;
    }

    public void setOomguarpages_b(String oomguarpages_b) {
        this.oomguarpages_b = oomguarpages_b;
    }

    public String getPhyspages() {
        return physpages;
    }

    public void setPhyspages(String physpages) {
        this.physpages = physpages;
    }

    public String getPhyspages_l() {
        return physpages_l;
    }

    public void setPhyspages_l(String physpages_l) {
        this.physpages_l = physpages_l;
    }

    public String getPrivvmpages() {
        return privvmpages;
    }

    public void setPrivvmpages(String privvmpages) {
        this.privvmpages = privvmpages;
    }

    public String getPrivvmpages_b() {
        return privvmpages_b;
    }

    public void setPrivvmpages_b(String privvmpages_b) {
        this.privvmpages_b = privvmpages_b;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSwappages() {
        return swappages;
    }

    public void setSwappages(String swappages) {
        this.swappages = swappages;
    }

    public String getSwappages_b() {
        return swappages_b;
    }

    public void setSwappages_b(String swappages_b) {
        this.swappages_b = swappages_b;
    }
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