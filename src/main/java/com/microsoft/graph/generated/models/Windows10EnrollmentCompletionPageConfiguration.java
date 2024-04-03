package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 Enrollment Status Page Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10EnrollmentCompletionPageConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new {@link Windows10EnrollmentCompletionPageConfiguration} and sets the default values.
     */
    public Windows10EnrollmentCompletionPageConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnrollmentCompletionPageConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows10EnrollmentCompletionPageConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfiguration();
    }
    /**
     * Gets the allowNonBlockingAppInstallation property value. When TRUE, ESP (Enrollment Status Page) installs all required apps targeted during technician phase and ignores any failures for non-blocking apps. When FALSE, ESP fails on any error during app install. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNonBlockingAppInstallation() {
        return this.backingStore.get("allowNonBlockingAppInstallation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowNonBlockingAppInstallation", (n) -> { this.setAllowNonBlockingAppInstallation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowNonBlockingAppInstallation", this.getAllowNonBlockingAppInstallation());
    }
    /**
     * Sets the allowNonBlockingAppInstallation property value. When TRUE, ESP (Enrollment Status Page) installs all required apps targeted during technician phase and ignores any failures for non-blocking apps. When FALSE, ESP fails on any error during app install. The default is false.
     * @param value Value to set for the allowNonBlockingAppInstallation property.
     */
    public void setAllowNonBlockingAppInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowNonBlockingAppInstallation", value);
    }
}