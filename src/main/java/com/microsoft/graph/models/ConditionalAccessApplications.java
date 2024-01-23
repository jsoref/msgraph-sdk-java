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
import com.microsoft.graph.models.ConditionalAccessFilter;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Applications.
 */
public class ConditionalAccessApplications implements IJsonBackedObject {

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
     * The Application Filter.
     * 
     */
    @SerializedName(value = "applicationFilter", alternate = {"ApplicationFilter"})
    @Expose
	@Nullable
    public ConditionalAccessFilter applicationFilter;

    /**
     * The Exclude Applications.
     * Can be one of the following:  The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the list of apps included in Office365, see Apps included in Conditional Access Office 365 app suite
     */
    @SerializedName(value = "excludeApplications", alternate = {"ExcludeApplications"})
    @Expose
	@Nullable
    public java.util.List<String> excludeApplications;

    /**
     * The Include Applications.
     * Can be one of the following:  The list of client IDs (appId) the policy applies to, unless explicitly excluded (in excludeApplications)  All  Office365 - For the list of apps included in Office365, see Apps included in Conditional Access Office 365 app suite
     */
    @SerializedName(value = "includeApplications", alternate = {"IncludeApplications"})
    @Expose
	@Nullable
    public java.util.List<String> includeApplications;

    /**
     * The Include Authentication Context Class References.
     * 
     */
    @SerializedName(value = "includeAuthenticationContextClassReferences", alternate = {"IncludeAuthenticationContextClassReferences"})
    @Expose
	@Nullable
    public java.util.List<String> includeAuthenticationContextClassReferences;

    /**
     * The Include User Actions.
     * User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     */
    @SerializedName(value = "includeUserActions", alternate = {"IncludeUserActions"})
    @Expose
	@Nullable
    public java.util.List<String> includeUserActions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
