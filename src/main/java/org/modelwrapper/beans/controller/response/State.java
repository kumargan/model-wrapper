
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
    "AK",
    "AL",
    "AR",
    "AZ",
    "CA",
    "CO",
    "CT",
    "DC",
    "DE",
    "DUMMY",
    "FL",
    "GA",
    "HI",
    "IA",
    "ID",
    "IL",
    "IN",
    "KS",
    "KY",
    "LA",
    "MA",
    "MD",
    "ME",
    "MI",
    "MN",
    "MO",
    "MS",
    "MT",
    "NC",
    "ND",
    "NE",
    "NH",
    "NJ",
    "NM",
    "NV",
    "NY",
    "OH",
    "OK",
    "OR",
    "PA",
    "RI",
    "SC",
    "SD",
    "TN",
    "TX",
    "UT",
    "VA",
    "VT",
    "WA",
    "WI",
    "WV",
    "WY"
})
public class State {

    @JsonProperty("AK")
    private Integer aK;
    @JsonProperty("AL")
    private Integer aL;
    @JsonProperty("AR")
    private Integer aR;
    @JsonProperty("AZ")
    private Integer aZ;
    @JsonProperty("CA")
    private Integer cA;
    @JsonProperty("CO")
    private Integer cO;
    @JsonProperty("CT")
    private Integer cT;
    @JsonProperty("DC")
    private Integer dC;
    @JsonProperty("DE")
    private Integer dE;
    @JsonProperty("DUMMY")
    private Integer dUMMY;
    @JsonProperty("FL")
    private Integer fL;
    @JsonProperty("GA")
    private Integer gA;
    @JsonProperty("HI")
    private Integer hI;
    @JsonProperty("IA")
    private Integer iA;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("IL")
    private Integer iL;
    @JsonProperty("IN")
    private Integer iN;
    @JsonProperty("KS")
    private Integer kS;
    @JsonProperty("KY")
    private Integer kY;
    @JsonProperty("LA")
    private Integer lA;
    @JsonProperty("MA")
    private Integer mA;
    @JsonProperty("MD")
    private Integer mD;
    @JsonProperty("ME")
    private Integer mE;
    @JsonProperty("MI")
    private Integer mI;
    @JsonProperty("MN")
    private Integer mN;
    @JsonProperty("MO")
    private Integer mO;
    @JsonProperty("MS")
    private Integer mS;
    @JsonProperty("MT")
    private Integer mT;
    @JsonProperty("NC")
    private Integer nC;
    @JsonProperty("ND")
    private Integer nD;
    @JsonProperty("NE")
    private Integer nE;
    @JsonProperty("NH")
    private Integer nH;
    @JsonProperty("NJ")
    private Integer nJ;
    @JsonProperty("NM")
    private Integer nM;
    @JsonProperty("NV")
    private Integer nV;
    @JsonProperty("NY")
    private Integer nY;
    @JsonProperty("OH")
    private Integer oH;
    @JsonProperty("OK")
    private Integer oK;
    @JsonProperty("OR")
    private Integer oR;
    @JsonProperty("PA")
    private Integer pA;
    @JsonProperty("RI")
    private Integer rI;
    @JsonProperty("SC")
    private Integer sC;
    @JsonProperty("SD")
    private Integer sD;
    @JsonProperty("TN")
    private Integer tN;
    @JsonProperty("TX")
    private Integer tX;
    @JsonProperty("UT")
    private Integer uT;
    @JsonProperty("VA")
    private Integer vA;
    @JsonProperty("VT")
    private Integer vT;
    @JsonProperty("WA")
    private Integer wA;
    @JsonProperty("WI")
    private Integer wI;
    @JsonProperty("WV")
    private Integer wV;
    @JsonProperty("WY")
    private Integer wY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AK")
    public Integer getAK() {
        return aK;
    }

    @JsonProperty("AK")
    public void setAK(Integer aK) {
        this.aK = aK;
    }

    @JsonProperty("AL")
    public Integer getAL() {
        return aL;
    }

    @JsonProperty("AL")
    public void setAL(Integer aL) {
        this.aL = aL;
    }

    @JsonProperty("AR")
    public Integer getAR() {
        return aR;
    }

    @JsonProperty("AR")
    public void setAR(Integer aR) {
        this.aR = aR;
    }

    @JsonProperty("AZ")
    public Integer getAZ() {
        return aZ;
    }

    @JsonProperty("AZ")
    public void setAZ(Integer aZ) {
        this.aZ = aZ;
    }

    @JsonProperty("CA")
    public Integer getCA() {
        return cA;
    }

    @JsonProperty("CA")
    public void setCA(Integer cA) {
        this.cA = cA;
    }

    @JsonProperty("CO")
    public Integer getCO() {
        return cO;
    }

    @JsonProperty("CO")
    public void setCO(Integer cO) {
        this.cO = cO;
    }

    @JsonProperty("CT")
    public Integer getCT() {
        return cT;
    }

    @JsonProperty("CT")
    public void setCT(Integer cT) {
        this.cT = cT;
    }

    @JsonProperty("DC")
    public Integer getDC() {
        return dC;
    }

    @JsonProperty("DC")
    public void setDC(Integer dC) {
        this.dC = dC;
    }

    @JsonProperty("DE")
    public Integer getDE() {
        return dE;
    }

    @JsonProperty("DE")
    public void setDE(Integer dE) {
        this.dE = dE;
    }

    @JsonProperty("DUMMY")
    public Integer getDUMMY() {
        return dUMMY;
    }

    @JsonProperty("DUMMY")
    public void setDUMMY(Integer dUMMY) {
        this.dUMMY = dUMMY;
    }

    @JsonProperty("FL")
    public Integer getFL() {
        return fL;
    }

    @JsonProperty("FL")
    public void setFL(Integer fL) {
        this.fL = fL;
    }

    @JsonProperty("GA")
    public Integer getGA() {
        return gA;
    }

    @JsonProperty("GA")
    public void setGA(Integer gA) {
        this.gA = gA;
    }

    @JsonProperty("HI")
    public Integer getHI() {
        return hI;
    }

    @JsonProperty("HI")
    public void setHI(Integer hI) {
        this.hI = hI;
    }

    @JsonProperty("IA")
    public Integer getIA() {
        return iA;
    }

    @JsonProperty("IA")
    public void setIA(Integer iA) {
        this.iA = iA;
    }

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("IL")
    public Integer getIL() {
        return iL;
    }

    @JsonProperty("IL")
    public void setIL(Integer iL) {
        this.iL = iL;
    }

    @JsonProperty("IN")
    public Integer getIN() {
        return iN;
    }

    @JsonProperty("IN")
    public void setIN(Integer iN) {
        this.iN = iN;
    }

    @JsonProperty("KS")
    public Integer getKS() {
        return kS;
    }

    @JsonProperty("KS")
    public void setKS(Integer kS) {
        this.kS = kS;
    }

    @JsonProperty("KY")
    public Integer getKY() {
        return kY;
    }

    @JsonProperty("KY")
    public void setKY(Integer kY) {
        this.kY = kY;
    }

    @JsonProperty("LA")
    public Integer getLA() {
        return lA;
    }

    @JsonProperty("LA")
    public void setLA(Integer lA) {
        this.lA = lA;
    }

    @JsonProperty("MA")
    public Integer getMA() {
        return mA;
    }

    @JsonProperty("MA")
    public void setMA(Integer mA) {
        this.mA = mA;
    }

    @JsonProperty("MD")
    public Integer getMD() {
        return mD;
    }

    @JsonProperty("MD")
    public void setMD(Integer mD) {
        this.mD = mD;
    }

    @JsonProperty("ME")
    public Integer getME() {
        return mE;
    }

    @JsonProperty("ME")
    public void setME(Integer mE) {
        this.mE = mE;
    }

    @JsonProperty("MI")
    public Integer getMI() {
        return mI;
    }

    @JsonProperty("MI")
    public void setMI(Integer mI) {
        this.mI = mI;
    }

    @JsonProperty("MN")
    public Integer getMN() {
        return mN;
    }

    @JsonProperty("MN")
    public void setMN(Integer mN) {
        this.mN = mN;
    }

    @JsonProperty("MO")
    public Integer getMO() {
        return mO;
    }

    @JsonProperty("MO")
    public void setMO(Integer mO) {
        this.mO = mO;
    }

    @JsonProperty("MS")
    public Integer getMS() {
        return mS;
    }

    @JsonProperty("MS")
    public void setMS(Integer mS) {
        this.mS = mS;
    }

    @JsonProperty("MT")
    public Integer getMT() {
        return mT;
    }

    @JsonProperty("MT")
    public void setMT(Integer mT) {
        this.mT = mT;
    }

    @JsonProperty("NC")
    public Integer getNC() {
        return nC;
    }

    @JsonProperty("NC")
    public void setNC(Integer nC) {
        this.nC = nC;
    }

    @JsonProperty("ND")
    public Integer getND() {
        return nD;
    }

    @JsonProperty("ND")
    public void setND(Integer nD) {
        this.nD = nD;
    }

    @JsonProperty("NE")
    public Integer getNE() {
        return nE;
    }

    @JsonProperty("NE")
    public void setNE(Integer nE) {
        this.nE = nE;
    }

    @JsonProperty("NH")
    public Integer getNH() {
        return nH;
    }

    @JsonProperty("NH")
    public void setNH(Integer nH) {
        this.nH = nH;
    }

    @JsonProperty("NJ")
    public Integer getNJ() {
        return nJ;
    }

    @JsonProperty("NJ")
    public void setNJ(Integer nJ) {
        this.nJ = nJ;
    }

    @JsonProperty("NM")
    public Integer getNM() {
        return nM;
    }

    @JsonProperty("NM")
    public void setNM(Integer nM) {
        this.nM = nM;
    }

    @JsonProperty("NV")
    public Integer getNV() {
        return nV;
    }

    @JsonProperty("NV")
    public void setNV(Integer nV) {
        this.nV = nV;
    }

    @JsonProperty("NY")
    public Integer getNY() {
        return nY;
    }

    @JsonProperty("NY")
    public void setNY(Integer nY) {
        this.nY = nY;
    }

    @JsonProperty("OH")
    public Integer getOH() {
        return oH;
    }

    @JsonProperty("OH")
    public void setOH(Integer oH) {
        this.oH = oH;
    }

    @JsonProperty("OK")
    public Integer getOK() {
        return oK;
    }

    @JsonProperty("OK")
    public void setOK(Integer oK) {
        this.oK = oK;
    }

    @JsonProperty("OR")
    public Integer getOR() {
        return oR;
    }

    @JsonProperty("OR")
    public void setOR(Integer oR) {
        this.oR = oR;
    }

    @JsonProperty("PA")
    public Integer getPA() {
        return pA;
    }

    @JsonProperty("PA")
    public void setPA(Integer pA) {
        this.pA = pA;
    }

    @JsonProperty("RI")
    public Integer getRI() {
        return rI;
    }

    @JsonProperty("RI")
    public void setRI(Integer rI) {
        this.rI = rI;
    }

    @JsonProperty("SC")
    public Integer getSC() {
        return sC;
    }

    @JsonProperty("SC")
    public void setSC(Integer sC) {
        this.sC = sC;
    }

    @JsonProperty("SD")
    public Integer getSD() {
        return sD;
    }

    @JsonProperty("SD")
    public void setSD(Integer sD) {
        this.sD = sD;
    }

    @JsonProperty("TN")
    public Integer getTN() {
        return tN;
    }

    @JsonProperty("TN")
    public void setTN(Integer tN) {
        this.tN = tN;
    }

    @JsonProperty("TX")
    public Integer getTX() {
        return tX;
    }

    @JsonProperty("TX")
    public void setTX(Integer tX) {
        this.tX = tX;
    }

    @JsonProperty("UT")
    public Integer getUT() {
        return uT;
    }

    @JsonProperty("UT")
    public void setUT(Integer uT) {
        this.uT = uT;
    }

    @JsonProperty("VA")
    public Integer getVA() {
        return vA;
    }

    @JsonProperty("VA")
    public void setVA(Integer vA) {
        this.vA = vA;
    }

    @JsonProperty("VT")
    public Integer getVT() {
        return vT;
    }

    @JsonProperty("VT")
    public void setVT(Integer vT) {
        this.vT = vT;
    }

    @JsonProperty("WA")
    public Integer getWA() {
        return wA;
    }

    @JsonProperty("WA")
    public void setWA(Integer wA) {
        this.wA = wA;
    }

    @JsonProperty("WI")
    public Integer getWI() {
        return wI;
    }

    @JsonProperty("WI")
    public void setWI(Integer wI) {
        this.wI = wI;
    }

    @JsonProperty("WV")
    public Integer getWV() {
        return wV;
    }

    @JsonProperty("WV")
    public void setWV(Integer wV) {
        this.wV = wV;
    }

    @JsonProperty("WY")
    public Integer getWY() {
        return wY;
    }

    @JsonProperty("WY")
    public void setWY(Integer wY) {
        this.wY = wY;
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
