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
import com.microsoft.graph.models.BucketAggregationRange;
import com.microsoft.graph.models.BucketAggregationSortProperty;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bucket Aggregation Definition.
 */
public class BucketAggregationDefinition implements IJsonBackedObject {

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
     * The Is Descending.
     * True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     */
    @SerializedName(value = "isDescending", alternate = {"IsDescending"})
    @Expose
	@Nullable
    public Boolean isDescending;

    /**
     * The Minimum Count.
     * The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     */
    @SerializedName(value = "minimumCount", alternate = {"MinimumCount"})
    @Expose
	@Nullable
    public Integer minimumCount;

    /**
     * The Prefix Filter.
     * A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     */
    @SerializedName(value = "prefixFilter", alternate = {"PrefixFilter"})
    @Expose
	@Nullable
    public String prefixFilter;

    /**
     * The Ranges.
     * Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.
     */
    @SerializedName(value = "ranges", alternate = {"Ranges"})
    @Expose
	@Nullable
    public java.util.List<BucketAggregationRange> ranges;

    /**
     * The Sort By.
     * The possible values are count to sort by the number of matches in the aggregation, keyAsStringto sort alphabeticaly based on the key in the aggregation, keyAsNumber for numerical sorting based on the key in the aggregation. Required.
     */
    @SerializedName(value = "sortBy", alternate = {"SortBy"})
    @Expose
	@Nullable
    public BucketAggregationSortProperty sortBy;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}