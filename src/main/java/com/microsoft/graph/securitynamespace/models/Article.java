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
import com.microsoft.graph.security.models.FormattedContent;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.security.requests.ArticleIndicatorCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Article.
 */
public class Article extends Entity implements IJsonBackedObject {


    /**
     * The Body.
     * Formatted article contents.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public FormattedContent body;

    /**
     * The Created Date Time.
     * The date and time when this article was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Image Url.
     * URL of the header image for this article, used for display purposes.
     */
    @SerializedName(value = "imageUrl", alternate = {"ImageUrl"})
    @Expose
	@Nullable
    public String imageUrl;

    /**
     * The Is Featured.
     * Indicates whether this article is currently featured by Microsoft.
     */
    @SerializedName(value = "isFeatured", alternate = {"IsFeatured"})
    @Expose
	@Nullable
    public Boolean isFeatured;

    /**
     * The Last Updated Date Time.
     * The most recent date and time when this article was updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Summary.
     * A quick summary of this article.
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
	@Nullable
    public FormattedContent summary;

    /**
     * The Tags.
     * Tags for this article, communicating keywords, or key concepts.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Title.
     * The title of this article.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Indicators.
     * Indicators related to this article.
     */
	@Nullable
    public com.microsoft.graph.security.requests.ArticleIndicatorCollectionPage indicators;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("indicators")) {
            indicators = serializer.deserializeObject(json.get("indicators"), com.microsoft.graph.security.requests.ArticleIndicatorCollectionPage.class);
        }
    }
}