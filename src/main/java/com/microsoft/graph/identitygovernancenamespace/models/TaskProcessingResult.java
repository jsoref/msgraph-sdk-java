// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.identitygovernance.models.LifecycleWorkflowProcessingStatus;
import com.microsoft.graph.models.User;
import com.microsoft.graph.identitygovernance.models.Task;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Processing Result.
 */
public class TaskProcessingResult extends Entity implements IJsonBackedObject {


    /**
     * The Completed Date Time.
     * The date time when taskProcessingResult execution ended. Value is null if task execution is still in progress.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDateTime;

    /**
     * The Created Date Time.
     * The date time when the taskProcessingResult was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Failure Reason.
     * Describes why the taskProcessingResult has failed.
     */
    @SerializedName(value = "failureReason", alternate = {"FailureReason"})
    @Expose
	@Nullable
    public String failureReason;

    /**
     * The Processing Status.
     * Describes the execution status of the taskProcessingResult. The possible values are: queued, inProgress, completed, completedWithErrors, canceled, failed, unknownFutureValue.Supports $filter(eq, ne) and $orderby.
     */
    @SerializedName(value = "processingStatus", alternate = {"ProcessingStatus"})
    @Expose
	@Nullable
    public LifecycleWorkflowProcessingStatus processingStatus;

    /**
     * The Started Date Time.
     * The date time when taskProcessingResult execution started. Value is null if task execution has not yet started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "startedDateTime", alternate = {"StartedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startedDateTime;

    /**
     * The Subject.
     * The unique identifier of the Azure AD user targeted for the task execution.Supports $filter(eq, ne) and $expand.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public User subject;

    /**
     * The Task.
     * The related workflow task
     */
    @SerializedName(value = "task", alternate = {"Task"})
    @Expose
	@Nullable
    public Task task;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
