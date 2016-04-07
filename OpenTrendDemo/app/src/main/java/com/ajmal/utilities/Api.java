
package com.ajmal.utilities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parser version")
    @Expose
    private String parserVersion;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The parserVersion
     */
    public String getParserVersion() {
        return parserVersion;
    }

    /**
     * 
     * @param parserVersion
     *     The parser version
     */
    public void setParserVersion(String parserVersion) {
        this.parserVersion = parserVersion;
    }

}
