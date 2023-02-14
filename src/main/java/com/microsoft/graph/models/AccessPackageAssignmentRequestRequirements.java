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
import com.microsoft.graph.models.EntitlementManagementSchedule;
import com.microsoft.graph.requests.AccessPackageQuestionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request Requirements.
 */
public class AccessPackageAssignmentRequestRequirements implements IJsonBackedObject {

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
     * The Allow Custom Assignment Schedule.
     * Indicates whether the requestor is allowed to set a custom schedule.
     */
    @SerializedName(value = "allowCustomAssignmentSchedule", alternate = {"AllowCustomAssignmentSchedule"})
    @Expose
	@Nullable
    public Boolean allowCustomAssignmentSchedule;

    /**
     * The Is Approval Required For Add.
     * Indicates whether a request to add must be approved by an approver.
     */
    @SerializedName(value = "isApprovalRequiredForAdd", alternate = {"IsApprovalRequiredForAdd"})
    @Expose
	@Nullable
    public Boolean isApprovalRequiredForAdd;

    /**
     * The Is Approval Required For Update.
     * Indicates whether a request to update must be approved by an approver.
     */
    @SerializedName(value = "isApprovalRequiredForUpdate", alternate = {"IsApprovalRequiredForUpdate"})
    @Expose
	@Nullable
    public Boolean isApprovalRequiredForUpdate;

    /**
     * The Policy Description.
     * The description of the policy that the user is trying to request access using.
     */
    @SerializedName(value = "policyDescription", alternate = {"PolicyDescription"})
    @Expose
	@Nullable
    public String policyDescription;

    /**
     * The Policy Display Name.
     * The display name of the policy that the user is trying to request access using.
     */
    @SerializedName(value = "policyDisplayName", alternate = {"PolicyDisplayName"})
    @Expose
	@Nullable
    public String policyDisplayName;

    /**
     * The Policy Id.
     * The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     */
    @SerializedName(value = "policyId", alternate = {"PolicyId"})
    @Expose
	@Nullable
    public String policyId;

    /**
     * The Schedule.
     * Schedule restrictions enforced, if any.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public EntitlementManagementSchedule schedule;

    /**
     * The Questions.
     * 
     */
	@Nullable
    public com.microsoft.graph.requests.AccessPackageQuestionCollectionPage questions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
