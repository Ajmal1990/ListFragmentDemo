
package com.ajmal.utilities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Sent {

    @SerializedName("results")
    @Expose
    private String results;

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

}
