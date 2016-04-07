
package com.ajmal.utilities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Times {

    @SerializedName("pre_analyze")
    @Expose
    private String preAnalyze;
    @SerializedName("field_population")
    @Expose
    private String fieldPopulation;
    @SerializedName("error_reporting")
    @Expose
    private String errorReporting;
    @SerializedName("function_time")
    @Expose
    private String functionTime;

    /**
     * 
     * @return
     *     The preAnalyze
     */
    public String getPreAnalyze() {
        return preAnalyze;
    }

    /**
     * 
     * @param preAnalyze
     *     The pre_analyze
     */
    public void setPreAnalyze(String preAnalyze) {
        this.preAnalyze = preAnalyze;
    }

    /**
     * 
     * @return
     *     The fieldPopulation
     */
    public String getFieldPopulation() {
        return fieldPopulation;
    }

    /**
     * 
     * @param fieldPopulation
     *     The field_population
     */
    public void setFieldPopulation(String fieldPopulation) {
        this.fieldPopulation = fieldPopulation;
    }

    /**
     * 
     * @return
     *     The errorReporting
     */
    public String getErrorReporting() {
        return errorReporting;
    }

    /**
     * 
     * @param errorReporting
     *     The error_reporting
     */
    public void setErrorReporting(String errorReporting) {
        this.errorReporting = errorReporting;
    }

    /**
     * 
     * @return
     *     The functionTime
     */
    public String getFunctionTime() {
        return functionTime;
    }

    /**
     * 
     * @param functionTime
     *     The function_time
     */
    public void setFunctionTime(String functionTime) {
        this.functionTime = functionTime;
    }

}
