// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Startup Process Performance.
 */
public class UserExperienceAnalyticsDeviceStartupProcessPerformance extends Entity implements IJsonBackedObject {


    /**
     * The Device Count.
     * The count of devices which initiated this process on startup. Supports: $filter, $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "deviceCount", alternate = {"DeviceCount"})
    @Expose
	@Nullable
    public Long deviceCount;

    /**
     * The Median Impact In Ms.
     * The median impact of startup process on device boot time in milliseconds. Supports: $filter, $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "medianImpactInMs", alternate = {"MedianImpactInMs"})
    @Expose
	@Nullable
    public Long medianImpactInMs;

    /**
     * The Process Name.
     * The name of the startup process. Examples: outlook, excel. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "processName", alternate = {"ProcessName"})
    @Expose
	@Nullable
    public String processName;

    /**
     * The Product Name.
     * The product name of the startup process. Examples: Microsoft Outlook, Microsoft Excel. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "productName", alternate = {"ProductName"})
    @Expose
	@Nullable
    public String productName;

    /**
     * The Publisher.
     * The publisher of the startup process. Examples: Microsoft Corporation, Contoso Corp. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Total Impact In Ms.
     * The total impact of startup process on device boot time in milliseconds. Supports: $filter, $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "totalImpactInMs", alternate = {"TotalImpactInMs"})
    @Expose
	@Nullable
    public Long totalImpactInMs;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
