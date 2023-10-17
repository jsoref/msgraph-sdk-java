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
import com.microsoft.graph.models.MacOSIncludedApp;
import com.microsoft.graph.models.MacOSMinimumOperatingSystem;
import com.microsoft.graph.models.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSDmg App.
 */
public class MacOSDmgApp extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Ignore Version Detection.
     * When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE, indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps that use a self update feature. The default value is FALSE.
     */
    @SerializedName(value = "ignoreVersionDetection", alternate = {"IgnoreVersionDetection"})
    @Expose
	@Nullable
    public Boolean ignoreVersionDetection;

    /**
     * The Included Apps.
     * The list of .apps expected to be installed by the DMG (Apple Disk Image)
     */
    @SerializedName(value = "includedApps", alternate = {"IncludedApps"})
    @Expose
	@Nullable
    public java.util.List<MacOSIncludedApp> includedApps;

    /**
     * The Minimum Supported Operating System.
     * ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public MacOSMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Primary Bundle Id.
     * The bundleId of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleIdentifier in the app's bundle configuration.
     */
    @SerializedName(value = "primaryBundleId", alternate = {"PrimaryBundleId"})
    @Expose
	@Nullable
    public String primaryBundleId;

    /**
     * The Primary Bundle Version.
     * The version of the primary .app in the DMG (Apple Disk Image). This maps to the CFBundleShortVersion in the app's bundle configuration.
     */
    @SerializedName(value = "primaryBundleVersion", alternate = {"PrimaryBundleVersion"})
    @Expose
	@Nullable
    public String primaryBundleVersion;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}