package cn.duanyufei.kiwivm.model;

import java.util.List;
import java.util.Map;

/**
 * Created by DUAN Yufei on 2017/3/13.
 */

public class ServiceInfo {

    private String hostname;
    private String node_ip;
    private String node_alias;
    private String node_location;
    private boolean location_ipv6_ready;
    private String plan;
    private long plan_monthly_data;
    private long plan_disk;
    private long plan_ram;
    private long plan_swap;
    private long plan_max_ipv6s;
    private String os;
    private String email;
    private long data_counter;
    private long data_next_reset;
    private List<String> ip_addresses;
    private boolean rdns_api_available;
    private Map<String,String> ptr;
    private boolean suspended;
    private int error;

    public long getData_counter() {
        return data_counter;
    }

    public void setData_counter(long data_counter) {
        this.data_counter = data_counter;
    }

    public long getData_next_reset() {
        return data_next_reset;
    }

    public void setData_next_reset(long data_next_reset) {
        this.data_next_reset = data_next_reset;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<String> getIp_addresses() {
        return ip_addresses;
    }

    public void setIp_addresses(List<String> ip_addresses) {
        this.ip_addresses = ip_addresses;
    }

    public boolean isLocation_ipv6_ready() {
        return location_ipv6_ready;
    }

    public void setLocation_ipv6_ready(boolean location_ipv6_ready) {
        this.location_ipv6_ready = location_ipv6_ready;
    }

    public String getNode_alias() {
        return node_alias;
    }

    public void setNode_alias(String node_alias) {
        this.node_alias = node_alias;
    }

    public String getNode_ip() {
        return node_ip;
    }

    public void setNode_ip(String node_ip) {
        this.node_ip = node_ip;
    }

    public String getNode_location() {
        return node_location;
    }

    public void setNode_location(String node_location) {
        this.node_location = node_location;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public long getPlan_disk() {
        return plan_disk;
    }

    public void setPlan_disk(long plan_disk) {
        this.plan_disk = plan_disk;
    }

    public long getPlan_max_ipv6s() {
        return plan_max_ipv6s;
    }

    public void setPlan_max_ipv6s(long plan_max_ipv6s) {
        this.plan_max_ipv6s = plan_max_ipv6s;
    }

    public long getPlan_monthly_data() {
        return plan_monthly_data;
    }

    public void setPlan_monthly_data(long plan_monthly_data) {
        this.plan_monthly_data = plan_monthly_data;
    }

    public long getPlan_ram() {
        return plan_ram;
    }

    public void setPlan_ram(long plan_ram) {
        this.plan_ram = plan_ram;
    }

    public long getPlan_swap() {
        return plan_swap;
    }

    public void setPlan_swap(long plan_swap) {
        this.plan_swap = plan_swap;
    }

    public Map<String, String> getPtr() {
        return ptr;
    }

    public void setPtr(Map<String, String> ptr) {
        this.ptr = ptr;
    }

    public boolean isRdns_api_available() {
        return rdns_api_available;
    }

    public void setRdns_api_available(boolean rdns_api_available) {
        this.rdns_api_available = rdns_api_available;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
}

//{"hostname":"localhost.localdomain",
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
// "data_counter":7442142118,
// "data_next_reset":1491796800,
// "ip_addresses":["45.62.104.239","2607:8700:102:65e9::"],
// "rdns_api_available":true,
// "ptr":{"45.62.104.239":null,"2607:8700:102:65e9::":""},
// "suspended":false,
// "error":0}