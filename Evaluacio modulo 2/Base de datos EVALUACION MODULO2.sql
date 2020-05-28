-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-05-27 20:52:23 CLT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE alternativa (
    idalternativa         INTEGER NOT NULL,
    descripcion           VARCHAR2(50 CHAR),
    valorlogico           CHAR(1),
    porcentaje            FLOAT(4),
    pregunta_idpregunta   INTEGER NOT NULL,
    pregunta_test_idtest  INTEGER NOT NULL
);

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_pk PRIMARY KEY ( idalternativa,
                                                pregunta_idpregunta,
                                                pregunta_test_idtest );

CREATE TABLE estudiante (
    rut                  VARCHAR2(10) NOT NULL,
    nombre               VARCHAR2(50 CHAR),
    apellido_p           VARCHAR2(50 CHAR),
    apellido_m           VARCHAR2(50 CHAR),
    programa_idprograma  INTEGER NOT NULL
);

ALTER TABLE estudiante ADD CONSTRAINT estudiante_pk PRIMARY KEY ( rut );

CREATE TABLE pregunta (
    idpregunta   INTEGER NOT NULL,
    enunciado    VARCHAR2(50 CHAR),
    puntaje      FLOAT(4),
    test_idtest  INTEGER NOT NULL
);

ALTER TABLE pregunta ADD CONSTRAINT pregunta_pk PRIMARY KEY ( idpregunta,
                                                              test_idtest );

CREATE TABLE programa (
    idprograma  INTEGER NOT NULL,
    nombre      VARCHAR2(50 CHAR)
);

ALTER TABLE programa ADD CONSTRAINT programa_pk PRIMARY KEY ( idprograma );

CREATE TABLE resultado_test (
    resultado_test        VARCHAR2(10) NOT NULL,
    test_idtest           INTEGER NOT NULL,
    pregunta_idpregunta   INTEGER NOT NULL,
    respuesta             INTEGER,
    puntaje               INTEGER,
    estudiante_rut        VARCHAR2(10) NOT NULL,
    test_idtest1          INTEGER NOT NULL,
    pregunta_idpregunta1  INTEGER NOT NULL,
    pregunta_test_idtest  INTEGER NOT NULL
);

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_pk PRIMARY KEY ( test_idtest,
                                                   resultado_test,
                                                   pregunta_idpregunta,
                                                   estudiante_rut,
                                                   test_idtest1,
                                                   pregunta_idpregunta1,
                                                   pregunta_test_idtest );

CREATE TABLE test (
    idtest               INTEGER NOT NULL,
    nombre               VARCHAR2(50 CHAR),
    descripcion          VARCHAR2(50 CHAR),
    autor                VARCHAR2(50 CHAR),
    fechacreacion        DATE,
    programa_idprograma  INTEGER NOT NULL,
    unidad_id_unidad     INTEGER NOT NULL
);

CREATE UNIQUE INDEX test__idx ON
    test (
        unidad_id_unidad
    ASC );

ALTER TABLE test ADD CONSTRAINT test_pk PRIMARY KEY ( idtest );

CREATE TABLE unidad (
    id_unidad            INTEGER NOT NULL,
    nombre               VARCHAR2(50 CHAR),
    programa_idprograma  INTEGER NOT NULL
);

ALTER TABLE unidad ADD CONSTRAINT unidad_pk PRIMARY KEY ( id_unidad );

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_pregunta_fk FOREIGN KEY ( pregunta_idpregunta,
                                                         pregunta_test_idtest )
        REFERENCES pregunta ( idpregunta,
                              test_idtest );

ALTER TABLE estudiante
    ADD CONSTRAINT estudiante_programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );

ALTER TABLE pregunta
    ADD CONSTRAINT pregunta_test_fk FOREIGN KEY ( test_idtest )
        REFERENCES test ( idtest );

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_estudiante_fk FOREIGN KEY ( estudiante_rut )
        REFERENCES estudiante ( rut );

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_pregunta_fk FOREIGN KEY ( pregunta_idpregunta1,
                                                            pregunta_test_idtest )
        REFERENCES pregunta ( idpregunta,
                              test_idtest );

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_test_fk FOREIGN KEY ( test_idtest1 )
        REFERENCES test ( idtest );

ALTER TABLE test
    ADD CONSTRAINT test_programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );

ALTER TABLE test
    ADD CONSTRAINT test_unidad_fk FOREIGN KEY ( unidad_id_unidad )
        REFERENCES unidad ( id_unidad );

ALTER TABLE unidad
    ADD CONSTRAINT unidad_programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             1
-- ALTER TABLE                             16
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
