
package com.ajmal.utilities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Diagnostics {

    @SerializedName("execution_time")
    @Expose
    private Double executionTime;
    @SerializedName("RPS")
    @Expose
    private Double RPS;
    @SerializedName("memory")
    @Expose
    private Integer memory;
    @SerializedName("operations")
    @Expose
    private String operations;
    @SerializedName("times")
    @Expose
    private Times times;

    /**
     * 
     * @return
     *     The executionTime
     */
    public Double getExecutionTime() {
        return executionTime;
    }

    /**
     * 
     * @param executionTime
     *     The execution_time
     */
    public void setExecutionTime(Double executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * 
     * @return
     *     The RPS
     */
    public Double getRPS() {
        return RPS;
    }

    /**
     * 
     * @param RPS
     *     The RPS
     */
    public void setRPS(Double RPS) {
        this.RPS = RPS;
    }

    /**
     * 
     * @return
     *     The memory
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * 
     * @param memory
     *     The memory
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * 
     * @return
     *     The operations
     */
    public String getOperations() {
        return operations;
    }

    /**
     * 
     * @param operations
     *     The operations
     */
    public void setOperations(String operations) {
        this.operations = operations;
    }

    /**
     * 
     * @return
     *     The times
     */
    public Times getTimes() {
        return times;
    }

    /**
     * 
     * @param times
     *     The times
     */
    public void setTimes(Times times) {
        this.times = times;
    }

}
