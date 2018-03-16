// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App.
 */
public class BaseMobileApp extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The admin provided or imported title of the app.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * The description of the app.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Publisher.
     * The publisher of the app.
     */
    @SerializedName("publisher")
    @Expose
    public String publisher;

    /**
     * The Large Icon.
     * The large icon, to be displayed in the app details and used for upload of the icon.
     */
    @SerializedName("largeIcon")
    @Expose
    public MimeContent largeIcon;

    /**
     * The Created Date Time.
     * The date and time the app was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Modified Date Time.
     * The date and time the app was last modified.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Is Featured.
     * The value indicating whether the app is marked as featured by the admin.
     */
    @SerializedName("isFeatured")
    @Expose
    public Boolean isFeatured;

    /**
     * The Privacy Information Url.
     * The privacy statement Url.
     */
    @SerializedName("privacyInformationUrl")
    @Expose
    public String privacyInformationUrl;

    /**
     * The Information Url.
     * The more information Url.
     */
    @SerializedName("informationUrl")
    @Expose
    public String informationUrl;

    /**
     * The Owner.
     * The owner of the app.
     */
    @SerializedName("owner")
    @Expose
    public String owner;

    /**
     * The Developer.
     * The developer of the app.
     */
    @SerializedName("developer")
    @Expose
    public String developer;

    /**
     * The Notes.
     * Notes for the app.
     */
    @SerializedName("notes")
    @Expose
    public String notes;

    /**
     * The Publishing State.
     * The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are: notPublished, processing, published.
     */
    @SerializedName("publishingState")
    @Expose
    public MobileAppPublishingState publishingState;

    /**
     * The Categories.
     * The list of categories for this app.
     */
    public MobileAppCategoryCollectionPage categories;

    /**
     * The Assignments.
     * The list of group assignments for this mobile app.
     */
    public MobileAppAssignmentCollectionPage assignments;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("categories")) {
            final BaseMobileAppCategoryCollectionResponse response = new BaseMobileAppCategoryCollectionResponse();
            if (json.has("categories@odata.nextLink")) {
                response.nextLink = json.get("categories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("categories").toString(), JsonObject[].class);
            final MobileAppCategory[] array = new MobileAppCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            categories = new MobileAppCategoryCollectionPage(response, null);
        }

        if (json.has("assignments")) {
            final BaseMobileAppAssignmentCollectionResponse response = new BaseMobileAppAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final MobileAppAssignment[] array = new MobileAppAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new MobileAppAssignmentCollectionPage(response, null);
        }
    }
}
