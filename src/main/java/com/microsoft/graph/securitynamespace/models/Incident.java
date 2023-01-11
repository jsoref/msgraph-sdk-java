// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.AlertClassification;
import com.microsoft.graph.security.models.AlertComment;
import com.microsoft.graph.security.models.AlertDetermination;
import com.microsoft.graph.security.models.AlertSeverity;
import com.microsoft.graph.security.models.IncidentStatus;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.security.requests.AlertCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Incident.
 */
public class Incident extends Entity implements IJsonBackedObject {


    /**
     * The Assigned To.
     * 
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
	@Nullable
    public String assignedTo;

    /**
     * The Classification.
     * 
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
	@Nullable
    public AlertClassification classification;

    /**
     * The Comments.
     * 
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
	@Nullable
    public java.util.List<AlertComment> comments;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Custom Tags.
     * 
     */
    @SerializedName(value = "customTags", alternate = {"CustomTags"})
    @Expose
	@Nullable
    public java.util.List<String> customTags;

    /**
     * The Determination.
     * 
     */
    @SerializedName(value = "determination", alternate = {"Determination"})
    @Expose
	@Nullable
    public AlertDetermination determination;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Incident Web Url.
     * 
     */
    @SerializedName(value = "incidentWebUrl", alternate = {"IncidentWebUrl"})
    @Expose
	@Nullable
    public String incidentWebUrl;

    /**
     * The Last Update Date Time.
     * 
     */
    @SerializedName(value = "lastUpdateDateTime", alternate = {"LastUpdateDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdateDateTime;

    /**
     * The Redirect Incident Id.
     * 
     */
    @SerializedName(value = "redirectIncidentId", alternate = {"RedirectIncidentId"})
    @Expose
	@Nullable
    public String redirectIncidentId;

    /**
     * The Severity.
     * 
     */
    @SerializedName(value = "severity", alternate = {"Severity"})
    @Expose
	@Nullable
    public AlertSeverity severity;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public IncidentStatus status;

    /**
     * The Tenant Id.
     * 
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The Alerts.
     * 
     */
	@Nullable
    public com.microsoft.graph.security.requests.AlertCollectionPage alerts;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("alerts")) {
            alerts = serializer.deserializeObject(json.get("alerts"), com.microsoft.graph.security.requests.AlertCollectionPage.class);
        }
    }
}