
package com.ajmal.utilities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Received {

    @SerializedName("api_key")
    @Expose
    private String apiKey;
    @SerializedName("api_id")
    @Expose
    private String apiId;
    @SerializedName("results")
    @Expose
    private String results;
    @SerializedName("seed")
    @Expose
    private Object seed;

    /**
     * 
     * @return
     *     The apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * 
     * @param apiKey
     *     The api_key
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * 
     * @return
     *     The apiId
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * 
     * @param apiId
     *     The api_id
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
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
     *     The seed
     */
    public Object getSeed() {
        return seed;
    }

    /**
     * 
     * @param seed
     *     The seed
     */
    public void setSeed(Object seed) {
        this.seed = seed;
    }

}
