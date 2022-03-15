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
import com.microsoft.graph.models.Approval;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
import com.microsoft.graph.models.AccessPackageAssignmentRequest;
import com.microsoft.graph.models.AccessPackageAssignment;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.models.ConnectedOrganization;
import com.microsoft.graph.models.EntitlementManagementSettings;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ApprovalCollectionPage;
import com.microsoft.graph.requests.AccessPackageCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentCollectionPage;
import com.microsoft.graph.requests.AccessPackageCatalogCollectionPage;
import com.microsoft.graph.requests.ConnectedOrganizationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entitlement Management.
 */
public class EntitlementManagement extends Entity implements IJsonBackedObject {


    /**
     * The Access Package Assignment Approvals.
     * Approval stages for assignment requests.
     */
    @SerializedName(value = "accessPackageAssignmentApprovals", alternate = {"AccessPackageAssignmentApprovals"})
    @Expose
	@Nullable
    public ApprovalCollectionPage accessPackageAssignmentApprovals;

    /**
     * The Access Packages.
     * Represents access package objects.
     */
    @SerializedName(value = "accessPackages", alternate = {"AccessPackages"})
    @Expose
	@Nullable
    public AccessPackageCollectionPage accessPackages;

    /**
     * The Assignment Policies.
     * 
     */
    @SerializedName(value = "assignmentPolicies", alternate = {"AssignmentPolicies"})
    @Expose
	@Nullable
    public AccessPackageAssignmentPolicyCollectionPage assignmentPolicies;

    /**
     * The Assignment Requests.
     * Represents access package assignment requests created by or on behalf of a user.
     */
    @SerializedName(value = "assignmentRequests", alternate = {"AssignmentRequests"})
    @Expose
	@Nullable
    public AccessPackageAssignmentRequestCollectionPage assignmentRequests;

    /**
     * The Assignments.
     * Represents the grant of an access package to a subject (user or group).
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public AccessPackageAssignmentCollectionPage assignments;

    /**
     * The Catalogs.
     * Represents a group of access packages.
     */
    @SerializedName(value = "catalogs", alternate = {"Catalogs"})
    @Expose
	@Nullable
    public AccessPackageCatalogCollectionPage catalogs;

    /**
     * The Connected Organizations.
     * Represents references to a directory or domain of another organization whose users can request access.
     */
    @SerializedName(value = "connectedOrganizations", alternate = {"ConnectedOrganizations"})
    @Expose
	@Nullable
    public ConnectedOrganizationCollectionPage connectedOrganizations;

    /**
     * The Settings.
     * Represents the settings that control the behavior of Azure AD entitlement management.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public EntitlementManagementSettings settings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("accessPackageAssignmentApprovals")) {
            accessPackageAssignmentApprovals = serializer.deserializeObject(json.get("accessPackageAssignmentApprovals"), ApprovalCollectionPage.class);
        }

        if (json.has("accessPackages")) {
            accessPackages = serializer.deserializeObject(json.get("accessPackages"), AccessPackageCollectionPage.class);
        }

        if (json.has("assignmentPolicies")) {
            assignmentPolicies = serializer.deserializeObject(json.get("assignmentPolicies"), AccessPackageAssignmentPolicyCollectionPage.class);
        }

        if (json.has("assignmentRequests")) {
            assignmentRequests = serializer.deserializeObject(json.get("assignmentRequests"), AccessPackageAssignmentRequestCollectionPage.class);
        }

        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), AccessPackageAssignmentCollectionPage.class);
        }

        if (json.has("catalogs")) {
            catalogs = serializer.deserializeObject(json.get("catalogs"), AccessPackageCatalogCollectionPage.class);
        }

        if (json.has("connectedOrganizations")) {
            connectedOrganizations = serializer.deserializeObject(json.get("connectedOrganizations"), ConnectedOrganizationCollectionPage.class);
        }
    }
}
