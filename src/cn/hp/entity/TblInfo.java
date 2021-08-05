package cn.hp.entity;

import java.util.List;

public class TblInfo {
    private int pId;
    private String carNo;
    private String pMark;
    private List<ParkingInfo> parkingInfos;

    public TblInfo() {
    }

    public TblInfo(int pId, String carNo, String pMark, List<ParkingInfo> parkingInfos) {
        this.pId = pId;
        this.carNo = carNo;
        this.pMark = pMark;
        this.parkingInfos = parkingInfos;
    }

    @Override
    public String toString() {
        return "TblInfo{" +
                "pId=" + pId +
                ", carNo='" + carNo + '\'' +
                ", pMark='" + pMark + '\'' +
                ", parkingInfos=" + parkingInfos +
                '}';
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getpMark() {
        return pMark;
    }

    public void setpMark(String pMark) {
        this.pMark = pMark;
    }

    public List<ParkingInfo> getParkingInfos() {
        return parkingInfos;
    }

    public void setParkingInfos(List<ParkingInfo> parkingInfos) {
        this.parkingInfos = parkingInfos;
    }
}
