package com.file.upload.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.file.upload.model.UploadFile;
@Repository
public class UploadFileDaoImpl implements UploadFileDao {
@Autowired
private SessionFactory sessionFactory;
 
public UploadFileDaoImpl() {
}

public UploadFileDaoImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
}

@Override
@Transactional
public void save(UploadFile uploadFile) {
    sessionFactory.getCurrentSession().save(uploadFile);
}
}