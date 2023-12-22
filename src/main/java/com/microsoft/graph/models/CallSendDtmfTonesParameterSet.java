// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.Tone;
import com.microsoft.graph.models.SendDtmfTonesOperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Send Dtmf Tones Parameter Set.
 */
public class CallSendDtmfTonesParameterSet {
    /**
     * The tones.
     * 
     */
    @SerializedName(value = "tones", alternate = {"Tones"})
    @Expose
	@Nullable
    public java.util.List<Tone> tones;

    /**
     * The delay Between Tones Ms.
     * 
     */
    @SerializedName(value = "delayBetweenTonesMs", alternate = {"DelayBetweenTonesMs"})
    @Expose
	@Nullable
    public Integer delayBetweenTonesMs;

    /**
     * The client Context.
     * 
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
	@Nullable
    public String clientContext;


    /**
     * Instiaciates a new CallSendDtmfTonesParameterSet
     */
    public CallSendDtmfTonesParameterSet() {}
    /**
     * Instiaciates a new CallSendDtmfTonesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallSendDtmfTonesParameterSet(@Nonnull final CallSendDtmfTonesParameterSetBuilder builder) {
        this.tones = builder.tones;
        this.delayBetweenTonesMs = builder.delayBetweenTonesMs;
        this.clientContext = builder.clientContext;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallSendDtmfTonesParameterSetBuilder newBuilder() {
        return new CallSendDtmfTonesParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallSendDtmfTonesParameterSet
     */
    public static final class CallSendDtmfTonesParameterSetBuilder {
        /**
         * The tones parameter value
         */
        @Nullable
        protected java.util.List<Tone> tones;
        /**
         * Sets the Tones
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallSendDtmfTonesParameterSetBuilder withTones(@Nullable final java.util.List<Tone> val) {
            this.tones = val;
            return this;
        }
        /**
         * The delayBetweenTonesMs parameter value
         */
        @Nullable
        protected Integer delayBetweenTonesMs;
        /**
         * Sets the DelayBetweenTonesMs
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallSendDtmfTonesParameterSetBuilder withDelayBetweenTonesMs(@Nullable final Integer val) {
            this.delayBetweenTonesMs = val;
            return this;
        }
        /**
         * The clientContext parameter value
         */
        @Nullable
        protected String clientContext;
        /**
         * Sets the ClientContext
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallSendDtmfTonesParameterSetBuilder withClientContext(@Nullable final String val) {
            this.clientContext = val;
            return this;
        }
        /**
         * Instanciates a new CallSendDtmfTonesParameterSetBuilder
         */
        @Nullable
        protected CallSendDtmfTonesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallSendDtmfTonesParameterSet build() {
            return new CallSendDtmfTonesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.tones != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("tones", tones));
        }
        if(this.delayBetweenTonesMs != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("delayBetweenTonesMs", delayBetweenTonesMs));
        }
        if(this.clientContext != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("clientContext", clientContext));
        }
        return result;
    }
}
