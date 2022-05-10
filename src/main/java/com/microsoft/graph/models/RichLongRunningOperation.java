// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PublicError;
import com.microsoft.graph.models.LongRunningOperation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rich Long Running Operation.
 */
public class RichLongRunningOperation extends LongRunningOperation implements IJsonBackedObject {


    /**
     * The Error.
     * Error due to which the operation failed.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public PublicError error;

    /**
     * The Percentage Complete.
     * A value between 0 and 100 that indicates the progress of the operation.
     */
    @SerializedName(value = "percentageComplete", alternate = {"PercentageComplete"})
    @Expose
	@Nullable
    public Integer percentageComplete;

    /**
     * The Resource Id.
     * A unique identifier for the result.
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
	@Nullable
    public String resourceId;

    /**
     * The Type.
     * Type of the operation.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}