i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
 i m p o r t   o r g . j o d a . t i m e . D a t e T i m e ;  
 i m p o r t   o r g . j o d a . t i m e . D a y s ;  
 i m p o r t   o r g . j o d a . t i m e . L o c a l D a t e ;  
 i m p o r t   o r g . j o d a . t i m e . f o r m a t . D a t e T i m e F o r m a t ;  
 i m p o r t   o r g . j o d a . t i m e . f o r m a t . D a t e T i m e F o r m a t t e r ;  
  
  
 p u b l i c   c l a s s   _ 0 7 D a y s B e t w e e n T w o D a y s   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S c a n n e r   i n p u t   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 S y s t e m . o u t . p r i n t ( " F r o m   d a t e   :   " ) ;  
 	         S t r i n g   f i r s t d a t e   =   i n p u t . n e x t L i n e ( ) ;  
 	         S y s t e m . o u t . p r i n t ( " T o   d a t e   :   " ) ;  
 	         S t r i n g   s e c o n d d a t e   =   i n p u t . n e x t L i n e ( ) ;  
  
 	         / /   U s i n g   e x t e r n a l   l i b r a r y   c a l l e d   j o d a   t i m e    
 	         D a t e T i m e F o r m a t t e r   d a t e F o r m a t t e r   =     D a t e T i m e F o r m a t . f o r P a t t e r n ( " d d - M M - y y y " ) ;  
 	         D a t e T i m e   f r o m D a t e =   d a t e F o r m a t t e r . p a r s e D a t e T i m e ( f i r s t d a t e ) ;  
 	         D a t e T i m e   t o D a t e   =   d a t e F o r m a t t e r . p a r s e D a t e T i m e ( s e c o n d d a t e ) ;  
 	         i n t   d a y s B e t w e e n   =   D a y s . d a y s B e t w e e n ( n e w   L o c a l D a t e ( f r o m D a t e ) ,   n e w   L o c a l D a t e ( t o D a t e ) ) . g e t D a y s ( ) ;  
 	         S y s t e m . o u t . p r i n t l n ( d a y s B e t w e e n   *   2 4 ) ;  
 	 	  
 	          
 	        
  
 	 	  
 	 	  
 	 	  
  
 	 	  
 	 }  
  
 }  
 