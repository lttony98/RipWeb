package com.dao;

import com.entities.QuestionCollection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository(value = "questionCollectionDAO")
@Transactional(rollbackOn = Exception.class)
public class QuestionCollectionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public QuestionCollection getQuestionCollectionById(int questionCollectionID) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "SELECT * FROM QuestionCollection WHERE id="+questionCollectionID;
		QuestionCollection questionCollection = (QuestionCollection) session.createSQLQuery(sql).addEntity(QuestionCollection.class).uniqueResult();
//		QuestionCollection questionCollection = session.load(QuestionCollection.class, questionCollectionID);
		tx.commit();
		return  questionCollection;
	}

//	public ArrayList<QuestionEntity> getQuestionsByCollectionId(int questionCollectionID) {
//		Session session = sessionFactory.getCurrentSession();
//		Transaction tx = session.beginTransaction();
//		String sql = "SELECT * FROM QuestionCollection WHERE id="+questionCollectionID;
//		ArrayList<QuestionEntity> result = (ArrayList<QuestionEntity>) session.createSQLQuery(sql).list();
//		tx.commit();
//		return result;
//	}

}
