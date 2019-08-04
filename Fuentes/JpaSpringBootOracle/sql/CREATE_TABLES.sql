CREATE TABLE PERSONA 
(
  IDPERSONA NUMERIC NOT NULL 
, NOMBRE VARCHAR2(50) 
, APELLIDO VARCHAR2(100) 
, DIRECCION VARCHAR2(200) 
, CONSTRAINT PERSONA_PK PRIMARY KEY 
  (
    IDPERSONA 
  )
  ENABLE 
);

INSERT INTO "TESTER"."PERSONA" (IDPERSONA, NOMBRE, APELLIDO, DIRECCION) VALUES ('0', 'Camilo', 'Contreras', 'fraycamilo190');
INSERT INTO "TESTER"."PERSONA" (IDPERSONA, NOMBRE, APELLIDO, DIRECCION) VALUES ('1', 'Bernardo', 'Caceres', 'fraycamilo190');
INSERT INTO "TESTER"."PERSONA" (IDPERSONA, NOMBRE, APELLIDO, DIRECCION) VALUES ('2', 'Nicole', 'Gallardo', 'fraycamilo190');
INSERT INTO "TESTER"."PERSONA" (IDPERSONA, NOMBRE, APELLIDO, DIRECCION) VALUES ('3', 'Jose', 'Contreras', 'Andes4165');)

COMMIT;