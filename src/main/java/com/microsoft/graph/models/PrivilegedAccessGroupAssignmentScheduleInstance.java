// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PrivilegedAccessGroupRelationships;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentType;
import com.microsoft.graph.models.PrivilegedAccessGroupMemberType;
import com.microsoft.graph.models.PrivilegedAccessGroupEligibilityScheduleInstance;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.PrivilegedAccessScheduleInstance;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Assignment Schedule Instance.
 */
public class PrivilegedAccessGroupAssignmentScheduleInstance extends PrivilegedAccessScheduleInstance implements IJsonBackedObject {


    /**
     * The Access Id.
     * 
     */
    @SerializedName(value = "accessId", alternate = {"AccessId"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupRelationships accessId;

    /**
     * The Assignment Schedule Id.
     * 
     */
    @SerializedName(value = "assignmentScheduleId", alternate = {"AssignmentScheduleId"})
    @Expose
	@Nullable
    public String assignmentScheduleId;

    /**
     * The Assignment Type.
     * 
     */
    @SerializedName(value = "assignmentType", alternate = {"AssignmentType"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupAssignmentType assignmentType;

    /**
     * The Group Id.
     * 
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;

    /**
     * The Member Type.
     * 
     */
    @SerializedName(value = "memberType", alternate = {"MemberType"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupMemberType memberType;

    /**
     * The Principal Id.
     * 
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
	@Nullable
    public String principalId;

    /**
     * The Activated Using.
     * 
     */
    @SerializedName(value = "activatedUsing", alternate = {"ActivatedUsing"})
    @Expose
	@Nullable
    public PrivilegedAccessGroupEligibilityScheduleInstance activatedUsing;

    /**
     * The Group.
     * 
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
	@Nullable
    public Group group;

    /**
     * The Principal.
     * 
     */
    @SerializedName(value = "principal", alternate = {"Principal"})
    @Expose
	@Nullable
    public DirectoryObject principal;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}