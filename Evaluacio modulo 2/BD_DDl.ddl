-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-05-26 20:37:28 CLT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE alternativa (
    id_alternativa        INTEGER NOT NULL,
    descripcion           VARCHAR2(200 CHAR) NOT NULL,
    valor_logico          CHAR(1 BYTE),
    pregunta_id_pregunta  INTEGER NOT NULL
);

ALTER TABLE alternativa ADD CONSTRAINT alternativa_pk PRIMARY KEY ( id_alternativa,
                                                                    pregunta_id_pregunta );

CREATE TABLE estudiante (
    rut                   VARCHAR2(10) NOT NULL,
    nombre                VARCHAR2(100 CHAR) NOT NULL,
    apellido_paterno      VARCHAR2(20 CHAR),
    apellido_materno      VARCHAR2(20 CHAR),
    programa_id_programa  INTEGER NOT NULL
);

ALTER TABLE estudiante ADD CONSTRAINT estudiante_pk PRIMARY KEY ( rut );

CREATE TABLE pregunta (
    id_pregunta   INTEGER NOT NULL,
    enunciado     VARCHAR2(500),
    puntaje       FLOAT(1),
    test_id_test  INTEGER NOT NULL
);

ALTER TABLE pregunta ADD CONSTRAINT pregunta_pk PRIMARY KEY ( id_pregunta );

CREATE TABLE programa (
    id_programa  INTEGER NOT NULL,
    nombre       VARCHAR2(50)
);

ALTER TABLE programa ADD CONSTRAINT programa_pk PRIMARY KEY ( id_programa );

CREATE TABLE resultado_test (
    id_respuesta          INTEGER NOT NULL,
    respuesta             VARCHAR2(300),
    puntaje               FLOAT,
    pregunta_id_pregunta  INTEGER NOT NULL,
    test_id_test          INTEGER NOT NULL,
    estudiante_rut        VARCHAR2(10) NOT NULL
);

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_pk PRIMARY KEY ( id_respuesta,
                                                   pregunta_id_pregunta,
                                                   test_id_test,
                                                   estudiante_rut );

CREATE TABLE test (
    id_test               INTEGER NOT NULL,
    nombre                VARCHAR2(150),
    descripcion           VARCHAR2(300),
    autor                 VARCHAR2(120),
    fecha_creacion        DATE,
    programa_id_programa  INTEGER NOT NULL,
    unidad_id_unidad      INTEGER NOT NULL,
    id_programa           INTEGER NOT NULL
);

CREATE UNIQUE INDEX test__idx ON
    test (
        unidad_id_unidad
    ASC );

CREATE UNIQUE INDEX test__idxv1 ON
    test (
        unidad_id_unidad
    ASC,
        id_programa
    ASC );

ALTER TABLE test ADD CONSTRAINT test_pk PRIMARY KEY ( id_test );

CREATE TABLE unidad (
    id_unidad             INTEGER NOT NULL,
    nombre_unidad         VARCHAR2(100),
    programa_id_programa  INTEGER NOT NULL
);

ALTER TABLE unidad ADD CONSTRAINT unidad_pk PRIMARY KEY ( id_unidad,
                                                          programa_id_programa );

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_pregunta_fk FOREIGN KEY ( pregunta_id_pregunta )
        REFERENCES pregunta ( id_pregunta );

ALTER TABLE estudiante
    ADD CONSTRAINT estudiante_programa_fk FOREIGN KEY ( programa_id_programa )
        REFERENCES programa ( id_programa );

ALTER TABLE pregunta
    ADD CONSTRAINT pregunta_test_fk FOREIGN KEY ( test_id_test )
        REFERENCES test ( id_test );

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_estudiante_fk FOREIGN KEY ( estudiante_rut )
        REFERENCES estudiante ( rut );

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_pregunta_fk FOREIGN KEY ( pregunta_id_pregunta )
        REFERENCES pregunta ( id_pregunta );

ALTER TABLE resultado_test
    ADD CONSTRAINT resultado_test_test_fk FOREIGN KEY ( test_id_test )
        REFERENCES test ( id_test );

ALTER TABLE test
    ADD CONSTRAINT test_programa_fk FOREIGN KEY ( programa_id_programa )
        REFERENCES programa ( id_programa );

ALTER TABLE test
    ADD CONSTRAINT test_unidad_fk FOREIGN KEY ( unidad_id_unidad,
                                                id_programa )
        REFERENCES unidad ( id_unidad,
                            programa_id_programa );

ALTER TABLE unidad
    ADD CONSTRAINT unidad_programa_fk FOREIGN KEY ( programa_id_programa )
        REFERENCES programa ( id_programa );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             2
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
