// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.DataSource;
import com.microsoft.graph.security.models.EdiscoveryIndexOperation;
import com.microsoft.graph.security.models.DataSourceContainer;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source.
 */
public class EdiscoveryNoncustodialDataSource extends DataSourceContainer implements IJsonBackedObject {


    /**
     * The Data Source.
     * User source or SharePoint site data source as non-custodial data source.
     */
    @SerializedName(value = "dataSource", alternate = {"DataSource"})
    @Expose
	@Nullable
    public DataSource dataSource;

    /**
     * The Last Index Operation.
     * Operation entity that represents the latest indexing for the non-custodial data source.
     */
    @SerializedName(value = "lastIndexOperation", alternate = {"LastIndexOperation"})
    @Expose
	@Nullable
    public EdiscoveryIndexOperation lastIndexOperation;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}