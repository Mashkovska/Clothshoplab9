package com.company.persistence.dao;

import com.company.model.Clothes;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class ClothesDaoImpl extends AbstractDao<Clothes> implements ClothesDao, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Clothes> getEntityClass() {
            return Clothes.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


