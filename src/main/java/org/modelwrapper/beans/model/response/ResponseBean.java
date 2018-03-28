
package org.modelwrapper.beans.model.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errors",
    "values",
    "inputMessages"
})
public class ResponseBean {

    @JsonProperty("errors")
    private List<Object> errors = null;
    @JsonProperty("values")
    private Values values;
    @JsonProperty("inputMessages")
    private List<Object> inputMessages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @JsonProperty("values")
    public Values getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(Values values) {
        this.values = values;
    }

    @JsonProperty("inputMessages")
    public List<Object> getInputMessages() {
        return inputMessages;
    }

    @JsonProperty("inputMessages")
    public void setInputMessages(List<Object> inputMessages) {
        this.inputMessages = inputMessages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
