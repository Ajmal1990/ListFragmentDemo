
package com.ajmal.utilities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Account {

    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("results")
    @Expose
    private String results;
    @SerializedName("remaining")
    @Expose
    private Integer remaining;

    /**
     * 
     * @return
     *     The user
     */
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * 
     * @param tier
     *     The tier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * 
     * @return
     *     The results
     */
    public String getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(String results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The remaining
     */
    public Integer getRemaining() {
        return remaining;
    }

    /**
     * 
     * @param remaining
     *     The remaining
     */
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

}
