
package org.modelwrapper.beans.controller.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DUMMY",
    "US"
})
public class Country {

    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonProperty("US")
    private Integer uS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DUMMY")
    public Integer getDUMMY() {
        return dUMMY;
    }

    @JsonProperty("DUMMY")
    public void setDUMMY(Integer dUMMY) {
        this.dUMMY = dUMMY;
    }

    @JsonProperty("US")
    public Integer getUS() {
        return uS;
    }

    @JsonProperty("US")
    public void setUS(Integer uS) {
        this.uS = uS;
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
