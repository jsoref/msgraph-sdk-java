// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PrintSettings;
import com.microsoft.graph.models.extensions.PrintConnector;
import com.microsoft.graph.models.extensions.PrintOperation;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintService;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterCollectionPage;
import com.microsoft.graph.requests.extensions.PrintServiceCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print.
 */
public class Print implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Settings.
     * Tenant-wide settings for the Universal Print service.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
    public PrintSettings settings;

    /**
     * The Connectors.
     * The list of available print connectors.
     */
    @SerializedName(value = "connectors", alternate = {"Connectors"})
    @Expose
    public PrintConnectorCollectionPage connectors;

    /**
     * The Operations.
     * The list of print long running operations.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
    public PrintOperationCollectionPage operations;

    /**
     * The Printers.
     * The list of printers registered in the tenant.
     */
    @SerializedName(value = "printers", alternate = {"Printers"})
    @Expose
    public PrinterCollectionPage printers;

    /**
     * The Services.
     * The list of available Universal Print service endpoints.
     */
    @SerializedName(value = "services", alternate = {"Services"})
    @Expose
    public PrintServiceCollectionPage services;

    /**
     * The Shares.
     * The list of printer shares registered in the tenant.
     */
    @SerializedName(value = "shares", alternate = {"Shares"})
    @Expose
    public PrinterShareCollectionPage shares;

    /**
     * The Task Definitions.
     * List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     */
    @SerializedName(value = "taskDefinitions", alternate = {"TaskDefinitions"})
    @Expose
    public PrintTaskDefinitionCollectionPage taskDefinitions;


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


        if (json.has("connectors")) {
            connectors = serializer.deserializeObject(json.get("connectors").toString(), PrintConnectorCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), PrintOperationCollectionPage.class);
        }

        if (json.has("printers")) {
            printers = serializer.deserializeObject(json.get("printers").toString(), PrinterCollectionPage.class);
        }

        if (json.has("services")) {
            services = serializer.deserializeObject(json.get("services").toString(), PrintServiceCollectionPage.class);
        }

        if (json.has("shares")) {
            shares = serializer.deserializeObject(json.get("shares").toString(), PrinterShareCollectionPage.class);
        }

        if (json.has("taskDefinitions")) {
            taskDefinitions = serializer.deserializeObject(json.get("taskDefinitions").toString(), PrintTaskDefinitionCollectionPage.class);
        }
    }
}
