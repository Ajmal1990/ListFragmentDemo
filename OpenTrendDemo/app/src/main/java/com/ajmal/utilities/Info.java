
package com.ajmal.utilities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Info {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("received")
    @Expose
    private Received received;
    @SerializedName("sent")
    @Expose
    private Sent sent;
    @SerializedName("account")
    @Expose
    private Account account;
    @SerializedName("api")
    @Expose
    private Api api;
    @SerializedName("diagnostics")
    @Expose
    private Diagnostics diagnostics;

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 
     * @return
     *     The received
     */
    public Received getReceived() {
        return received;
    }

    /**
     * 
     * @param received
     *     The received
     */
    public void setReceived(Received received) {
        this.received = received;
    }

    /**
     * 
     * @return
     *     The sent
     */
    public Sent getSent() {
        return sent;
    }

    /**
     * 
     * @param sent
     *     The sent
     */
    public void setSent(Sent sent) {
        this.sent = sent;
    }

    /**
     * 
     * @return
     *     The account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * 
     * @param account
     *     The account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * 
     * @return
     *     The api
     */
    public Api getApi() {
        return api;
    }

    /**
     * 
     * @param api
     *     The api
     */
    public void setApi(Api api) {
        this.api = api;
    }

    /**
     * 
     * @return
     *     The diagnostics
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * 
     * @param diagnostics
     *     The diagnostics
     */
    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

}
