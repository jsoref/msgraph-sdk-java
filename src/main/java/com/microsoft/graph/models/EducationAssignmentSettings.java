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
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EducationGradingCategoryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Settings.
 */
public class EducationAssignmentSettings extends Entity implements IJsonBackedObject {


    /**
     * The Submission Animation Disabled.
     * Indicates whether to show the turn-in celebration animation. If true, indicates to skip the animation. The default value is false.
     */
    @SerializedName(value = "submissionAnimationDisabled", alternate = {"SubmissionAnimationDisabled"})
    @Expose
	@Nullable
    public Boolean submissionAnimationDisabled;

    /**
     * The Grading Categories.
     * When set, enables users to weight assignments differently when computing a class average grade.
     */
    @SerializedName(value = "gradingCategories", alternate = {"GradingCategories"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EducationGradingCategoryCollectionPage gradingCategories;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("gradingCategories")) {
            gradingCategories = serializer.deserializeObject(json.get("gradingCategories"), com.microsoft.graph.requests.EducationGradingCategoryCollectionPage.class);
        }
    }
}
