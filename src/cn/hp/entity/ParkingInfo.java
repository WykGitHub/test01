package cn.hp.entity;

public class ParkingInfo {


    //修改了
    private String test01;



    private int pdId;
    private int pId;
    private String beginDate;
    private String endDate;
    private int pDur;
    private String pName;
    private String pAddress;
    private TblInfo tblInfo;

    public ParkingInfo() {
    }

    public ParkingInfo(int pdId, int pId, String beginDate, String endDate, int pDur, String pName, String pAddress, TblInfo tblInfo) {
        this.pdId = pdId;
        this.pId = pId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.pDur = pDur;
        this.pName = pName;
        this.pAddress = pAddress;
        this.tblInfo = tblInfo;
    }

    @Override
    public String toString() {
        return "ParkingInfo{" +
                "pdId=" + pdId +
                ", pId=" + pId +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", pDur=" + pDur +
                ", pName='" + pName + '\'' +
                ", pAddress='" + pAddress + '\'' +
                ", tblInfo=" + tblInfo +
                '}';
    }

    public int getPdId() {
        return pdId;
    }

    public void setPdId(int pdId) {
        this.pdId = pdId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getpDur() {
        return pDur;
    }

    public void setpDur(int pDur) {
        this.pDur = pDur;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public TblInfo getTblInfo() {
        return tblInfo;
    }

    public void setTblInfo(TblInfo tblInfo) {
        this.tblInfo = tblInfo;
    }
}