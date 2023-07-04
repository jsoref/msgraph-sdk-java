// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.IndicatorSource;
import com.microsoft.graph.security.models.Artifact;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Indicator.
 */
public class Indicator extends Entity implements IJsonBackedObject {


    /**
     * The Source.
     * The source that provides this indicator. The possible values are: microsoftDefenderThreatIntelligence, openSourceIntelligence, public, unknownFutureValue.
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public IndicatorSource source;

    /**
     * The Artifact.
     * The artifact related to this indicator.
     */
    @SerializedName(value = "artifact", alternate = {"Artifact"})
    @Expose
	@Nullable
    public Artifact artifact;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
