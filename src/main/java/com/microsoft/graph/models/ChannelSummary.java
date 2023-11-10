// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Summary.
 */
public class ChannelSummary implements IJsonBackedObject {

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
     * The Guests Count.
     * Count of guests in a channel.
     */
    @SerializedName(value = "guestsCount", alternate = {"GuestsCount"})
    @Expose
	@Nullable
    public Integer guestsCount;

    /**
     * The Has Members From Other Tenants.
     * Indicates whether external members are included on the channel.
     */
    @SerializedName(value = "hasMembersFromOtherTenants", alternate = {"HasMembersFromOtherTenants"})
    @Expose
	@Nullable
    public Boolean hasMembersFromOtherTenants;

    /**
     * The Members Count.
     * Count of members in a channel.
     */
    @SerializedName(value = "membersCount", alternate = {"MembersCount"})
    @Expose
	@Nullable
    public Integer membersCount;

    /**
     * The Owners Count.
     * Count of owners in a channel.
     */
    @SerializedName(value = "ownersCount", alternate = {"OwnersCount"})
    @Expose
	@Nullable
    public Integer ownersCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
