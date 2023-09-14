// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AccessPackageRequestType;
import com.microsoft.graph.models.AccessPackageRequestState;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.models.AccessPackageResource;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request.
 */
public class AccessPackageResourceRequest extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Request Type.
     * The type of the request. Use adminAdd to add a resource, if the caller is an administrator or resource owner, adminUpdate to update a resource, or adminRemove to remove a resource.
     */
    @SerializedName(value = "requestType", alternate = {"RequestType"})
    @Expose
	@Nullable
    public AccessPackageRequestType requestType;

    /**
     * The State.
     * The outcome of whether the service was able to add the resource to the catalog.  The value is delivered if the resource was added or removed. Read-only.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public AccessPackageRequestState state;

    /**
     * The Catalog.
     * 
     */
    @SerializedName(value = "catalog", alternate = {"Catalog"})
    @Expose
	@Nullable
    public AccessPackageCatalog catalog;

    /**
     * The Resource.
     * 
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public AccessPackageResource resource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}