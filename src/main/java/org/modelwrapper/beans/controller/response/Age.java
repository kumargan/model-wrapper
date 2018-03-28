
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
    "3",
    "4",
    "5",
    "DUMMY"
})
public class Age {

    @JsonProperty("3")
    private Integer _3;
    @JsonProperty("4")
    private Integer _4;
    @JsonProperty("5")
    private Integer _5;
    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("3")
    public Integer get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(Integer _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public Integer get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(Integer _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public Integer get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(Integer _5) {
        this._5 = _5;
    }

    @JsonProperty("DUMMY")
    public Integer getDUMMY() {
        return dUMMY;
    }

    @JsonProperty("DUMMY")
    public void setDUMMY(Integer dUMMY) {
        this.dUMMY = dUMMY;
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
