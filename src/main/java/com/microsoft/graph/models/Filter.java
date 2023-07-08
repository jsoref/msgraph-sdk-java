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
import com.microsoft.graph.models.FilterGroup;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Filter.
 */
public class Filter implements IJsonBackedObject {

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
     * The Category Filter Groups.
     * 
     */
    @SerializedName(value = "categoryFilterGroups", alternate = {"CategoryFilterGroups"})
    @Expose
	@Nullable
    public java.util.List<FilterGroup> categoryFilterGroups;

    /**
     * The Groups.
     * 
     */
    @SerializedName(value = "groups", alternate = {"Groups"})
    @Expose
	@Nullable
    public java.util.List<FilterGroup> groups;

    /**
     * The Input Filter Groups.
     * 
     */
    @SerializedName(value = "inputFilterGroups", alternate = {"InputFilterGroups"})
    @Expose
	@Nullable
    public java.util.List<FilterGroup> inputFilterGroups;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}