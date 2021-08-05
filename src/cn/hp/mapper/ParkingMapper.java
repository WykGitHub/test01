package cn.hp.mapper;

import cn.hp.entity.ParkingInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParkingMapper {
    /**
     * 查询所有的学生数据
     * @return 所有的学生
     */
    public List<ParkingInfo> findAll();

    /**
     * 查询大于某个dur的学生
     * @param dur dur
     * @return  学生信息
     */
    public List<ParkingInfo> findParkByDur(int dur);

    /**
     * 差尊某个学生的信息
     * @param id 学号
     * @return 学生的信息
     */
    public ParkingInfo findParkByPdId(int id);

    /**
     * 模糊查询根据名字
     * @param name 名字
     * @return
     */
    public List<ParkingInfo> findParkByName(String name);

    public List<ParkingInfo> findPark(@Param("pdur") int pdur, @Param("name") String name);
    public List<ParkingInfo> findParks(@Param("pdur") int pdur, @Param("name") String name,@Param("address")String address);

    public List<ParkingInfo> findParkByMap(Map<String, Object> map);

    /**
     *  删除
     * @param pdId
     * @return
     */
    public int deletePark(int pdId);

    /**
     * 修改
     * @param si
     * @return
     */
    public int update(ParkingInfo si);

    /**
     * 添加
     * @param si
     * @return
     */
    public int insert(ParkingInfo si);

    public List<ParkingInfo> findAllArray(int[] array);
}
