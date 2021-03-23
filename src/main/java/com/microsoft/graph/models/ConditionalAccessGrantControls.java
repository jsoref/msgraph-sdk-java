// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ConditionalAccessGrantControl;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Grant Controls.
 */
public class ConditionalAccessGrantControls implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Built In Controls.
     * List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice, domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue.
     */
    @SerializedName(value = "builtInControls", alternate = {"BuiltInControls"})
    @Expose
	@Nullable
    public java.util.List<ConditionalAccessGrantControl> builtInControls;

    /**
     * The Custom Authentication Factors.
     * List of custom controls IDs required by the policy. For more information, see Custom controls.
     */
    @SerializedName(value = "customAuthenticationFactors", alternate = {"CustomAuthenticationFactors"})
    @Expose
	@Nullable
    public java.util.List<String> customAuthenticationFactors;

    /**
     * The Operator.
     * Defines the relationship of the grant controls. Possible values: AND, OR.
     */
    @SerializedName(value = "operator", alternate = {"Operator"})
    @Expose
	@Nullable
    public String operator;

    /**
     * The Terms Of Use.
     * List of terms of use IDs required by the policy.
     */
    @SerializedName(value = "termsOfUse", alternate = {"TermsOfUse"})
    @Expose
	@Nullable
    public java.util.List<String> termsOfUse;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}