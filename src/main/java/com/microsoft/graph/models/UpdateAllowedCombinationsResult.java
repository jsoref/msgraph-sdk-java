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
import com.microsoft.graph.models.AuthenticationMethodModes;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Update Allowed Combinations Result.
 */
public class UpdateAllowedCombinationsResult implements IJsonBackedObject {

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
     * The Additional Information.
     * Information about why the updateAllowedCombinations action was successful or failed.
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
	@Nullable
    public String additionalInformation;

    /**
     * The Conditional Access References.
     * References to existing Conditional Access policies that use this authentication strength.
     */
    @SerializedName(value = "conditionalAccessReferences", alternate = {"ConditionalAccessReferences"})
    @Expose
	@Nullable
    public java.util.List<String> conditionalAccessReferences;

    /**
     * The Current Combinations.
     * The list of current authentication method combinations allowed by the authentication strength.
     */
    @SerializedName(value = "currentCombinations", alternate = {"CurrentCombinations"})
    @Expose
	@Nullable
    public java.util.List<EnumSet<AuthenticationMethodModes>> currentCombinations;

    /**
     * The Previous Combinations.
     * The list of former authentication method combinations allowed by the authentication strength before they were updated through the updateAllowedCombinations action.
     */
    @SerializedName(value = "previousCombinations", alternate = {"PreviousCombinations"})
    @Expose
	@Nullable
    public java.util.List<EnumSet<AuthenticationMethodModes>> previousCombinations;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}