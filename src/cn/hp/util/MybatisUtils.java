package cn.hp.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

	//����mybatis�����ļ�
	//����sqlsessionfactory����
    //����sqlsession���Ӷ���
	//�����ر�sqlsession���Ӷ���
	private static SqlSessionFactory sessionFactory;

	static{
		
		String resource="mybatis.xml";
		try {
			InputStream is= Resources.getResourceAsStream(resource);
			sessionFactory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static SqlSession getSession(){
		return sessionFactory.openSession();
	}

	public static void closeSession(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}
