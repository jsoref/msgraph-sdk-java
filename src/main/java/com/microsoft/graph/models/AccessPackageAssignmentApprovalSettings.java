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
import com.microsoft.graph.models.AccessPackageApprovalStage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Approval Settings.
 */
public class AccessPackageAssignmentApprovalSettings implements IJsonBackedObject {

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
     * The Is Approval Required For Add.
     * 
     */
    @SerializedName(value = "isApprovalRequiredForAdd", alternate = {"IsApprovalRequiredForAdd"})
    @Expose
	@Nullable
    public Boolean isApprovalRequiredForAdd;

    /**
     * The Is Approval Required For Update.
     * 
     */
    @SerializedName(value = "isApprovalRequiredForUpdate", alternate = {"IsApprovalRequiredForUpdate"})
    @Expose
	@Nullable
    public Boolean isApprovalRequiredForUpdate;

    /**
     * The Stages.
     * 
     */
    @SerializedName(value = "stages", alternate = {"Stages"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageApprovalStage> stages;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}