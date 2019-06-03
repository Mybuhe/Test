package com.my.test.test;


public class test {
    private static Logger logger = Logger.getLogger(MyBatisTest.class);
    @Test
    public void ss(){
        logger.debug("testFindAddressListByUserId start");
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            session = factory.openSession();
            List<User> users = session.getMapper(UserDao.class).
            for(User user:users) {
                logger.info(user.getBankCard().getCardName());
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("事务回滚");
            session.rollback();
        }finally {
            if(null != session) {
                session.close();
            }
            logger.debug("testFindAddressListByUserId end");
        }
    }

}
