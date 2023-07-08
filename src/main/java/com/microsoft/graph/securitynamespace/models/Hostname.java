// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.Host;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hostname.
 */
public class Hostname extends Host implements IJsonBackedObject {


    /**
     * The Registrant.
     * The company or individual who registered this hostname, from WHOIS data.
     */
    @SerializedName(value = "registrant", alternate = {"Registrant"})
    @Expose
	@Nullable
    public String registrant;

    /**
     * The Registrar.
     * The registrar for this hostname, from WHOIS data.
     */
    @SerializedName(value = "registrar", alternate = {"Registrar"})
    @Expose
	@Nullable
    public String registrar;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}