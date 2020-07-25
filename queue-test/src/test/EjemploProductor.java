package test;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class EjemploProductor implements ExceptionListener {



    void processProducer(){

        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

            Connection connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("testQueue");

            MessageProducer producer = session.createProducer(destination);

            String msg = "Test message";

            TextMessage message = session.createTextMessage(msg);

            producer.send(message);

            session.close();
            connection.close();

        } catch (JMSException e){}

    }




    public synchronized void onException(JMSException ex){
        System.out.println(ex.getMessage());
    }

    public static void main(String args[]){
        new EjemploProductor().processProducer();
    }

}
