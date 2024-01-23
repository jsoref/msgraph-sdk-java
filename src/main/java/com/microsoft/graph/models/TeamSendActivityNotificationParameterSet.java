// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Send Activity Notification Parameter Set.
 */
public class TeamSendActivityNotificationParameterSet {
    /**
     * The topic.
     * 
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
	@Nullable
    public TeamworkActivityTopic topic;

    /**
     * The activity Type.
     * 
     */
    @SerializedName(value = "activityType", alternate = {"ActivityType"})
    @Expose
	@Nullable
    public String activityType;

    /**
     * The chain Id.
     * 
     */
    @SerializedName(value = "chainId", alternate = {"ChainId"})
    @Expose
	@Nullable
    public Long chainId;

    /**
     * The preview Text.
     * 
     */
    @SerializedName(value = "previewText", alternate = {"PreviewText"})
    @Expose
	@Nullable
    public ItemBody previewText;

    /**
     * The teams App Id.
     * 
     */
    @SerializedName(value = "teamsAppId", alternate = {"TeamsAppId"})
    @Expose
	@Nullable
    public String teamsAppId;

    /**
     * The template Parameters.
     * 
     */
    @SerializedName(value = "templateParameters", alternate = {"TemplateParameters"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> templateParameters;

    /**
     * The recipient.
     * 
     */
    @SerializedName(value = "recipient", alternate = {"Recipient"})
    @Expose
	@Nullable
    public TeamworkNotificationRecipient recipient;


    /**
     * Instiaciates a new TeamSendActivityNotificationParameterSet
     */
    public TeamSendActivityNotificationParameterSet() {}
    /**
     * Instiaciates a new TeamSendActivityNotificationParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TeamSendActivityNotificationParameterSet(@Nonnull final TeamSendActivityNotificationParameterSetBuilder builder) {
        this.topic = builder.topic;
        this.activityType = builder.activityType;
        this.chainId = builder.chainId;
        this.previewText = builder.previewText;
        this.teamsAppId = builder.teamsAppId;
        this.templateParameters = builder.templateParameters;
        this.recipient = builder.recipient;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TeamSendActivityNotificationParameterSetBuilder newBuilder() {
        return new TeamSendActivityNotificationParameterSetBuilder();
    }
    /**
     * Fluent builder for the TeamSendActivityNotificationParameterSet
     */
    public static final class TeamSendActivityNotificationParameterSetBuilder {
        /**
         * The topic parameter value
         */
        @Nullable
        protected TeamworkActivityTopic topic;
        /**
         * Sets the Topic
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withTopic(@Nullable final TeamworkActivityTopic val) {
            this.topic = val;
            return this;
        }
        /**
         * The activityType parameter value
         */
        @Nullable
        protected String activityType;
        /**
         * Sets the ActivityType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withActivityType(@Nullable final String val) {
            this.activityType = val;
            return this;
        }
        /**
         * The chainId parameter value
         */
        @Nullable
        protected Long chainId;
        /**
         * Sets the ChainId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withChainId(@Nullable final Long val) {
            this.chainId = val;
            return this;
        }
        /**
         * The previewText parameter value
         */
        @Nullable
        protected ItemBody previewText;
        /**
         * Sets the PreviewText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withPreviewText(@Nullable final ItemBody val) {
            this.previewText = val;
            return this;
        }
        /**
         * The teamsAppId parameter value
         */
        @Nullable
        protected String teamsAppId;
        /**
         * Sets the TeamsAppId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withTeamsAppId(@Nullable final String val) {
            this.teamsAppId = val;
            return this;
        }
        /**
         * The templateParameters parameter value
         */
        @Nullable
        protected java.util.List<KeyValuePair> templateParameters;
        /**
         * Sets the TemplateParameters
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withTemplateParameters(@Nullable final java.util.List<KeyValuePair> val) {
            this.templateParameters = val;
            return this;
        }
        /**
         * The recipient parameter value
         */
        @Nullable
        protected TeamworkNotificationRecipient recipient;
        /**
         * Sets the Recipient
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSetBuilder withRecipient(@Nullable final TeamworkNotificationRecipient val) {
            this.recipient = val;
            return this;
        }
        /**
         * Instanciates a new TeamSendActivityNotificationParameterSetBuilder
         */
        @Nullable
        protected TeamSendActivityNotificationParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TeamSendActivityNotificationParameterSet build() {
            return new TeamSendActivityNotificationParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.topic != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("topic", topic));
        }
        if(this.activityType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("activityType", activityType));
        }
        if(this.chainId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("chainId", chainId));
        }
        if(this.previewText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("previewText", previewText));
        }
        if(this.teamsAppId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("teamsAppId", teamsAppId));
        }
        if(this.templateParameters != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("templateParameters", templateParameters));
        }
        if(this.recipient != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("recipient", recipient));
        }
        return result;
    }
}
