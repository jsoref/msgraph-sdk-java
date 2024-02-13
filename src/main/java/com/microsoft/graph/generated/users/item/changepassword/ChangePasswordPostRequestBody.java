package com.microsoft.graph.users.item.changepassword;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChangePasswordPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ChangePasswordPostRequestBody and sets the default values.
     */
    public ChangePasswordPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChangePasswordPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ChangePasswordPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangePasswordPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the currentPassword property value. The currentPassword property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrentPassword() {
        return this.backingStore.get("currentPassword");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currentPassword", (n) -> { this.setCurrentPassword(n.getStringValue()); });
        deserializerMap.put("newPassword", (n) -> { this.setNewPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newPassword property value. The newPassword property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNewPassword() {
        return this.backingStore.get("newPassword");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currentPassword", this.getCurrentPassword());
        writer.writeStringValue("newPassword", this.getNewPassword());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the currentPassword property value. The currentPassword property
     * @param value Value to set for the currentPassword property.
     */
    public void setCurrentPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currentPassword", value);
    }
    /**
     * Sets the newPassword property value. The newPassword property
     * @param value Value to set for the newPassword property.
     */
    public void setNewPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("newPassword", value);
    }
}