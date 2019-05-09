package com.example.paymenttest.modals.server;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FmInfoParent {

@SerializedName("fmInfo")
@Expose
private List<FmInfo> fmInfo = null;

public List<FmInfo> getFmInfo() {
return fmInfo;
}

public void setFmInfo(List<FmInfo> fmInfo) {
this.fmInfo = fmInfo;
}

}