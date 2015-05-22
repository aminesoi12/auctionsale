/*==============================================================================*/
/* SGBD Name: POSTGRESQL             		               		      		    */
/* Creation Date: 21/05/2015	                              			        */
/* OPENPM database rollback script											    */
/* Autor: Aroua SOUABNI							                                */
/*==============================================================================*/
 

/*==============================================================================*/
/* Sequences rollback				               		      				    */
/*==============================================================================*/
 
 DROP SEQUENCE CATEGORY_SEQ;
 DROP SEQUENCE PRODUCT_SEQ;
 DROP SEQUENCE PROPOSAL_SEQ;
 DROP SEQUENCE USER_ROLE_SEQ;
 
 
/*==============================================================================*/
/* Tables rollback					               		      				    */
/*==============================================================================*/
 
DROP TABLE PROPOSAL;
DROP TABLE PRODUCT;
DROP TABLE USER_ROLE;
DROP TABLE APP_USER;
DROP TABLE CATEGORY;


COMMIT;