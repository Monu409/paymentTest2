package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OmInfoParent {

@SerializedName("omInfo")
@Expose
private List<OmInfo> omInfo = null;

public List<OmInfo> getOmInfo() {
return omInfo;
}

public void setOmInfo(List<OmInfo> omInfo) {
this.omInfo = omInfo;
}

}