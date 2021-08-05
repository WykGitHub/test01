package cn.hp.test;

import cn.hp.entity.ParkingInfo;
import cn.hp.entity.TblInfo;
import cn.hp.mapper.ParkingMapper;
import cn.hp.mapper.TblMapper;
import cn.hp.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.Array;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
        test7();
    }

    private static void test7() {
        int [] array={2,3};
        SqlSession session =MybatisUtils.getSession();
        List<ParkingInfo> slist =session.getMapper(ParkingMapper.class).findAllArray(array);
        for (ParkingInfo p:slist){
            System.out.println(p.getPdId()+"\t"+p.getpName());
        }
    }

    private static void test6() {
        SqlSession session =MybatisUtils.getSession();
        ParkingInfo si =session.getMapper(ParkingMapper.class).findParkByPdId(4);
        si.setpName("谷家宝");
        int a =session.getMapper(ParkingMapper.class).update(si);
        if (a>0){
            System.out.println("ok");
        }
        session.commit();
        MybatisUtils.closeSession(session);
    }

    private static void test5() {
        SqlSession session =MybatisUtils.getSession();
        List<ParkingInfo> parkList=session.getMapper(ParkingMapper.class).findParkByName("谷");
        for (ParkingInfo p:parkList){
            System.out.println(p.getPdId()+"\t"+p.getpName());
        }
    }

    private static void test4() {
        SqlSession session =MybatisUtils.getSession();
        List<ParkingInfo> parkList=session.getMapper(ParkingMapper.class).findParks(0,"谷","河南郑州");
        for (ParkingInfo p:parkList){
            System.out.println(p.getPdId()+"\t"+p.getpName());
        }
    }

    private static void test3() {
            SqlSession session =MybatisUtils.getSession();
            List<ParkingInfo> parkList=session.getMapper(ParkingMapper.class).findPark(3,null);
            for (ParkingInfo p:parkList){
                System.out.println(p.getPdId()+"\t"+p.getpName());
            }
    }

    private static void test2() {
        SqlSession session = MybatisUtils.getSession();
        List<TblInfo> lists = session.getMapper(TblMapper.class).findAll();
        for (TblInfo c:lists){
            System.out.println(c.getpId()+"\t"+c.getCarNo()+"\t"+c.getParkingInfos().size());
            List<ParkingInfo> listpark=c.getParkingInfos();
            for (ParkingInfo s:listpark){
                System.out.println(s.getpId()+"\t"+s.getpName());
            }
        }
    }

    private static void test1() {
        SqlSession session = MybatisUtils.getSession();
        List<ParkingInfo> lists = session.getMapper(ParkingMapper.class).findAll();
        for (ParkingInfo s:lists){
            System.out.println(s.getPdId()+"\t"+s.getTblInfo().getCarNo());
        }
    }
}
